package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_Password
import typings.atJupyterlabServices.atJupyterlabServicesStrings.input_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.stdin
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'input_request'` message on the `'stdin'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#messages-on-the-stdin-router-dealer-sockets).
  */
trait IInputRequestMsg
  extends IStdinMessage[input_request]
     with _Message {
  @JSName("content")
  var content_IInputRequestMsg: Anon_Password
}

object IInputRequestMsg {
  @scala.inline
  def apply(
    channel: stdin,
    content: Anon_Password,
    header: IHeader[input_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IInputRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IInputRequestMsg]
  }
}

