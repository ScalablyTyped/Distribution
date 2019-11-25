package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_CodeString
import typings.atJupyterlabServices.atJupyterlabServicesStrings.is_complete_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'is_complete_request'` message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#code-completeness).
  *
  * **See also:** [[IIsCompleteReplyMsg]], [[IKernel.isComplete]]
  */
trait IIsCompleteRequestMsg
  extends IShellMessage[is_complete_request]
     with _Message {
  @JSName("content")
  var content_IIsCompleteRequestMsg: Anon_CodeString
}

object IIsCompleteRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: Anon_CodeString,
    header: IHeader[is_complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IIsCompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIsCompleteRequestMsg]
  }
}

