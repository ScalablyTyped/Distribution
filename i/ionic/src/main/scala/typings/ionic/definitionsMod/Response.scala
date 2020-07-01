package typings.ionic.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T /* <: js.Object */] extends APIResponseSuccess {
  @JSName("data")
  var data_Response: T
}

object Response {
  @scala.inline
  def apply[/* <: js.Object */ T](data: T, meta: APIResponseMeta): Response[T] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response[T]]
  }
}

