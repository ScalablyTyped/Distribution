package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_BodyCommand
import typings.atJupyterlabServices.atJupyterlabServicesStrings.control
import typings.atJupyterlabServices.atJupyterlabServicesStrings.debug_reply
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An experimental `'debug_reply'` messsage on the `'control'` channel.
  *
  * @hidden
  *
  * #### Notes
  * Debug messages are experimental messages that are not in the official
  * kernel message specification. As such, this is *NOT* considered
  * part of the public API, and may change without notice.
  */
trait IDebugReplyMsg
  extends IControlMessage[debug_reply]
     with _Message {
  @JSName("content")
  var content_IDebugReplyMsg: Anon_BodyCommand
}

object IDebugReplyMsg {
  @scala.inline
  def apply(
    channel: control,
    content: Anon_BodyCommand,
    header: IHeader[debug_reply],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IDebugReplyMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IDebugReplyMsg]
  }
}

