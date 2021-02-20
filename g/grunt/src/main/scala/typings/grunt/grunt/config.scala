package typings.grunt.grunt

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object config {
  
  /**
    * {@link http://gruntjs.com/api/grunt.config}
    */
  @js.native
  trait ConfigModule extends StObject {
    
    def apply(prop: String): js.Any = js.native
    /**
      * Get or set a value from the project's Grunt configuration.
      * This method serves as an alias to other methods;
      * if two arguments are passed, grunt.config.set is called,
      * otherwise grunt.config.get is called.
      */
    def apply(prop: String, value: js.Any): js.Any = js.native
    
    /**
      * Escape '.' dots in the given propString. This should be used for property names that contain dots.
      */
    def escape(propString: String): String = js.native
    
    def get(): ConfigModule = js.native
    /**
      * Get a value from the project's Grunt configuration.
      * If prop is specified, that property's value is returned, or null if that property is not defined.
      * If prop isn't specified, a copy of the entire config object is returned.
      * Templates strings will be recursively processed using the grunt.config.process method.
      *
      * @note Although this accepts a generic type, you may still get the wrong typed value.
      */
    def get[T](prop: String): T = js.native
    
    /**
      * Get a raw value from the project's Grunt configuration, without processing <% %> template strings.
      * If prop is specified, that property's value is returned, or null if that property is not defined.
      * If prop isn't specified, a copy of the entire config object is returned.
      */
    def getRaw[T](prop: String): T = js.native
    
    /**
      * Initialize a configuration object for the current project.
      * The specified configObject is used by tasks and can be accessed using the grunt.config method.
      * Nearly every project's Gruntfile will call this method.
      */
    def init(config: IProjectConfig): Unit = js.native
    
    /**
      * Recursively merges properties of the specified configObject into the current project configuration.
      * You can use this method to append configuration options, targets, etc., to already defined tasks.
      */
    def merge[T](configObject: T): Unit = js.native
    
    /**
      * Process a value, recursively expanding <% %> templates (via the grunt.template.process method)
      * in the context of the Grunt config, as they are encountered.
      * this method is called automatically by grunt.config.get but not by grunt.config.getRaw.
      *
      * If any retrieved value is entirely a single '<%= foo %>' or '<%= foo.bar %>' template string,
      * and the specified foo or foo.bar property is a non-string (and not null or undefined) value,
      * it will be expanded to the actual value. That, combined with grunt's task system automatically
      * flattening arrays, can be extremely useful.
      */
    def process[T](value: String): T = js.native
    
    /**
      * Fail the current task if one or more required config properties is missing, null or undefined.
      * One or more string or array config properties may be specified.
      */
    def requires(prop: String, andProps: String*): Unit = js.native
    def requires(prop: js.Array[String], andProps: js.Array[String]*): Unit = js.native
    
    /**
      * Set a value into the project's Grunt configuration.
      * @note any specified <% %> template strings will only be processed when config data is retrieved.
      */
    def set[T](prop: String, value: T): T = js.native
  }
  
  /**
    * {@link http://gruntjs.com/sample-gruntfile}
    */
  type IProjectConfig = StringDictionary[js.Any]
}
