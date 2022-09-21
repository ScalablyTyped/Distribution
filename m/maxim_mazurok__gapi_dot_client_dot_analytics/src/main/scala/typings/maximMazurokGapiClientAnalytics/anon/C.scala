package typings.maximMazurokGapiClientAnalytics.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait C extends StObject {
  
  var c: js.UndefOr[js.Array[V]] = js.undefined
}
object C {
  
  inline def apply(): C = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[C]
  }
  
  extension [Self <: C](x: Self) {
    
    inline def setC(value: js.Array[V]): Self = StObject.set(x, "c", value.asInstanceOf[js.Any])
    
    inline def setCUndefined: Self = StObject.set(x, "c", js.undefined)
    
    inline def setCVarargs(value: V*): Self = StObject.set(x, "c", js.Array(value*))
  }
}
