package typings
package ionicLib.definitionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response[T /* <: js.Object */] extends APIResponseSuccess {
  @JSName("data")
  var data_Response: T
}

object Response {
  @scala.inline
  def apply[T /* <: js.Object */](data: T, meta: APIResponseMeta): Response[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.updateDynamic("meta")(meta)
    __obj.asInstanceOf[Response[T]]
  }
}

