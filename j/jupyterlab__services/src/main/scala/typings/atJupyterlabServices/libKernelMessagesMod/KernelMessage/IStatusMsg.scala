package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_Executionstate
import typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typings.atJupyterlabServices.atJupyterlabServicesStrings.status
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'status'` message on the `'iopub'` channel.
  *
  * See [Kernel status](https://jupyter-client.readthedocs.io/en/latest/messaging.html#kernel-status).
  */
trait IStatusMsg
  extends IIOPubMessage[status]
     with _Message {
  @JSName("content")
  var content_IStatusMsg: Anon_Executionstate
}

object IStatusMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Anon_Executionstate,
    header: IHeader[status],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IStatusMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IStatusMsg]
  }
}

