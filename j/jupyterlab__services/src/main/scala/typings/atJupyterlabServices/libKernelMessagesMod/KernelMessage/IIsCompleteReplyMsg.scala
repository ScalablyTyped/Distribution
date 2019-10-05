package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.is_complete_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.is_complete_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'is_complete_reply'` message on the `'stream'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-completeness).
  *
  * **See also:** [[IIsCompleteRequest]], [[IKernel.isComplete]]
  */
trait IIsCompleteReplyMsg
  extends IShellMessage[is_complete_reply]
     with _Message {
  @JSName("content")
  var content_IIsCompleteReplyMsg: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther]
  @JSName("parent_header")
  var parent_header_IIsCompleteReplyMsg: IHeader[is_complete_request]
}

object IIsCompleteReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IIsCompleteReplyIncomplete | IIsCompleteReplyOther],
    header: IHeader[is_complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[is_complete_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IIsCompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content.asInstanceOf[js.Any], header = header, metadata = metadata, parent_header = parent_header)
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IIsCompleteReplyMsg]
  }
}

