package typings.googleapis.gkehubV1Mod.gkehubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipFeatureSpec extends StObject {
  
  /**
    * AnthosVM spec.
    */
  var anthosvm: js.UndefOr[SchemaAnthosVMMembershipSpec] = js.undefined
  
  /**
    * Config Management-specific spec.
    */
  var configmanagement: js.UndefOr[SchemaConfigManagementMembershipSpec] = js.undefined
  
  /**
    * Identity Service-specific spec.
    */
  var identityservice: js.UndefOr[SchemaIdentityServiceMembershipSpec] = js.undefined
  
  /**
    * Anthos Service Mesh-specific spec
    */
  var mesh: js.UndefOr[SchemaServiceMeshMembershipSpec] = js.undefined
}
object SchemaMembershipFeatureSpec {
  
  inline def apply(): SchemaMembershipFeatureSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipFeatureSpec]
  }
  
  extension [Self <: SchemaMembershipFeatureSpec](x: Self) {
    
    inline def setAnthosvm(value: SchemaAnthosVMMembershipSpec): Self = StObject.set(x, "anthosvm", value.asInstanceOf[js.Any])
    
    inline def setAnthosvmUndefined: Self = StObject.set(x, "anthosvm", js.undefined)
    
    inline def setConfigmanagement(value: SchemaConfigManagementMembershipSpec): Self = StObject.set(x, "configmanagement", value.asInstanceOf[js.Any])
    
    inline def setConfigmanagementUndefined: Self = StObject.set(x, "configmanagement", js.undefined)
    
    inline def setIdentityservice(value: SchemaIdentityServiceMembershipSpec): Self = StObject.set(x, "identityservice", value.asInstanceOf[js.Any])
    
    inline def setIdentityserviceUndefined: Self = StObject.set(x, "identityservice", js.undefined)
    
    inline def setMesh(value: SchemaServiceMeshMembershipSpec): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setMeshUndefined: Self = StObject.set(x, "mesh", js.undefined)
  }
}
