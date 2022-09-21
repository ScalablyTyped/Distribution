package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceMeshMembershipSpec extends StObject {
  
  /**
    * Enables automatic control plane management.
    */
  var controlPlane: js.UndefOr[String | Null] = js.undefined
}
object SchemaServiceMeshMembershipSpec {
  
  inline def apply(): SchemaServiceMeshMembershipSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaServiceMeshMembershipSpec]
  }
  
  extension [Self <: SchemaServiceMeshMembershipSpec](x: Self) {
    
    inline def setControlPlane(value: String): Self = StObject.set(x, "controlPlane", value.asInstanceOf[js.Any])
    
    inline def setControlPlaneNull: Self = StObject.set(x, "controlPlane", null)
    
    inline def setControlPlaneUndefined: Self = StObject.set(x, "controlPlane", js.undefined)
  }
}
