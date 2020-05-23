package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultObservable extends Destroyable {
  def setToDefault(): js.Any
}

object DefaultObservable {
  @scala.inline
  def apply(destroy: () => js.Any, setToDefault: () => js.Any): DefaultObservable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), setToDefault = js.Any.fromFunction0(setToDefault))
    __obj.asInstanceOf[DefaultObservable]
  }
}

