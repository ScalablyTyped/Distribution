package typings.jestTestResult.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UncheckedSnapshot extends StObject {
  
  var filePath: String
  
  var keys: js.Array[String]
}
object UncheckedSnapshot {
  
  inline def apply(filePath: String, keys: js.Array[String]): UncheckedSnapshot = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UncheckedSnapshot]
  }
  
  extension [Self <: UncheckedSnapshot](x: Self) {
    
    inline def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
  }
}
