package typings.jupyterlabServices.libKernelMessagesMod

import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IInspectReply
  extends StObject
     with IReplyOkContent {
  
  var data: JSONObject
  
  var found: Boolean
  
  var metadata: JSONObject
}
object IInspectReply {
  
  inline def apply(data: JSONObject, found: Boolean, metadata: JSONObject): IInspectReply = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = "ok")
    __obj.asInstanceOf[IInspectReply]
  }
  
  extension [Self <: IInspectReply](x: Self) {
    
    inline def setData(value: JSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: JSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
