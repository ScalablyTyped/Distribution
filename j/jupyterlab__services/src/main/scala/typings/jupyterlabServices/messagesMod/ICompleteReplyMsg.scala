package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.complete_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.complete_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteReplyMsg]
  }
}

