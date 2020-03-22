package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.history_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.history_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHistoryReplyMsg
  extends IShellMessage[history_reply]
     with _Message {
  @JSName("content")
  var content_IHistoryReplyMsg: ReplyContent[IHistoryReply]
  @JSName("parent_header")
  var parent_header_IHistoryReplyMsg: IHeader[history_request]
}

object IHistoryReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IHistoryReply],
    header: IHeader[history_reply],
    metadata: JSONObject,
    parent_header: IHeader[history_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IHistoryReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHistoryReplyMsg]
  }
}

