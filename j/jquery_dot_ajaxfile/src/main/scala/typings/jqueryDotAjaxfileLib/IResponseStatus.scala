package typings
package jqueryDotAjaxfileLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponseStatus extends js.Object {
  var code: scala.Double
  var isSuccess: scala.Boolean
  var text: java.lang.String
}

object IResponseStatus {
  @scala.inline
  def apply(code: scala.Double, isSuccess: scala.Boolean, text: java.lang.String): IResponseStatus = {
    val __obj = js.Dynamic.literal(code = code, isSuccess = isSuccess, text = text)
  
    __obj.asInstanceOf[IResponseStatus]
  }
}

