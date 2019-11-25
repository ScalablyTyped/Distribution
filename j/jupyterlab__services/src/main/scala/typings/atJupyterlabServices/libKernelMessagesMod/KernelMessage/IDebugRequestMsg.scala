package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_Arguments
import typings.atJupyterlabServices.atJupyterlabServicesStrings.control
import typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_request
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An experimental `'debug_request'` messsage on the `'control'` channel.
  *
  * @hidden
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, this function is *NOT* considered
  * part of the public API, and may change without notice.
  */
trait IDebugRequestMsg
  extends IControlMessage[debug_request]
     with _Message {
  @JSName("content")
  var content_IDebugRequestMsg: Anon_Arguments
}

object IDebugRequestMsg {
  @scala.inline
  def apply(
    channel: control,
    content: Anon_Arguments,
    header: IHeader[debug_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IDebugRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugRequestMsg]
  }
}

