package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Ename
import typings.jupyterlabServices.jupyterlabServicesStrings.error
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrorMsg
  extends IIOPubMessage[error]
     with _Message {
  @JSName("content")
  var content_IErrorMsg: Ename
}

object IErrorMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: Ename,
    header: IHeader[error],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IErrorMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorMsg]
  }
}

