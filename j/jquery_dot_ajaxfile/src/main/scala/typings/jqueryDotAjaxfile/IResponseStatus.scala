package typings.jqueryDotAjaxfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponseStatus extends js.Object {
  var code: Double
  var isSuccess: Boolean
  var text: String
}

object IResponseStatus {
  @scala.inline
  def apply(code: Double, isSuccess: Boolean, text: String): IResponseStatus = {
    val __obj = js.Dynamic.literal(code = code, isSuccess = isSuccess, text = text)
  
    __obj.asInstanceOf[IResponseStatus]
  }
}

