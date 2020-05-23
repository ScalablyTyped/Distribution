package typings.kosCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Payload[T] extends js.Object {
  var payload: T
}

object Payload {
  @scala.inline
  def apply[T](payload: T): Payload[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Payload[T]]
  }
}

