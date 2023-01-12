package typings.ipfsHttpClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extra extends StObject {
  
  var Extra: String
  
  var ID: String
  
  var Responses: js.Array[Addrs]
  
  var Type: Double
}
object Extra {
  
  inline def apply(Extra: String, ID: String, Responses: js.Array[Addrs], Type: Double): Extra = {
    val __obj = js.Dynamic.literal(Extra = Extra.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Responses = Responses.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Extra] (val x: Self) extends AnyVal {
    
    inline def setExtra(value: String): Self = StObject.set(x, "Extra", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: js.Array[Addrs]): Self = StObject.set(x, "Responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesVarargs(value: Addrs*): Self = StObject.set(x, "Responses", js.Array(value*))
    
    inline def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
