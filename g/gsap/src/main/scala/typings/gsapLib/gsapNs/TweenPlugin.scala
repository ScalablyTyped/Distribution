package typings
package gsapLib.gsapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenPlugin extends js.Object {
  def activate(plugins: js.Array[_]): scala.Boolean
}

object TweenPlugin {
  @scala.inline
  def apply(activate: js.Array[_] => scala.Boolean): TweenPlugin = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate))
  
    __obj.asInstanceOf[TweenPlugin]
  }
}

