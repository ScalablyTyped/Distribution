package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Arguments
import typings.jupyterlabServices.jupyterlabServicesStrings.debug_request
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDebugRequestMsg
  extends StObject
     with IControlMessage[debug_request]
     with _Message {
  
  @JSName("content")
  var content_IDebugRequestMsg: Arguments
}
object IDebugRequestMsg {
  
  inline def apply(
    content: Arguments,
    header: IHeader[debug_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IDebugRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "control", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDebugRequestMsg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDebugRequestMsg] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Arguments): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
