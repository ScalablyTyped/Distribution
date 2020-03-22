package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.AnonMetadata
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_result
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecuteResultMsg
  extends IIOPubMessage[execute_result]
     with _Message {
  @JSName("content")
  var content_IExecuteResultMsg: AnonMetadata
}

object IExecuteResultMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonMetadata,
    header: IHeader[execute_result],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IExecuteResultMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteResultMsg]
  }
}

