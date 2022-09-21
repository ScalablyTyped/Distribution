package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementConfigSyncState extends StObject {
  
  /**
    * Information about the deployment of ConfigSync, including the version of the various Pods deployed
    */
  var deploymentState: js.UndefOr[SchemaConfigManagementConfigSyncDeploymentState] = js.undefined
  
  /**
    * The state of ConfigSync's process to sync configs to a cluster
    */
  var syncState: js.UndefOr[SchemaConfigManagementSyncState] = js.undefined
  
  /**
    * The version of ConfigSync deployed
    */
  var version: js.UndefOr[SchemaConfigManagementConfigSyncVersion] = js.undefined
}
object SchemaConfigManagementConfigSyncState {
  
  inline def apply(): SchemaConfigManagementConfigSyncState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementConfigSyncState]
  }
  
  extension [Self <: SchemaConfigManagementConfigSyncState](x: Self) {
    
    inline def setDeploymentState(value: SchemaConfigManagementConfigSyncDeploymentState): Self = StObject.set(x, "deploymentState", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStateUndefined: Self = StObject.set(x, "deploymentState", js.undefined)
    
    inline def setSyncState(value: SchemaConfigManagementSyncState): Self = StObject.set(x, "syncState", value.asInstanceOf[js.Any])
    
    inline def setSyncStateUndefined: Self = StObject.set(x, "syncState", js.undefined)
    
    inline def setVersion(value: SchemaConfigManagementConfigSyncVersion): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
