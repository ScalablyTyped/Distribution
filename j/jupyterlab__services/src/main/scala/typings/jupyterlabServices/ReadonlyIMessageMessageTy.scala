package typings.jupyterlabServices

import typings.jupyterlabServices.messagesMod.Channel
import typings.jupyterlabServices.messagesMod.IHeader
import typings.jupyterlabServices.messagesMod.MessageType
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.IMessage<@jupyterlab/services.@jupyterlab/services/lib/kernel/messages.MessageType>> */
trait ReadonlyIMessageMessageTy extends js.Object {
  val buffers: js.UndefOr[js.Array[ArrayBuffer | ArrayBufferView]] = js.undefined
  val channel: Channel
  val content: /* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.Message['content'] */ js.Any
  val header: IHeader[MessageType]
  val metadata: JSONObject
  val parent_header: IHeader[MessageType] | js.Object
}

object ReadonlyIMessageMessageTy {
  @scala.inline
  def apply(
    channel: Channel,
    content: /* import warning: importer.ImportType#apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.Message['content'] */ js.Any,
    header: IHeader[MessageType],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): ReadonlyIMessageMessageTy = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyIMessageMessageTy]
  }
}

