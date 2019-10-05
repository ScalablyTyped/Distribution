package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_Ename
import typings.atJupyterlabServices.atJupyterlabServicesStrings.error
import typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'error'` message on the `'iopub'` channel.
  *
  * See [Execution errors](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-errors).
  */
trait IErrorMsg
  extends IIOPubMessage[error]
     with _Message {
  @JSName("content")
  var content_IErrorMsg: Anon_Ename
}

object IErrorMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Anon_Ename,
    header: IHeader[error],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IErrorMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IErrorMsg]
  }
}

