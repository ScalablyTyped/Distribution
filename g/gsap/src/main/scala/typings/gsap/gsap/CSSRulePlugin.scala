package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSSRulePlugin extends TweenPlugin {
  
  def getRule(selector: String): js.Object = js.native
}
object CSSRulePlugin {
  
  @scala.inline
  def apply(activate: js.Array[_] => Boolean, getRule: String => js.Object): CSSRulePlugin = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), getRule = js.Any.fromFunction1(getRule))
    __obj.asInstanceOf[CSSRulePlugin]
  }
  
  @scala.inline
  implicit class CSSRulePluginOps[Self <: CSSRulePlugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetRule(value: String => js.Object): Self = this.set("getRule", js.Any.fromFunction1(value))
  }
}
