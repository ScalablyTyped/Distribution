package typings.jupyterlabServices.messagesMod.KernelMessage

import typings.jupyterlabServices.AnonBody
import typings.jupyterlabServices.jupyterlabServicesStrings.debug_event
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.phosphorCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An experimental `'debug_event'` message on the `'iopub'` channel
  *
  * @hidden
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, this is *NOT* considered
  * part of the public API, and may change without notice.
  */
trait IDebugEventMsg
  extends IIOPubMessage[debug_event]
     with _Message {
  @JSName("content")
  var content_IDebugEventMsg: AnonBody
}

object IDebugEventMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonBody,
    header: IHeader[debug_event],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IDebugEventMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugEventMsg]
  }
}

