package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Transient
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_result
import typings.jupyterlabServices.jupyterlabServicesStrings.iopub
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExecuteResultMsg
  extends IIOPubMessage[execute_result]
     with _Message {
  
  @JSName("content")
  var content_IExecuteResultMsg: Transient = js.native
}
object IExecuteResultMsg {
  
  @scala.inline
  def apply(
    channel: iopub,
    content: Transient,
    header: IHeader[execute_result],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IExecuteResultMsg = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteResultMsg]
  }
  
  @scala.inline
  implicit class IExecuteResultMsgMutableBuilder[Self <: IExecuteResultMsg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: Transient): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
