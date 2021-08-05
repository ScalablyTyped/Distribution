package typings.ipfsHttpClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Body extends StObject {
  
  var body: js.Any
  
  var parts: js.Array[End]
  
  var total: Double
}
object Body {
  
  inline def apply(body: js.Any, parts: js.Array[End], total: Double): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
  
  extension [Self <: Body](x: Self) {
    
    inline def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setParts(value: js.Array[End]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
    
    inline def setPartsVarargs(value: End*): Self = StObject.set(x, "parts", js.Array(value :_*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
