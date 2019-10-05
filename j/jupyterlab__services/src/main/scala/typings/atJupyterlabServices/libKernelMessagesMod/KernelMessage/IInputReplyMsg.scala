package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.input_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.input_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.stdin
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'input_reply'` message on the `'stdin'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
  */
trait IInputReplyMsg
  extends IStdinMessage[input_reply]
     with _Message {
  @JSName("content")
  var content_IInputReplyMsg: ReplyContent[IInputReply]
  @JSName("parent_header")
  var parent_header_IInputReplyMsg: IHeader[input_request]
}

object IInputReplyMsg {
  @scala.inline
  def apply(
    channel: stdin,
    content: ReplyContent[IInputReply],
    header: IHeader[input_reply],
    metadata: JSONObject,
    parent_header: IHeader[input_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IInputReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content.asInstanceOf[js.Any], header = header, metadata = metadata, parent_header = parent_header)
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IInputReplyMsg]
  }
}

