package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_DataExecutioncount
import typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_result
import typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'execute_result'` message on the `'iopub'` channel.
  *
  * See [Execution results](https://jupyter-client.readthedocs.io/en/latest/messaging.html#id4).
  */
trait IExecuteResultMsg
  extends IIOPubMessage[execute_result]
     with _Message {
  @JSName("content")
  var content_IExecuteResultMsg: Anon_DataExecutioncount
}

object IExecuteResultMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Anon_DataExecutioncount,
    header: IHeader[execute_result],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IExecuteResultMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IExecuteResultMsg]
  }
}

