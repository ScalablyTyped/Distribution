package typings
package imgurDashRestDashApiLib.ImgurRestApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: java.lang.String
  var method: java.lang.String
  var request: java.lang.String
}

object Error {
  @scala.inline
  def apply(error: java.lang.String, method: java.lang.String, request: java.lang.String): Error = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[Error]
  }
}

