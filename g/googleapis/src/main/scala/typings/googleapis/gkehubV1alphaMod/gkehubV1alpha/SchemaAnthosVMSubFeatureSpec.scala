package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnthosVMSubFeatureSpec extends StObject {
  
  /**
    * Indicates whether the subfeature should be enabled on the cluster or not. If set to true, the subfeature's control plane and resources will be installed in the cluster. If set to false, the oneof spec if present will be ignored and nothing will be installed in the cluster.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * MigrateSpec repsents the configuration for Migrate subfeature.
    */
  var migrateSpec: js.UndefOr[SchemaMigrateSpec] = js.undefined
  
  /**
    * ServiceMeshSpec repsents the configuration for Service Mesh subfeature.
    */
  var serviceMeshSpec: js.UndefOr[SchemaServiceMeshSpec] = js.undefined
}
object SchemaAnthosVMSubFeatureSpec {
  
  inline def apply(): SchemaAnthosVMSubFeatureSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnthosVMSubFeatureSpec]
  }
  
  extension [Self <: SchemaAnthosVMSubFeatureSpec](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMigrateSpec(value: SchemaMigrateSpec): Self = StObject.set(x, "migrateSpec", value.asInstanceOf[js.Any])
    
    inline def setMigrateSpecUndefined: Self = StObject.set(x, "migrateSpec", js.undefined)
    
    inline def setServiceMeshSpec(value: SchemaServiceMeshSpec): Self = StObject.set(x, "serviceMeshSpec", value.asInstanceOf[js.Any])
    
    inline def setServiceMeshSpecUndefined: Self = StObject.set(x, "serviceMeshSpec", js.undefined)
  }
}
