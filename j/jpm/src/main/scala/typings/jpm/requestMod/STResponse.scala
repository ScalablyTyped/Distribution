package typings.jpm.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait STResponse[T] extends js.Object {
  var json: T
}

object STResponse {
  @scala.inline
  def apply[T](json: T): STResponse[T] = {
    val __obj = js.Dynamic.literal(json = json.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[STResponse[T]]
  }
}

