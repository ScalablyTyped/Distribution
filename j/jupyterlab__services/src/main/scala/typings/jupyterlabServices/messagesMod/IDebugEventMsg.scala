package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.AnonEvent
import typings.jupyterlabServices.jupyterlabServicesStrings.debug_event
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDebugEventMsg
  extends IIOPubMessage[debug_event]
     with _Message {
  @JSName("content")
  var content_IDebugEventMsg: AnonEvent
}

object IDebugEventMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonEvent,
    header: IHeader[debug_event],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IDebugEventMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugEventMsg]
  }
}

