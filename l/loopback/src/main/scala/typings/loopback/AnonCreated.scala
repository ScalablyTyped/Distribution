package typings.loopback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreated[T] extends js.Object {
  var created: Boolean
  var instance: T
}

object AnonCreated {
  @scala.inline
  def apply[T](created: Boolean, instance: T): AnonCreated[T] = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreated[T]]
  }
}

