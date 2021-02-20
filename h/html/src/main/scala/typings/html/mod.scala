package typings.html

import typings.html.htmlStrings.`end-expand`
import typings.html.htmlStrings.collapse
import typings.html.htmlStrings.expand
import typings.html.htmlStrings.keep
import typings.html.htmlStrings.normal
import typings.html.htmlStrings.separate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html", "prettyPrint")
  @js.native
  def prettyPrint(htmlSource: String): String = js.native
  @JSImport("html", "prettyPrint")
  @js.native
  def prettyPrint(htmlSource: String, options: PrintOptions): String = js.native
  
  @js.native
  trait PrintOptions extends StObject {
    
    /**
      * Put braces on the same line as control statements (`collapse`),
      * or put braces on own line (Allman / ANSI style, `expand`),
      * or just put end braces on own line (`end-expand`). Default: `collapse`.
      */
    var brace_style: js.UndefOr[collapse | expand | `end-expand`] = js.native
    
    /** character to indent with. Default: " " (space). */
    var indent_char: js.UndefOr[String] = js.native
    
    /** Default: `normal`. */
    var indent_scripts: js.UndefOr[keep | separate | normal] = js.native
    
    /** indentation size. Default: 4. */
    var indent_size: js.UndefOr[Double] = js.native
    
    /** Maximum amount of characters per line. Default: 70. */
    var max_char: js.UndefOr[Double] = js.native
    
    /** list of tags, that shouldn't be reformatted. Defaults to inline tags. */
    var unformatted: js.UndefOr[js.Array[String]] = js.native
  }
  object PrintOptions {
    
    @scala.inline
    def apply(): PrintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintOptions]
    }
    
    @scala.inline
    implicit class PrintOptionsMutableBuilder[Self <: PrintOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBrace_style(value: collapse | expand | `end-expand`): Self = StObject.set(x, "brace_style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrace_styleUndefined: Self = StObject.set(x, "brace_style", js.undefined)
      
      @scala.inline
      def setIndent_char(value: String): Self = StObject.set(x, "indent_char", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_charUndefined: Self = StObject.set(x, "indent_char", js.undefined)
      
      @scala.inline
      def setIndent_scripts(value: keep | separate | normal): Self = StObject.set(x, "indent_scripts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_scriptsUndefined: Self = StObject.set(x, "indent_scripts", js.undefined)
      
      @scala.inline
      def setIndent_size(value: Double): Self = StObject.set(x, "indent_size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndent_sizeUndefined: Self = StObject.set(x, "indent_size", js.undefined)
      
      @scala.inline
      def setMax_char(value: Double): Self = StObject.set(x, "max_char", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax_charUndefined: Self = StObject.set(x, "max_char", js.undefined)
      
      @scala.inline
      def setUnformatted(value: js.Array[String]): Self = StObject.set(x, "unformatted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnformattedUndefined: Self = StObject.set(x, "unformatted", js.undefined)
      
      @scala.inline
      def setUnformattedVarargs(value: String*): Self = StObject.set(x, "unformatted", js.Array(value :_*))
    }
  }
}
