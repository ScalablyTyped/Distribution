package typings.jupyterlabServices.messagesMod.KernelMessage

import typings.jupyterlabServices.jupyterlabServicesStrings.is_complete_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.is_complete_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.phosphorCoreutils.jsonMod.JSONObject
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
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteReplyMsg]
  }
}

