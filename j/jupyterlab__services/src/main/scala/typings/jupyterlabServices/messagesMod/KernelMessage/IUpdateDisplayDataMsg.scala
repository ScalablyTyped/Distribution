package typings.jupyterlabServices.messagesMod.KernelMessage

import typings.jupyterlabServices.AnonData
import typings.jupyterlabServices.AnonTransient
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.jupyterlabServices.jupyterlabServicesStrings.update_display_data
import typings.phosphorCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'update_display_data'` message on the `'iopub'` channel.
  *
  * See [Update Display data](https://jupyter-client.readthedocs.io/en/latest/messaging.html#update-display-data).
  */
trait IUpdateDisplayDataMsg
  extends IIOPubMessage[update_display_data]
     with _Message {
  @JSName("content")
  var content_IUpdateDisplayDataMsg: AnonData with AnonTransient
}

object IUpdateDisplayDataMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonData with AnonTransient,
    header: IHeader[update_display_data],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IUpdateDisplayDataMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUpdateDisplayDataMsg]
  }
}

