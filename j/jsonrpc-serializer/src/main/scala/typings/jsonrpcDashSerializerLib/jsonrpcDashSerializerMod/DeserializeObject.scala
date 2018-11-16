package typings
package jsonrpcDashSerializerLib.jsonrpcDashSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DeserializeObject extends js.Object {
  var payload: RequestPayloadObject | NotificationPayloadObject | SuccessPayloadObject | ErrorPayloadObject
  var `type`: PayloadType
}

