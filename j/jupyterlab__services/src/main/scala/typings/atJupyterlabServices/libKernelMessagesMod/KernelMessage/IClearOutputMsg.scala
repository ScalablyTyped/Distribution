package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_Wait
import typings.atJupyterlabServices.atJupyterlabServicesStrings.clear_output
import typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
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
  var content_IClearOutputMsg: Anon_Wait
}

object IClearOutputMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Anon_Wait,
    header: IHeader[clear_output],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IClearOutputMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IClearOutputMsg]
  }
}

