package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.execute_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'execute_reply'` message on the `'stream'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#execution-results).
  *
  * **See also:** [[IExecuteRequest]], [[IKernel.execute]]
  */
trait IExecuteReplyMsg
  extends IShellMessage[execute_reply]
     with _Message {
  @JSName("content")
  var content_IExecuteReplyMsg: ReplyContent[IExecuteReply] with IExecuteCount
  @JSName("parent_header")
  var parent_header_IExecuteReplyMsg: IHeader[execute_request]
}

object IExecuteReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IExecuteReply] with IExecuteCount,
    header: IHeader[execute_reply],
    metadata: JSONObject,
    parent_header: IHeader[execute_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IExecuteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content.asInstanceOf[js.Any], header = header, metadata = metadata, parent_header = parent_header)
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IExecuteReplyMsg]
  }
}

