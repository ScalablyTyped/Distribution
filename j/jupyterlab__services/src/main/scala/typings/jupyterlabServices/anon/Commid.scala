package typings.jupyterlabServices.anon

import typings.luminoCoreutils.typesJsonMod.JSONObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Commid extends StObject {
  
  var comm_id: String
  
  var data: JSONObject
}
object Commid {
  
  inline def apply(comm_id: String, data: JSONObject): Commid = {
    val __obj = js.Dynamic.literal(comm_id = comm_id.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commid]
  }
  
  extension [Self <: Commid](x: Self) {
    
    inline def setComm_id(value: String): Self = StObject.set(x, "comm_id", value.asInstanceOf[js.Any])
    
    inline def setData(value: JSONObject): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
