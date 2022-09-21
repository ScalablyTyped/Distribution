package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementConfigSyncVersion extends StObject {
  
  /**
    * Version of the deployed admission_webhook pod
    */
  var admissionWebhook: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the deployed git-sync pod
    */
  var gitSync: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the deployed importer pod
    */
  var importer: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the deployed monitor pod
    */
  var monitor: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the deployed reconciler-manager pod
    */
  var reconcilerManager: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the deployed reconciler container in root-reconciler pod
    */
  var rootReconciler: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Version of the deployed syncer pod
    */
  var syncer: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementConfigSyncVersion {
  
  inline def apply(): SchemaConfigManagementConfigSyncVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementConfigSyncVersion]
  }
  
  extension [Self <: SchemaConfigManagementConfigSyncVersion](x: Self) {
    
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
