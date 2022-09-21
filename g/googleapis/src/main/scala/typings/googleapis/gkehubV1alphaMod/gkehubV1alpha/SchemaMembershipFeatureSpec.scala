package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaMembershipFeatureSpec extends StObject {
  
  /**
    * Anthos Observability-specific spec
    */
  var anthosobservability: js.UndefOr[SchemaAnthosObservabilityMembershipSpec] = js.undefined
  
  /**
    * AnthosVM spec.
    */
  var anthosvm: js.UndefOr[SchemaAnthosVMMembershipSpec] = js.undefined
  
  /**
    * Cloud Build-specific spec
    */
  var cloudbuild: js.UndefOr[SchemaCloudBuildMembershipSpec] = js.undefined
  
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
  
  /**
    * Policy Controller spec.
    */
  var policycontroller: js.UndefOr[SchemaPolicyControllerMembershipSpec] = js.undefined
  
  /**
    * Workload Certificate spec.
    */
  var workloadcertificate: js.UndefOr[SchemaMembershipSpec] = js.undefined
}
object SchemaMembershipFeatureSpec {
  
  inline def apply(): SchemaMembershipFeatureSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMembershipFeatureSpec]
  }
  
  extension [Self <: SchemaMembershipFeatureSpec](x: Self) {
    
    inline def setAnthosobservability(value: SchemaAnthosObservabilityMembershipSpec): Self = StObject.set(x, "anthosobservability", value.asInstanceOf[js.Any])
    
    inline def setAnthosobservabilityUndefined: Self = StObject.set(x, "anthosobservability", js.undefined)
    
    inline def setAnthosvm(value: SchemaAnthosVMMembershipSpec): Self = StObject.set(x, "anthosvm", value.asInstanceOf[js.Any])
    
    inline def setAnthosvmUndefined: Self = StObject.set(x, "anthosvm", js.undefined)
    
    inline def setCloudbuild(value: SchemaCloudBuildMembershipSpec): Self = StObject.set(x, "cloudbuild", value.asInstanceOf[js.Any])
    
    inline def setCloudbuildUndefined: Self = StObject.set(x, "cloudbuild", js.undefined)
    
    inline def setConfigmanagement(value: SchemaConfigManagementMembershipSpec): Self = StObject.set(x, "configmanagement", value.asInstanceOf[js.Any])
    
    inline def setConfigmanagementUndefined: Self = StObject.set(x, "configmanagement", js.undefined)
    
    inline def setIdentityservice(value: SchemaIdentityServiceMembershipSpec): Self = StObject.set(x, "identityservice", value.asInstanceOf[js.Any])
    
    inline def setIdentityserviceUndefined: Self = StObject.set(x, "identityservice", js.undefined)
    
    inline def setMesh(value: SchemaServiceMeshMembershipSpec): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setMeshUndefined: Self = StObject.set(x, "mesh", js.undefined)
    
    inline def setPolicycontroller(value: SchemaPolicyControllerMembershipSpec): Self = StObject.set(x, "policycontroller", value.asInstanceOf[js.Any])
    
    inline def setPolicycontrollerUndefined: Self = StObject.set(x, "policycontroller", js.undefined)
    
    inline def setWorkloadcertificate(value: SchemaMembershipSpec): Self = StObject.set(x, "workloadcertificate", value.asInstanceOf[js.Any])
    
    inline def setWorkloadcertificateUndefined: Self = StObject.set(x, "workloadcertificate", js.undefined)
  }
}
