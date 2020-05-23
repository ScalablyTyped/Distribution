package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Code
import typings.jupyterlabServices.jupyterlabServicesStrings.complete_request
import typings.jupyterlabServices.jupyterlabServicesStrings.shell
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompleteRequestMsg
  extends IShellMessage[complete_request]
     with _Message {
  @JSName("content")
  var content_ICompleteRequestMsg: Code
}

object ICompleteRequestMsg {
  @scala.inline
  def apply(
    channel: shell,
    content: Code,
    header: IHeader[complete_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): ICompleteRequestMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICompleteRequestMsg]
  }
}

