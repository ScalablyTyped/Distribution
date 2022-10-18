package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Wait
import typings.jupyterlabServices.jupyterlabServicesStrings.clear_output
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClearOutputMsg
  extends StObject
     with IIOPubMessage[clear_output]
     with _Message {
  
  @JSName("content")
  var content_IClearOutputMsg: Wait
}
object IClearOutputMsg {
  
  inline def apply(
    content: Wait,
    header: IHeader[clear_output],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IClearOutputMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClearOutputMsg]
  }
  
  extension [Self <: IClearOutputMsg](x: Self) {
    
    inline def setContent(value: Wait): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
