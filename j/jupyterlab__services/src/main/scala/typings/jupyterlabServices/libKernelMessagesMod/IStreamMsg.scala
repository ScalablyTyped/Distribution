package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Name
import typings.jupyterlabServices.jupyterlabServicesStrings.stream
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStreamMsg
  extends StObject
     with IIOPubMessage[stream]
     with _Message {
  
  @JSName("content")
  var content_IStreamMsg: Name
}
object IStreamMsg {
  
  inline def apply(
    content: Name,
    header: IHeader[stream],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IStreamMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStreamMsg]
  }
  
  extension [Self <: IStreamMsg](x: Self) {
    
    inline def setContent(value: Name): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
