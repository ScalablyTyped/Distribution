package typings.lokijs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionChange extends StObject {
  
  var name: String
  
  var obj: js.Any
  
  var operation: String
}
object CollectionChange {
  
  inline def apply(name: String, obj: js.Any, operation: String): CollectionChange = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionChange]
  }
  
  extension [Self <: CollectionChange](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setObj(value: js.Any): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
  }
}
