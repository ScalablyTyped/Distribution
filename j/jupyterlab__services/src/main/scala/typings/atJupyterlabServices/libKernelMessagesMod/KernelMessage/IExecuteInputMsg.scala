package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_CodeExecutioncount
import typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_input
import typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'execute_input'` message on the `'iopub'` channel.
  *
  * See [Code inputs](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-inputs).
  */
trait IExecuteInputMsg
  extends IIOPubMessage[execute_input]
     with _Message {
  @JSName("content")
  var content_IExecuteInputMsg: Anon_CodeExecutioncount
}

object IExecuteInputMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Anon_CodeExecutioncount,
    header: IHeader[execute_input],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IExecuteInputMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteInputMsg]
  }
}

