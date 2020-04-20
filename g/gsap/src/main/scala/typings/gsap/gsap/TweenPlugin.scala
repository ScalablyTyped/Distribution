package typings.gsap.gsap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TweenPlugin extends js.Object {
  def activate(plugins: js.Array[_]): Boolean
}

object TweenPlugin {
  @scala.inline
  def apply(activate: js.Array[_] => Boolean): TweenPlugin = {
    val __obj = js.Dynamic.literal(activate = js.Any.fromFunction1(activate))
    __obj.asInstanceOf[TweenPlugin]
  }
}

