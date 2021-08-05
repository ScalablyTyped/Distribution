package typings.ldapjs.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  var modification: StringDictionary[js.Any]
  
  var operation: String
}
object Change {
  
  inline def apply(modification: StringDictionary[js.Any], operation: String): Change = {
    val __obj = js.Dynamic.literal(modification = modification.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  extension [Self <: Change](x: Self) {
    
    inline def setModification(value: StringDictionary[js.Any]): Self = StObject.set(x, "modification", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
