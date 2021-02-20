package typings.jupyterlabServices.anon

import typings.luminoCoreutils.jsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data extends StObject {
  
  var comm_id: String = js.native
  
  var data: JSONObject = js.native
  
  var target_module: js.UndefOr[String] = js.native
  
  var target_name: String = js.native
}
object Data {
  
  @scala.inline
  def apply(comm_id: String, data: JSONObject, target_name: String): Data = {
    val __obj = js.Dynamic.literal(comm_id = comm_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], target_name = target_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComm_id(value: String): Self = StObject.set(x, "comm_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: JSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_module(value: String): Self = StObject.set(x, "target_module", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget_moduleUndefined: Self = StObject.set(x, "target_module", js.undefined)
    
    @scala.inline
    def setTarget_name(value: String): Self = StObject.set(x, "target_name", value.asInstanceOf[js.Any])
  }
}
