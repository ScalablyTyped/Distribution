package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.AnonExecutioncount
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_input
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.luminoCoreutils.jsonMod.JSONObject
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IExecuteInputMsg
  extends IIOPubMessage[execute_input]
     with _Message {
  @JSName("content")
  var content_IExecuteInputMsg: AnonExecutioncount
}

object IExecuteInputMsg {
  @scala.inline
  def apply(
    channel: iopub,
    content: AnonExecutioncount,
    header: IHeader[execute_input],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object,
    buffers: js.Array[ArrayBuffer | ArrayBufferView] = null
  ): IExecuteInputMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    if (buffers != null) __obj.updateDynamic("buffers")(buffers.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteInputMsg]
  }
}

