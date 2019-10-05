package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.complete_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.complete_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'complete_reply'` message on the `'shell'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
  *
  * **See also:** [[ICompleteRequest]], [[IKernel.complete]]
  */
trait ICompleteReplyMsg
  extends IShellMessage[complete_reply]
     with _Message {
  @JSName("content")
  var content_ICompleteReplyMsg: ReplyContent[ICompleteReply]
  @JSName("parent_header")
  var parent_header_ICompleteReplyMsg: IHeader[complete_request]
}

object ICompleteReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[ICompleteReply],
    header: IHeader[complete_reply],
    metadata: JSONObject,
    parent_header: IHeader[complete_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): ICompleteReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content.asInstanceOf[js.Any], header = header, metadata = metadata, parent_header = parent_header)
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[ICompleteReplyMsg]
  }
}

