package typings.googleapis.computeV1Mod.computeV1

import typings.googleapis.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNetworkEdgeSecurityServicesScopedList extends StObject {
  
  /**
    * A list of NetworkEdgeSecurityServices contained in this scope.
    */
  var networkEdgeSecurityServices: js.UndefOr[js.Array[SchemaNetworkEdgeSecurityService]] = js.undefined
  
  /**
    * Informational warning which replaces the list of security policies when the list is empty.
    */
  var warning: js.UndefOr[Code | Null] = js.undefined
}
object SchemaNetworkEdgeSecurityServicesScopedList {
  
  inline def apply(): SchemaNetworkEdgeSecurityServicesScopedList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNetworkEdgeSecurityServicesScopedList]
  }
  
  extension [Self <: SchemaNetworkEdgeSecurityServicesScopedList](x: Self) {
    
    inline def setNetworkEdgeSecurityServices(value: js.Array[SchemaNetworkEdgeSecurityService]): Self = StObject.set(x, "networkEdgeSecurityServices", value.asInstanceOf[js.Any])
    
    inline def setNetworkEdgeSecurityServicesUndefined: Self = StObject.set(x, "networkEdgeSecurityServices", js.undefined)
    
    inline def setNetworkEdgeSecurityServicesVarargs(value: SchemaNetworkEdgeSecurityService*): Self = StObject.set(x, "networkEdgeSecurityServices", js.Array(value*))
    
    inline def setWarning(value: Code): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningNull: Self = StObject.set(x, "warning", null)
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
