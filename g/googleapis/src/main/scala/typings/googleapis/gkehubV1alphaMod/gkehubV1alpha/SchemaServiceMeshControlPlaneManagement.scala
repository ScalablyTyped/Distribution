package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceMeshControlPlaneManagement extends StObject {
  
  /**
    * Explanation of state.
    */
  var details: js.UndefOr[js.Array[SchemaServiceMeshStatusDetails]] = js.undefined
  
  /**
    * LifecycleState of control plane management.
    */
  var state: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceMeshControlPlaneManagement {
  
  inline def apply(): SchemaServiceMeshControlPlaneManagement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceMeshControlPlaneManagement]
  }
  
  extension [Self <: SchemaServiceMeshControlPlaneManagement](x: Self) {
    
    inline def setDetails(value: js.Array[SchemaServiceMeshStatusDetails]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: SchemaServiceMeshStatusDetails*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateNull: Self = StObject.set(x, "state", null)
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
