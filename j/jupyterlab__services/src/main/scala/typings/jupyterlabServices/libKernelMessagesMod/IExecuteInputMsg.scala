package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Executioncount
import typings.jupyterlabServices.jupyterlabServicesStrings.execute_input
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IExecuteInputMsg
  extends StObject
     with IIOPubMessage[execute_input]
     with _Message {
  
  @JSName("content")
  var content_IExecuteInputMsg: Executioncount
}
object IExecuteInputMsg {
  
  inline def apply(
    content: Executioncount,
    header: IHeader[execute_input],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IExecuteInputMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IExecuteInputMsg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IExecuteInputMsg] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Executioncount): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
