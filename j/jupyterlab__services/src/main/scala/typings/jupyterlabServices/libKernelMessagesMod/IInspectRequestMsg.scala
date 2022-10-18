package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Cursorpos
import typings.jupyterlabServices.jupyterlabServicesStrings.inspect_request
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInspectRequestMsg
  extends StObject
     with IShellMessage[inspect_request]
     with _Message {
  
  @JSName("content")
  var content_IInspectRequestMsg: Cursorpos
}
object IInspectRequestMsg {
  
  inline def apply(
    content: Cursorpos,
    header: IHeader[inspect_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IInspectRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectRequestMsg]
  }
  
  extension [Self <: IInspectRequestMsg](x: Self) {
    
    inline def setContent(value: Cursorpos): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
