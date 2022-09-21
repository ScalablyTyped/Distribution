package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceMeshMembershipState extends StObject {
  
  /**
    * Output only. Status of control plane management
    */
  var controlPlaneManagement: js.UndefOr[SchemaServiceMeshControlPlaneManagement] = js.undefined
}
object SchemaServiceMeshMembershipState {
  
  inline def apply(): SchemaServiceMeshMembershipState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceMeshMembershipState]
  }
  
  extension [Self <: SchemaServiceMeshMembershipState](x: Self) {
    
    inline def setControlPlaneManagement(value: SchemaServiceMeshControlPlaneManagement): Self = StObject.set(x, "controlPlaneManagement", value.asInstanceOf[js.Any])
    
    inline def setControlPlaneManagementUndefined: Self = StObject.set(x, "controlPlaneManagement", js.undefined)
  }
}
