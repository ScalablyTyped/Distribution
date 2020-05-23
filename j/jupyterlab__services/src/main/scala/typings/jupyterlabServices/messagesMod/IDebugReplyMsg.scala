package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Body
import typings.jupyterlabServices.jupyterlabServicesStrings.control
import typings.jupyterlabServices.jupyterlabServicesStrings.debug_reply
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDebugReplyMsg
  extends IControlMessage[debug_reply]
     with _Message {
  @JSName("content")
  var content_IDebugReplyMsg: Body
}

object IDebugReplyMsg {
  @scala.inline
  def apply(
    channel: control,
    content: Body,
    header: IHeader[debug_reply],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IDebugReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugReplyMsg]
  }
}

