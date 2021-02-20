package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Executioncount
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_input
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteInputMsg
  extends IIOPubMessage[execute_input]
     with _Message {
  
  @JSName("content")
  var content_IExecuteInputMsg: Executioncount = js.native
}
object IExecuteInputMsg {
  
  @scala.inline
  def apply(
    channel: iopub,
    content: Executioncount,
    header: IHeader[execute_input],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IExecuteInputMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteInputMsg]
  }
  
  @scala.inline
  implicit class IExecuteInputMsgMutableBuilder[Self <: IExecuteInputMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Executioncount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
