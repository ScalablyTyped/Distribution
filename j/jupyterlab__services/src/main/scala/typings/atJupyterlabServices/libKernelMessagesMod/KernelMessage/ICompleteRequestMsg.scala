package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_Code
import typings.atJupyterlabServices.atJupyterlabServicesStrings.complete_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A  `'complete_request'` message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#completion).
  *
  * **See also:** [[ICompleteReplyMsg]], [[IKernel.complete]]
  */
trait ICompleteRequestMsg
  extends IShellMessage[complete_request]
     with _Message {
  @JSName("content")
  var content_ICompleteRequestMsg: Anon_Code
}

object ICompleteRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: Anon_Code,
    header: IHeader[complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): ICompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[ICompleteRequestMsg]
  }
}

