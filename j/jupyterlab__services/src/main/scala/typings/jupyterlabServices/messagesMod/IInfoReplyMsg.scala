package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.kernel_info_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.kernel_info_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInfoReplyMsg
  extends IShellMessage[kernel_info_reply]
     with _Message {
  @JSName("content")
  var content_IInfoReplyMsg: ReplyContent[IInfoReply]
  @JSName("parent_header")
  var parent_header_IInfoReplyMsg: IHeader[kernel_info_request]
}

object IInfoReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IInfoReply],
    header: IHeader[kernel_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[kernel_info_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IInfoReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInfoReplyMsg]
  }
}

