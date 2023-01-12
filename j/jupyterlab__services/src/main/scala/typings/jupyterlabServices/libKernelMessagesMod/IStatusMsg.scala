package typings.jupyterlabServices.libKernelMessagesMod

import typings.jupyterlabServices.anon.Executionstate
import typings.jupyterlabServices.jupyterlabServicesStrings.status
import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IStatusMsg
  extends StObject
     with IIOPubMessage[status]
     with _Message {
  
  @JSName("content")
  var content_IStatusMsg: Executionstate
}
object IStatusMsg {
  
  inline def apply(
    content: Executionstate,
    header: IHeader[status],
    metadata: JSONObject,
    parent_header: IHeader[MessageType] | js.Object
  ): IStatusMsg = {
    val __obj = js.Dynamic.literal(channel = "iopub", content = content.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], parent_header = parent_header.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatusMsg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IStatusMsg] (val x: Self) extends AnyVal {
    
    inline def setContent(value: Executionstate): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
