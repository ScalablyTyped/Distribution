package typings.maximMazurokGapiClientCompute.gapi.client.compute

import typings.maximMazurokGapiClientCompute.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoutersScopedList extends StObject {
  
  /** A list of routers contained in this scope. */
  var routers: js.UndefOr[js.Array[Router]] = js.undefined
  
  /** Informational warning which replaces the list of routers when the list is empty. */
  var warning: js.UndefOr[Code] = js.undefined
}
object RoutersScopedList {
  
  inline def apply(): RoutersScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RoutersScopedList]
  }
  
  extension [Self <: RoutersScopedList](x: Self) {
    
    inline def setRouters(value: js.Array[Router]): Self = StObject.set(x, "routers", value.asInstanceOf[js.Any])
    
    inline def setRoutersUndefined: Self = StObject.set(x, "routers", js.undefined)
    
    inline def setRoutersVarargs(value: Router*): Self = StObject.set(x, "routers", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
