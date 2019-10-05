package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_Allowstdin
import typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `execute_request` message on the `'shell'` channel.
  */
trait IExecuteRequestMsg
  extends IShellMessage[execute_request]
     with _Message {
  @JSName("content")
  var content_IExecuteRequestMsg: Anon_Allowstdin
}

object IExecuteRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: Anon_Allowstdin,
    header: IHeader[execute_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IExecuteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IExecuteRequestMsg]
  }
}

