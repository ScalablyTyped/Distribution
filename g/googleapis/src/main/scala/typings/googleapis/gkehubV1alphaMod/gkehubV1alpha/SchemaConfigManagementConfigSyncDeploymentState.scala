package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementConfigSyncDeploymentState extends StObject {
  
  /**
    * Deployment state of admission-webhook
    */
  var admissionWebhook: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deployment state of the git-sync pod
    */
  var gitSync: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deployment state of the importer pod
    */
  var importer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deployment state of the monitor pod
    */
  var monitor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deployment state of reconciler-manager pod
    */
  var reconcilerManager: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deployment state of root-reconciler
    */
  var rootReconciler: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Deployment state of the syncer pod
    */
  var syncer: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementConfigSyncDeploymentState {
  
  inline def apply(): SchemaConfigManagementConfigSyncDeploymentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementConfigSyncDeploymentState]
  }
  
  extension [Self <: SchemaConfigManagementConfigSyncDeploymentState](x: Self) {
    
    inline def setAdmissionWebhook(value: String): Self = StObject.set(x, "admissionWebhook", value.asInstanceOf[js.Any])
    
    inline def setAdmissionWebhookNull: Self = StObject.set(x, "admissionWebhook", null)
    
    inline def setAdmissionWebhookUndefined: Self = StObject.set(x, "admissionWebhook", js.undefined)
    
    inline def setGitSync(value: String): Self = StObject.set(x, "gitSync", value.asInstanceOf[js.Any])
    
    inline def setGitSyncNull: Self = StObject.set(x, "gitSync", null)
    
    inline def setGitSyncUndefined: Self = StObject.set(x, "gitSync", js.undefined)
    
    inline def setImporter(value: String): Self = StObject.set(x, "importer", value.asInstanceOf[js.Any])
    
    inline def setImporterNull: Self = StObject.set(x, "importer", null)
    
    inline def setImporterUndefined: Self = StObject.set(x, "importer", js.undefined)
    
    inline def setMonitor(value: String): Self = StObject.set(x, "monitor", value.asInstanceOf[js.Any])
    
    inline def setMonitorNull: Self = StObject.set(x, "monitor", null)
    
    inline def setMonitorUndefined: Self = StObject.set(x, "monitor", js.undefined)
    
    inline def setReconcilerManager(value: String): Self = StObject.set(x, "reconcilerManager", value.asInstanceOf[js.Any])
    
    inline def setReconcilerManagerNull: Self = StObject.set(x, "reconcilerManager", null)
    
    inline def setReconcilerManagerUndefined: Self = StObject.set(x, "reconcilerManager", js.undefined)
    
    inline def setRootReconciler(value: String): Self = StObject.set(x, "rootReconciler", value.asInstanceOf[js.Any])
    
    inline def setRootReconcilerNull: Self = StObject.set(x, "rootReconciler", null)
    
    inline def setRootReconcilerUndefined: Self = StObject.set(x, "rootReconciler", js.undefined)
    
    inline def setSyncer(value: String): Self = StObject.set(x, "syncer", value.asInstanceOf[js.Any])
    
    inline def setSyncerNull: Self = StObject.set(x, "syncer", null)
    
    inline def setSyncerUndefined: Self = StObject.set(x, "syncer", js.undefined)
  }
}
