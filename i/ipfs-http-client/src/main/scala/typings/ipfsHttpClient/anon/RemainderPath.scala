package typings.ipfsHttpClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemainderPath extends StObject {
  
  var remainderPath: String
  
  var value: Any
}
object RemainderPath {
  
  inline def apply(remainderPath: String, value: Any): RemainderPath = {
    val __obj = js.Dynamic.literal(remainderPath = remainderPath.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemainderPath]
  }
  
  extension [Self <: RemainderPath](x: Self) {
    
    inline def setRemainderPath(value: String): Self = StObject.set(x, "remainderPath", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
