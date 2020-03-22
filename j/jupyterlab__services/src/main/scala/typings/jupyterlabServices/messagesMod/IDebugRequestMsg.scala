package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.AnonArguments
import typings.jupyterlabServices.jupyterlabServicesStrings.control
import typings.jupyterlabServices.jupyterlabServicesStrings.debug_request
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDebugRequestMsg
  extends IControlMessage[debug_request]
     with _Message {
  @JSName("content")
  var content_IDebugRequestMsg: AnonArguments
}

object IDebugRequestMsg {
  @scala.inline
  def apply(
    channel: control,
    content: AnonArguments,
    header: IHeader[debug_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IDebugRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugRequestMsg]
  }
}

