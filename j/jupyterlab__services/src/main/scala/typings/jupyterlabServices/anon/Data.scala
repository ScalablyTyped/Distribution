package typings.jupyterlabServices.anon

import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var comm_id: String
  
  var data: JSONObject
  
  var target_module: js.UndefOr[String] = js.undefined
  
  var target_name: String
}
object Data {
  
  inline def apply(comm_id: String, data: JSONObject, target_name: String): Data = {
    val __obj = js.Dynamic.literal(comm_id = comm_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], target_name = target_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
    
    inline def setComm_id(value: String): Self = StObject.set(x, "comm_id", value.asInstanceOf[js.Any])
    
    inline def setData(value: JSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setTarget_module(value: String): Self = StObject.set(x, "target_module", value.asInstanceOf[js.Any])
    
    inline def setTarget_moduleUndefined: Self = StObject.set(x, "target_module", js.undefined)
    
    inline def setTarget_name(value: String): Self = StObject.set(x, "target_name", value.asInstanceOf[js.Any])
  }
}
