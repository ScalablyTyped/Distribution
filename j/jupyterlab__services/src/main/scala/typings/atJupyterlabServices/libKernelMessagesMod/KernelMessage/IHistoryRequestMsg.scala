package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.history_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'history_request'` message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#history).
  *
  * **See also:** [[IHistoryReplyMsg]], [[[IKernel.history]]]
  */
trait IHistoryRequestMsg
  extends IShellMessage[history_request]
     with _Message {
  @JSName("content")
  var content_IHistoryRequestMsg: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail
}

object IHistoryRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: IHistoryRequestRange | IHistoryRequestSearch | IHistoryRequestTail,
    header: IHeader[history_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IHistoryRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content.asInstanceOf[js.Any], header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IHistoryRequestMsg]
  }
}

