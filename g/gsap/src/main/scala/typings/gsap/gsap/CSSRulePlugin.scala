package typings.gsap.gsap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSRulePlugin
  extends StObject
     with TweenPlugin {
  
  def getRule(selector: String): js.Object
}
object CSSRulePlugin {
  
  @scala.inline
  def apply(activate: js.Array[js.Any] => Boolean, getRule: String => js.Object): CSSRulePlugin = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), getRule = js.Any.fromFunction1(getRule))
    __obj.asInstanceOf[CSSRulePlugin]
  }
  
  @scala.inline
  implicit class CSSRulePluginMutableBuilder[Self <: CSSRulePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetRule(value: String => js.Object): Self = StObject.set(x, "getRule", js.Any.fromFunction1(value))
  }
}
