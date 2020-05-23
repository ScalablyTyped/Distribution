package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Metadata
import typings.jupyterlabServices.jupyterlabServicesStrings.display_data
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisplayDataMsg
  extends IIOPubMessage[display_data]
     with _Message {
  @JSName("content")
  var content_IDisplayDataMsg: Metadata
}

object IDisplayDataMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Metadata,
    header: IHeader[display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisplayDataMsg]
  }
}

