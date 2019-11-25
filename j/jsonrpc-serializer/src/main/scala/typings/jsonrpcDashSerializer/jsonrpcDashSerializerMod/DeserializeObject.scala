package typings.jsonrpcDashSerializer.jsonrpcDashSerializerMod

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
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeserializeObject]
  }
}

@JSImport("jsonrpc-serializer", "deserializeObject")
@js.native
object deserializeObject extends js.Object {
  def apply(msg: PayloadObject): DeserializeObject = js.native
}

