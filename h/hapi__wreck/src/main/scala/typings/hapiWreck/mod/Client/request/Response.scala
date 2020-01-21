package typings.hapiWreck.mod.Client.request

import typings.node.httpMod.IncomingMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T] extends js.Object {
  var payload: T
  var res: IncomingMessage
}

object Response {
  @scala.inline
  def apply[T](payload: T, res: IncomingMessage): Response[T] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Response[T]]
  }
}

