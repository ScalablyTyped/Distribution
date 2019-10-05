package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_0
import typings.atJupyterlabServices.atJupyterlabServicesStrings.inspect_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An `'inspect_request'` message.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#introspection).
  *
  * **See also:** [[IInspectReplyMsg]], [[[IKernel.inspect]]]
  */
trait IInspectRequestMsg
  extends IShellMessage[inspect_request]
     with _Message {
  @JSName("content")
  var content_IInspectRequestMsg: Anon_0
}

object IInspectRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: Anon_0,
    header: IHeader[inspect_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IInspectRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[IInspectRequestMsg]
  }
}

