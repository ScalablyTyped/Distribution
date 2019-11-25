package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_Data
import typings.atJupyterlabServices.Anon_Transient
import typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typings.atJupyterlabServices.atJupyterlabServicesStrings.update_display_data
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
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
  var content_IUpdateDisplayDataMsg: Anon_Data with Anon_Transient
}

object IUpdateDisplayDataMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Anon_Data with Anon_Transient,
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

