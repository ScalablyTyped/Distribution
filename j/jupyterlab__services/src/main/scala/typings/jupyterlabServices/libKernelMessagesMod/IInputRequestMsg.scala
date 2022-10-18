package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Password
import typings.jupyterlabServices.jupyterlabServicesStrings.input_request
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInputRequestMsg
  extends StObject
     with IStdinMessage[input_request]
     with _Message {
  
  @JSName("content")
  var content_IInputRequestMsg: Password
}
object IInputRequestMsg {
  
  inline def apply(
    content: Password,
    header: IHeader[input_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IInputRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "stdin", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInputRequestMsg]
  }
  
  extension [Self <: IInputRequestMsg](x: Self) {
    
    inline def setContent(value: Password): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
