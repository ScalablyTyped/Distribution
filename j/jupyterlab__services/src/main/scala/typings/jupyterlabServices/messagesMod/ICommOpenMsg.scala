package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.AnonCommid
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_open
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommOpenMsg[T /* <: shell | iopub */] extends IMessage[comm_open] {
  @JSName("channel")
  var channel_ICommOpenMsg: T
  @JSName("content")
  var content_ICommOpenMsg: AnonCommid
}

object ICommOpenMsg {
  @scala.inline
  def apply[T /* <: shell | iopub */](
    channel: T,
    content: AnonCommid,
    header: IHeader[comm_open],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): ICommOpenMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommOpenMsg[T]]
  }
}

