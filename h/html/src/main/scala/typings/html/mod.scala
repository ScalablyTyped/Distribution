package typings.html

import typings.html.htmlStrings.`end-expand`
import typings.html.htmlStrings.collapse
import typings.html.htmlStrings.expand
import typings.html.htmlStrings.keep
import typings.html.htmlStrings.normal
import typings.html.htmlStrings.separate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prettyPrint(htmlSource: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(htmlSource.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def prettyPrint(htmlSource: String, options: PrintOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("prettyPrint")(htmlSource.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait PrintOptions extends StObject {
    
    /**
      * Put braces on the same line as control statements (`collapse`),
      * or put braces on own line (Allman / ANSI style, `expand`),
      * or just put end braces on own line (`end-expand`). Default: `collapse`.
      */
    var brace_style: js.UndefOr[collapse | expand | `end-expand`] = js.undefined
    
    /** character to indent with. Default: " " (space). */
    var indent_char: js.UndefOr[String] = js.undefined
    
    /** Default: `normal`. */
    var indent_scripts: js.UndefOr[keep | separate | normal] = js.undefined
    
    /** indentation size. Default: 4. */
    var indent_size: js.UndefOr[Double] = js.undefined
    
    /** Maximum amount of characters per line. Default: 70. */
    var max_char: js.UndefOr[Double] = js.undefined
    
    /** list of tags, that shouldn't be reformatted. Defaults to inline tags. */
    var unformatted: js.UndefOr[js.Array[String]] = js.undefined
  }
  object PrintOptions {
    
    inline def apply(): PrintOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrintOptions] (val x: Self) extends AnyVal {
      
      inline def setBrace_style(value: collapse | expand | `end-expand`): Self = StObject.set(x, "brace_style", value.asInstanceOf[js.Any])
      
      inline def setBrace_styleUndefined: Self = StObject.set(x, "brace_style", js.undefined)
      
      inline def setIndent_char(value: String): Self = StObject.set(x, "indent_char", value.asInstanceOf[js.Any])
      
      inline def setIndent_charUndefined: Self = StObject.set(x, "indent_char", js.undefined)
      
      inline def setIndent_scripts(value: keep | separate | normal): Self = StObject.set(x, "indent_scripts", value.asInstanceOf[js.Any])
      
      inline def setIndent_scriptsUndefined: Self = StObject.set(x, "indent_scripts", js.undefined)
      
      inline def setIndent_size(value: Double): Self = StObject.set(x, "indent_size", value.asInstanceOf[js.Any])
      
      inline def setIndent_sizeUndefined: Self = StObject.set(x, "indent_size", js.undefined)
      
      inline def setMax_char(value: Double): Self = StObject.set(x, "max_char", value.asInstanceOf[js.Any])
      
      inline def setMax_charUndefined: Self = StObject.set(x, "max_char", js.undefined)
      
      inline def setUnformatted(value: js.Array[String]): Self = StObject.set(x, "unformatted", value.asInstanceOf[js.Any])
      
      inline def setUnformattedUndefined: Self = StObject.set(x, "unformatted", js.undefined)
      
      inline def setUnformattedVarargs(value: String*): Self = StObject.set(x, "unformatted", js.Array(value*))
    }
  }
}
