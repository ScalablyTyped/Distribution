package typings.katex

import typings.katex.katexStrings.$
import typings.katex.katexStrings.DollarDollar
import typings.katex.katexStrings.Leftparenthesis
import typings.katex.katexStrings.Rightparenthesis
import typings.katex.katexStrings.`[`
import typings.katex.katexStrings.`]`
import typings.std.DocumentFragment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object katex2texMod {
  
  @JSImport("katex/contrib/copy-tex/katex2tex", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(fragment: DocumentFragment): DocumentFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(fragment.asInstanceOf[js.Any]).asInstanceOf[DocumentFragment]
  @scala.inline
  def default(fragment: DocumentFragment, copyDelimiters: CopyDelimiters): DocumentFragment = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(fragment.asInstanceOf[js.Any], copyDelimiters.asInstanceOf[js.Any])).asInstanceOf[DocumentFragment]
  
  trait CopyDelimiters extends StObject {
    
    var display: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`]
    
    var `inline`: js.Tuple2[$ | Leftparenthesis, $ | Rightparenthesis]
  }
  object CopyDelimiters {
    
    @scala.inline
    def apply(
      display: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`],
      `inline`: js.Tuple2[$ | Leftparenthesis, $ | Rightparenthesis]
    ): CopyDelimiters = {
      val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CopyDelimiters]
    }
    
    @scala.inline
    implicit class CopyDelimitersMutableBuilder[Self <: CopyDelimiters] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplay(value: js.Tuple2[DollarDollar | `[`, DollarDollar | `]`]): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInline(value: js.Tuple2[$ | Leftparenthesis, $ | Rightparenthesis]): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    }
  }
}
