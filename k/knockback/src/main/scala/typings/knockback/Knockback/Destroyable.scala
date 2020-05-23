package typings.knockback.Knockback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Destroyable extends js.Object {
  def destroy(): js.Any
}

object Destroyable {
  @scala.inline
  def apply(destroy: () => js.Any): Destroyable = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[Destroyable]
  }
}

