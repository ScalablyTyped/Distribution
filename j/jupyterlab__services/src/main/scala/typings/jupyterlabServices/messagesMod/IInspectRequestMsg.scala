package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Cursorpos
import typings.jupyterlabServices.jupyterlabServicesStrings.inspect_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInspectRequestMsg
  extends IShellMessage[inspect_request]
     with _Message {
  @JSName("content")
  var content_IInspectRequestMsg: Cursorpos
}

object IInspectRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: Cursorpos,
    header: IHeader[inspect_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IInspectRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectRequestMsg]
  }
}

