package typings.hafasClient.mod

import typings.hafasClient.hafasClientStrings.operator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operator extends StObject {
  
  var id: String
  
  var name: String
  
  var `type`: operator
}
object Operator {
  
  inline def apply(id: String, name: String): Operator = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("operator")
    __obj.asInstanceOf[Operator]
  }
  
  extension [Self <: Operator](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: operator): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
