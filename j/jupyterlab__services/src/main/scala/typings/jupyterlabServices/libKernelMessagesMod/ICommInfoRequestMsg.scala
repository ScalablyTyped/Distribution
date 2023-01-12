package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Targetname
import typings.jupyterlabServices.jupyterlabServicesStrings.comm_info_request
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICommInfoRequestMsg
  extends StObject
     with IShellMessage[comm_info_request]
     with _Message {
  
  @JSName("content")
  var content_ICommInfoRequestMsg: Targetname
}
object ICommInfoRequestMsg {
  
  inline def apply(
    content: Targetname,
    header: IHeader[comm_info_request],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): ICommInfoRequestMsg = {
    val __obj = js.Dynamic.literal(channel = "shell", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommInfoRequestMsg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICommInfoRequestMsg] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Targetname): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
