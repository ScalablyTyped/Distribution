package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.execute_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteReplyMsg]
  }
}

