package typings.grunt.grunt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object option {
  
  /**
    * {@link http://gruntjs.com/api/grunt.option}
    */
  @js.native
  trait OptionModule extends StObject {
    
    def apply[T](key: String): T = js.native
    /**
      * Gets or sets an option.
      * Boolean options can be negated by prepending no- onto the key. For example:
      *
      * grunt.option('staging', false);
      * var isDev = grunt.option('no-staging');
      * assert(isDev === true)
      */
    def apply[T](key: String, value: T): Unit = js.native
    
    /**
      * Returns the options as an array of command line parameters.
      */
    var flags: js.Array[IFlag] = js.native
    
    /**
      * Initialize grunt.option.
      * If initObject is omitted option will be initialized to an empty object
      * otherwise will be set to initObject.
      */
    def init(): Unit = js.native
    def init(initObject: Any): Unit = js.native
  }
}
