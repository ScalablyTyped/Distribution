package typings.kosCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPayload[T] extends js.Object {
  var payload: T
}

object AnonPayload {
  @scala.inline
  def apply[T](payload: T): AnonPayload[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPayload[T]]
  }
}

