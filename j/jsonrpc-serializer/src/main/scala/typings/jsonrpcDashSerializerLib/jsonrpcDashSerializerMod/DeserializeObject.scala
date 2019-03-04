package typings
package jsonrpcDashSerializerLib.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeserializeObject extends js.Object {
  var payload: RequestPayloadObject | NotificationPayloadObject | SuccessPayloadObject | ErrorPayloadObject
  var `type`: PayloadType
}

object DeserializeObject {
  @scala.inline
  def apply(
    payload: RequestPayloadObject | NotificationPayloadObject | SuccessPayloadObject | ErrorPayloadObject,
    `type`: PayloadType
  ): DeserializeObject = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeserializeObject]
  }
}

