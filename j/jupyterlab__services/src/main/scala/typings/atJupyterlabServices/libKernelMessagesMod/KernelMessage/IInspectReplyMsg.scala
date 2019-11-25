package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.inspect_reply
import typings.atJupyterlabServices.atJupyterlabServicesStrings.inspect_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'inspect_reply'` message on the `'shell'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
  *
  * **See also:** [[IInspectRequest]], [[IKernel.inspect]]
  */
trait IInspectReplyMsg
  extends IShellMessage[inspect_reply]
     with _Message {
  @JSName("content")
  var content_IInspectReplyMsg: ReplyContent[IInspectReply]
  @JSName("parent_header")
  var parent_header_IInspectReplyMsg: IHeader[inspect_request]
}

object IInspectReplyMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: ReplyContent[IInspectReply],
    header: IHeader[inspect_reply],
    metadata: JSONObject,
    parent_header: IHeader[inspect_request],
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IInspectReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectReplyMsg]
  }
}

