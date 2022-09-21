package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayCritical extends StObject {
  
  var array: Any
  
  var critical: Boolean
}
object ArrayCritical {
  
  inline def apply(array: Any, critical: Boolean): ArrayCritical = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], critical = critical.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayCritical]
  }
  
  extension [Self <: ArrayCritical](x: Self) {
    
    inline def setArray(value: Any): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
  }
}
