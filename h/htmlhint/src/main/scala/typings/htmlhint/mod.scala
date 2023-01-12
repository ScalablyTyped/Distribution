package typings.htmlhint

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.htmlhint.htmlparserMod.default
import typings.htmlhint.typesMod.Hint
import typings.htmlhint.typesMod.Rule
import typings.htmlhint.typesMod.Ruleset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("htmlhint", "HTMLHint")
  @js.native
  val HTMLHint: HTMLHintCore = js.native
  
  @JSImport("htmlhint", "HTMLParser")
  @js.native
  open class HTMLParser () extends default
  
  object HTMLRules extends Shortcut {
    
    @JSImport("htmlhint", "HTMLRules.default")
    @js.native
    val default: js.Array[Rule] = js.native
    
    type _To = js.Array[Rule]
    
    /* This means you don't have to write `default`, but can instead just say `HTMLRules.foo` */
    override def _to: js.Array[Rule] = default
  }
  
  @JSImport("htmlhint", "Reporter")
  @js.native
  open class Reporter protected ()
    extends typings.htmlhint.reporterMod.default {
    def this(html: String, ruleset: Ruleset) = this()
  }
  
  trait FormatOptions extends StObject {
    
    var colors: js.UndefOr[Boolean] = js.undefined
    
    var indent: js.UndefOr[Double] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      inline def setColors(value: Boolean): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
      
      inline def setIndentUndefined: Self = StObject.set(x, "indent", js.undefined)
    }
  }
  
  @js.native
  trait HTMLHintCore extends StObject {
    
    def addRule(rule: Rule): Unit = js.native
    
    val defaultRuleset: Ruleset = js.native
    
    def format(arrMessages: js.Array[Hint]): js.Array[String] = js.native
    def format(arrMessages: js.Array[Hint], options: FormatOptions): js.Array[String] = js.native
    
    var rules: StringDictionary[Rule] = js.native
    
    def verify(html: String): js.Array[Hint] = js.native
    def verify(html: String, ruleset: Ruleset): js.Array[Hint] = js.native
  }
}
