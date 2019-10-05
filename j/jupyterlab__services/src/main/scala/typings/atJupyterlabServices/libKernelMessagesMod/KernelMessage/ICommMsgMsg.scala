package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_CommidData
import typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_msg
import typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'comm_msg'` message on the `'iopub'` channel.
  *
  * See [Comm msg](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
  */
trait ICommMsgMsg[T /* <: iopub | shell */] extends IMessage[comm_msg] {
  @JSName("channel")
  var channel_ICommMsgMsg: T
  @JSName("content")
  var content_ICommMsgMsg: Anon_CommidData
}

object ICommMsgMsg {
  @scala.inline
  def apply[T /* <: iopub | shell */](
    channel: T,
    content: Anon_CommidData,
    header: IHeader[comm_msg],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): ICommMsgMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[ICommMsgMsg[T]]
  }
}

