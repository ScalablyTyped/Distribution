package typings.jupyterlabServices.messagesMod

import typings.jupyterlabServices.jupyterlabServicesStrings.ok
import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IInspectReply extends IReplyOkContent {
  
  var data: JSONObject = js.native
  
  var found: Boolean = js.native
  
  var metadata: JSONObject = js.native
}
object IInspectReply {
  
  @scala.inline
  def apply(data: JSONObject, found: Boolean, metadata: JSONObject, status: ok): IInspectReply = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], found = found.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInspectReply]
  }
  
  @scala.inline
  implicit class IInspectReplyMutableBuilder[Self <: IInspectReply] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: JSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFound(value: Boolean): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: JSONObject): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
  }
}
