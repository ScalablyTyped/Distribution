package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackendServicesScopedList extends StObject {
  
  /**
    * A list of BackendServices contained in this scope.
    */
  var backendServices: js.UndefOr[js.Array[SchemaBackendService]] = js.undefined
  
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.undefined
}
object SchemaBackendServicesScopedList {
  
  inline def apply(): SchemaBackendServicesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackendServicesScopedList]
  }
  
  extension [Self <: SchemaBackendServicesScopedList](x: Self) {
    
    inline def setBackendServices(value: js.Array[SchemaBackendService]): Self = StObject.set(x, "backendServices", value.asInstanceOf[js.Any])
    
    inline def setBackendServicesUndefined: Self = StObject.set(x, "backendServices", js.undefined)
    
    inline def setBackendServicesVarargs(value: SchemaBackendService*): Self = StObject.set(x, "backendServices", js.Array(value :_*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
