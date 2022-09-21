package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAnthosVMSubFeatureState extends StObject {
  
  /**
    * Description represents human readable description of the subfeature state. If the deployment failed, this should also contain the reason for the failure.
    */
  var description: js.UndefOr[String | Null] = js.undefined
  
  /**
    * InstallationState represents the state of installation of the subfeature in the cluster.
    */
  var installationState: js.UndefOr[String | Null] = js.undefined
  
  /**
    * MigrateState represents the state of the Migrate subfeature.
    */
  var migrateState: js.UndefOr[SchemaMigrateState] = js.undefined
  
  /**
    * ServiceMeshState represents the state of the Service Mesh subfeature.
    */
  var serviceMeshState: js.UndefOr[SchemaServiceMeshState] = js.undefined
}
object SchemaAnthosVMSubFeatureState {
  
  inline def apply(): SchemaAnthosVMSubFeatureState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnthosVMSubFeatureState]
  }
  
  extension [Self <: SchemaAnthosVMSubFeatureState](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInstallationState(value: String): Self = StObject.set(x, "installationState", value.asInstanceOf[js.Any])
    
    inline def setInstallationStateNull: Self = StObject.set(x, "installationState", null)
    
    inline def setInstallationStateUndefined: Self = StObject.set(x, "installationState", js.undefined)
    
    inline def setMigrateState(value: SchemaMigrateState): Self = StObject.set(x, "migrateState", value.asInstanceOf[js.Any])
    
    inline def setMigrateStateUndefined: Self = StObject.set(x, "migrateState", js.undefined)
    
    inline def setServiceMeshState(value: SchemaServiceMeshState): Self = StObject.set(x, "serviceMeshState", value.asInstanceOf[js.Any])
    
    inline def setServiceMeshStateUndefined: Self = StObject.set(x, "serviceMeshState", js.undefined)
  }
}
