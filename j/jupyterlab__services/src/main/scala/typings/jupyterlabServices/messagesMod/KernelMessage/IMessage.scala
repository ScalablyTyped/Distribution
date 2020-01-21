package typings.jupyterlabServices.messagesMod.KernelMessage

import typings.phosphorCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Kernel message specification.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#general-message-format).
  */
trait IMessage[MSGTYPE /* <: MessageType */] extends js.Object {
  /**
    * An optional list of binary buffers.
    */
  var buffers: js.UndefOr[js.Array[ArrayBuffer | ArrayBufferView]] = js.undefined
  /**
    * The channel on which the message is transmitted.
    */
  var channel: Channel
  /**
    * The content of the message.
    */
  var content: /* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.Message['content'] */ js.Any
  /**
    * The message header.
    */
  var header: IHeader[MSGTYPE]
  /**
    * Metadata associated with the message.
    */
  var metadata: JSONObject
  /**
    * The parent message
    */
  var parent_header: IHeader[MessageType] | js.Object
}

object IMessage {
  @scala.inline
  def apply[MSGTYPE /* <: MessageType */](
    channel: Channel,
    content: /* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.Message['content'] */ js.Any,
    header: IHeader[MSGTYPE],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IMessage[MSGTYPE] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMessage[MSGTYPE]]
  }
}

