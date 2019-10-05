package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_Body
import typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_event
import typings.atJupyterlabServices.atJupyterlabServicesStrings.iopub
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
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
  var content_IDebugEventMsg: Anon_Body
}

object IDebugEventMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Anon_Body,
    header: IHeader[debug_event],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IDebugEventMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IDebugEventMsg]
  }
}

