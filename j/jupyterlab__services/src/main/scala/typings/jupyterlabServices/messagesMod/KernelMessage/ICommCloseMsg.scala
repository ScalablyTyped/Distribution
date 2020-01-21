package typings.jupyterlabServices.messagesMod.KernelMessage

import typings.jupyterlabServices.AnonCommidData
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_close
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.phosphorCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'comm_close'` message on the `'iopub'` channel.
  *
  * See [Comm close](https://jupyter-client.readthedocs.io/en/latest/messaging.html#opening-a-comm).
  */
trait ICommCloseMsg[T /* <: iopub | shell */] extends IMessage[comm_close] {
  @JSName("channel")
  var channel_ICommCloseMsg: T
  @JSName("content")
  var content_ICommCloseMsg: AnonCommidData
}

object ICommCloseMsg {
  @scala.inline
  def apply[T /* <: iopub | shell */](
    channel: T,
    content: AnonCommidData,
    header: IHeader[comm_close],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): ICommCloseMsg[T] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommCloseMsg[T]]
  }
}

