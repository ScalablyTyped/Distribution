package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSRulePlugin extends TweenPlugin {
  def getRule(selector: String): js.Object
}

object CSSRulePlugin {
  @scala.inline
  def apply(activate: js.Array[_] => Boolean, getRule: String => js.Object): CSSRulePlugin = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate), getRule = js.Any.fromFunction1(getRule))
  
    __obj.asInstanceOf[CSSRulePlugin]
  }
}

