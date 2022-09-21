package typings.ldapjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeJson extends StObject {
  
  var `type`: String
  
  var vals: js.Array[String]
}
object AttributeJson {
  
  inline def apply(`type`: String, vals: js.Array[String]): AttributeJson = {
    val __obj = js.Dynamic.literal(vals = vals.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeJson]
  }
  
  extension [Self <: AttributeJson](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVals(value: js.Array[String]): Self = StObject.set(x, "vals", value.asInstanceOf[js.Any])
    
    inline def setValsVarargs(value: String*): Self = StObject.set(x, "vals", js.Array(value*))
  }
}
