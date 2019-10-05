package typings.atJupyterlabServices.libKernelMessagesMod.KernelMessage

import typings.atJupyterlabServices.Anon_Target
import typings.atJupyterlabServices.atJupyterlabServicesStrings.comm_info_request
import typings.atJupyterlabServices.atJupyterlabServicesStrings.shell
import typings.atPhosphorCoreutils.libJsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `'comm_info_request'` message on the `'shell'` channel.
  *
  * See [Messaging in Jupyter](https://jupyter-client.readthedocs.io/en/latest/messaging.html#comm-info).
  *
  * **See also:** [[ICommInfoReplyMsg]], [[IKernel.commInfo]]
  */
trait ICommInfoRequestMsg
  extends IShellMessage[comm_info_request]
     with _Message {
  @JSName("content")
  var content_ICommInfoRequestMsg: Anon_Target
}

object ICommInfoRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: Anon_Target,
    header: IHeader[comm_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): ICommInfoRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel, content = content, header = header, metadata = metadata, parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers)
    __obj.asInstanceOf[ICommInfoRequestMsg]
  }
}

