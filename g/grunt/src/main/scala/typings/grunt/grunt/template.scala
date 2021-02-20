package typings.grunt.grunt

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object template {
  
  @js.native
  trait TemplateModule extends StObject {
    
    /**
      * Add a named set of Lo-Dash template delimiters.
      *
      * You probably won't need to use this method, because the built-in delimiters should be sufficient,
      * but you could always add {% %} or [% %] style delimiters.
      */
    def addDelimiters(name: String, opener: String, closer: String): Unit = js.native
    
    /**
      * Format a date using the dateformat library.
      * {@link https://github.com/felixge/node-dateformat}
      *
      * @note if you don't include the mask argument, dateFormat.masks.default is used
      */
    def date(): String = js.native
    def date(date: js.UndefOr[scala.Nothing], format: String): String = js.native
    def date(date: String): String = js.native
    def date(date: String, format: String): String = js.native
    def date(date: Double): String = js.native
    def date(date: Double, format: String): String = js.native
    def date(date: Date): String = js.native
    def date(date: Date, format: String): String = js.native
    
    /**
      * Process a Lo-Dash template string.
      *
      * The template argument will be processed recursively until there are no more templates to process.
      *
      * The default data object is the entire config object, but if options.data is set, that object will
      * be used instead. The default template delimiters are <% %> but if options.delimiters is set to a
      * custom delimiter name, those template delimiters will be used instead.
      *
      * Inside templates, the grunt object is exposed so that you can do things like:
      *     <%= grunt.template.today('yyyy') %>
      *
      * @note if the data object already has a grunt property, the grunt API will not be accessible in templates.
      */
    def process(template: String): js.Function1[/* options */ js.Any, String] = js.native
    def process(template: String, options: js.Any): String = js.native
    
    /**
      * Set the Lo-Dash template delimiters to a predefined set in case you grunt.util._.template
      * needs to be called manually.
      *
      * The config delimiters <% %> are included by default.
      */
    def setDelimiters(name: String): Unit = js.native
    
    /**
      * Format today's date using the dateformat library using the current date and time.
      * {@link https://github.com/felixge/node-dateformat}
      *
      * @note if you don't include the mask argument, dateFormat.masks.default is used
      */
    def today(): String = js.native
    def today(format: String): String = js.native
  }
}
