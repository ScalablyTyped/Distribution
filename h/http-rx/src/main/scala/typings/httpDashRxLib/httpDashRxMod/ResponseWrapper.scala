package typings
package httpDashRxLib.httpDashRxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseWrapper extends js.Object {
  var body: js.Any
  var response: requestLib.requestMod.requestNs.Response
}

object ResponseWrapper {
  @scala.inline
  def apply(body: js.Any, response: requestLib.requestMod.requestNs.Response): ResponseWrapper = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("response")(response)
    __obj.asInstanceOf[ResponseWrapper]
  }
}

