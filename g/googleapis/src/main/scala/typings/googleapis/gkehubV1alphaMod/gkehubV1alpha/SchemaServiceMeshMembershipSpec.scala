package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaServiceMeshMembershipSpec extends StObject {
  
  /**
    * Enables automatic control plane management.
    */
  var controlPlane: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Determines which release channel to use for default injection and service mesh APIs.
    */
  var defaultChannel: js.UndefOr[String | Null] = js.undefined
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
    
    inline def setDefaultChannel(value: String): Self = StObject.set(x, "defaultChannel", value.asInstanceOf[js.Any])
    
    inline def setDefaultChannelNull: Self = StObject.set(x, "defaultChannel", null)
    
    inline def setDefaultChannelUndefined: Self = StObject.set(x, "defaultChannel", js.undefined)
  }
}
