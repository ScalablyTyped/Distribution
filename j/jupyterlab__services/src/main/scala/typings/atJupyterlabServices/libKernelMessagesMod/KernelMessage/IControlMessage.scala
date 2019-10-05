package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.atJupyterlabServicesStrings.control
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A kernel message on the `'control'` channel.
  */
trait IControlMessage[T /* <: ControlMessageType */] extends IMessage[T] {
  @JSName("channel")
  var channel_IControlMessage: control
}

object IControlMessage {
  @scala.inline
  def apply[T /* <: ControlMessageType */](
    channel: control,
    content: /* import warning: ImportType.apply Failed type conversion: @jupyterlab/services.@jupyterlab/services/lib/kernel/messages.KernelMessage.Message['content'] */ js.Any,
    header: IHeader[T],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IControlMessage[T] = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IControlMessage[T]]
  }
}

