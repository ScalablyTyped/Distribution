package typings
package gsapLib.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSSRulePlugin extends TweenPlugin {
  def getRule(selector: java.lang.String): js.Object
}

object CSSRulePlugin {
  @scala.inline
  def apply(
    activate: js.Function1[js.Array[_], scala.Boolean],
    getRule: js.Function1[java.lang.String, js.Object]
  ): CSSRulePlugin = {
    val __obj = js.Dynamic.literal(activate = activate, getRule = getRule)
  
    __obj.asInstanceOf[CSSRulePlugin]
  }
}

