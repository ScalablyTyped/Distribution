package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.anon.Transient
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_result
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteResultMsg
  extends StObject
     with IIOPubMessage[execute_result]
     with _Message {
  
  @JSName("content")
  var content_IExecuteResultMsg: Transient
}
object IExecuteResultMsg {
  
  inline def apply(
    content: Transient,
    header: IHeader[execute_result],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IExecuteResultMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteResultMsg]
  }
  
  extension [Self <: IExecuteResultMsg](x: Self) {
    
    inline def setContent(value: Transient): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
