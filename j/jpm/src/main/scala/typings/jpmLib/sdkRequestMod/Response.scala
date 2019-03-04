package typings
package jpmLib.sdkRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends BaseResponse {
  var json: js.Object
}

object Response {
  @scala.inline
  def apply(
    anonymous: scala.Boolean,
    headers: js.Object,
    json: js.Object,
    status: scala.Double,
    statusText: java.lang.String,
    text: java.lang.String,
    url: java.lang.String
  ): Response = {
    val __obj = js.Dynamic.literal(anonymous = anonymous, headers = headers, json = json, status = status, statusText = statusText, text = text, url = url)
  
    __obj.asInstanceOf[Response]
  }
}

