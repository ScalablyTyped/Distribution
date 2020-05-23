package typings.loopback.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Created[T] extends js.Object {
  var created: Boolean
  var instance: T
}

object Created {
  @scala.inline
  def apply[T](created: Boolean, instance: T): Created[T] = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Created[T]]
  }
}

