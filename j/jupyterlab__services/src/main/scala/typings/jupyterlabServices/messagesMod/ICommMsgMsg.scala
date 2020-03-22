package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.AnonCommidData
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_msg
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommMsgMsg[T /* <: iopub | shell */] extends IMessage[comm_msg] {
  @JSName("channel")
  var channel_ICommMsgMsg: T
  @JSName("content")
  var content_ICommMsgMsg: AnonCommidData
}

object ICommMsgMsg {
  @scala.inline
  def apply[T /* <: iopub | shell */](
    channel: T,
    content: AnonCommidData,
    header: IHeader[comm_msg],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): ICommMsgMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommMsgMsg[T]]
  }
}

