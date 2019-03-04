package typings
package jpmLib.sdkRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseResponse extends js.Object {
  var anonymous: scala.Boolean
  var headers: js.Object
  var status: scala.Double
  var statusText: java.lang.String
  var text: java.lang.String
  var url: java.lang.String
}

object BaseResponse {
  @scala.inline
  def apply(
    anonymous: scala.Boolean,
    headers: js.Object,
    status: scala.Double,
    statusText: java.lang.String,
    text: java.lang.String,
    url: java.lang.String
  ): BaseResponse = {
    val __obj = js.Dynamic.literal(anonymous = anonymous, headers = headers, status = status, statusText = statusText, text = text, url = url)
  
    __obj.asInstanceOf[BaseResponse]
  }
}

