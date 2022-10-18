package typings.katex

import typings.katex.katexStrings.$
import typings.katex.katexStrings.DollarDollar
import typings.katex.katexStrings.`[`
import typings.katex.katexStrings.`]`
import typings.std.DocumentFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contribKatex2texMod {
  
  @JSImport("katex/contrib/katex2tex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(fragment: DocumentFragment): DocumentFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fragment.asInstanceOf[js.Any]).asInstanceOf[DocumentFragment]
  inline def default(fragment: DocumentFragment, copyDelimiters: CopyDelimiters): DocumentFragment = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fragment.asInstanceOf[js.Any], copyDelimiters.asInstanceOf[js.Any])).asInstanceOf[DocumentFragment]
  
  trait CopyDelimiters extends StObject {
    
    var display: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`]
    
    var `inline`: js.Tuple2[$ | (/* ( */ String), $ | (/* ) */ String)]
  }
  object CopyDelimiters {
    
    inline def apply(
      display: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`],
      `inline`: js.Tuple2[$ | (/* ( */ String), $ | (/* ) */ String)]
    ): CopyDelimiters = {
      val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyDelimiters]
    }
    
    extension [Self <: CopyDelimiters](x: Self) {
      
      inline def setDisplay(value: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setInline(value: js.Tuple2[$ | (/* ( */ String), $ | (/* ) */ String)]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    }
  }
}
