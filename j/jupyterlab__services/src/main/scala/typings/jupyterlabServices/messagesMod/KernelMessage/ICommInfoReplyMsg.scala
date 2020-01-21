package typings.jupyterlabServices.messagesMod.KernelMessage

import typings.jupyterlabServices.jupyterlabServicesStrings.comm_info_reply
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_info_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.phosphorCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'comm_info_reply'` message on the `'shell'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm-info).
  *
  * **See also:** [[ICommInfoRequestMsg]], [[IKernel.commInfo]]
  */
trait ICommInfoReplyMsg
  extends IShellMessage[comm_info_reply]
     with _Message {
  @JSName("content")
  var content_ICommInfoReplyMsg: ReplyContent[ICommInfoReply]
  @JSName("parent_header")
  var parent_header_ICommInfoReplyMsg: IHeader[comm_info_request]
}

object ICommInfoReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[ICommInfoReply],
    header: IHeader[comm_info_reply],
    metadata: JSONObject,
    parent_header: IHeader[comm_info_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): ICommInfoReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommInfoReplyMsg]
  }
}

