package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Ename
import typings.jupyterlabServices.jupyterlabServicesStrings.error
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IErrorMsg
  extends StObject
     with IIOPubMessage[error]
     with _Message {
  
  @JSName("content")
  var content_IErrorMsg: Ename
}
object IErrorMsg {
  
  inline def apply(
    content: Ename,
    header: IHeader[error],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IErrorMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IErrorMsg]
  }
  
  extension [Self <: IErrorMsg](x: Self) {
    
    inline def setContent(value: Ename): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
