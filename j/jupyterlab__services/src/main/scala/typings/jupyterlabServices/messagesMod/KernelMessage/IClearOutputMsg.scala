package typings.jupyterlabServices.messagesMod.KernelMessage

import typings.jupyterlabServices.AnonWait
import typings.jupyterlabServices.jupyterlabServicesStrings.clear_output
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.phosphorCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'clear_output'` message on the `'iopub'` channel.
  *
  * See [Clear output](https://jupyter-client.readthedocs.io/en/latest/messaging.html#clear-output).
  */
trait IClearOutputMsg
  extends IIOPubMessage[clear_output]
     with _Message {
  @JSName("content")
  var content_IClearOutputMsg: AnonWait
}

object IClearOutputMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonWait,
    header: IHeader[clear_output],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IClearOutputMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClearOutputMsg]
  }
}

