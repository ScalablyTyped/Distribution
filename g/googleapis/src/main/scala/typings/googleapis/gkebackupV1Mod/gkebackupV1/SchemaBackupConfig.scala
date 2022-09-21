package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBackupConfig extends StObject {
  
  /**
    * If True, include all namespaced resources
    */
  var allNamespaces: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This defines a customer managed encryption key that will be used to encrypt the "config" portion (the Kubernetes resources) of Backups created via this plan. Default (empty): Config backup artifacts will not be encrypted.
    */
  var encryptionKey: js.UndefOr[SchemaEncryptionKey] = js.undefined
  
  /**
    * This flag specifies whether Kubernetes Secret resources should be included when they fall into the scope of Backups. Default: False
    */
  var includeSecrets: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * This flag specifies whether volume data should be backed up when PVCs are included in the scope of a Backup. Default: False
    */
  var includeVolumeData: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * If set, include just the resources referenced by the listed ProtectedApplications.
    */
  var selectedApplications: js.UndefOr[SchemaNamespacedNames] = js.undefined
  
  /**
    * If set, include just the resources in the listed namespaces.
    */
  var selectedNamespaces: js.UndefOr[SchemaNamespaces] = js.undefined
}
object SchemaBackupConfig {
  
  inline def apply(): SchemaBackupConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBackupConfig]
  }
  
  extension [Self <: SchemaBackupConfig](x: Self) {
    
    inline def setAllNamespaces(value: Boolean): Self = StObject.set(x, "allNamespaces", value.asInstanceOf[js.Any])
    
    inline def setAllNamespacesNull: Self = StObject.set(x, "allNamespaces", null)
    
    inline def setAllNamespacesUndefined: Self = StObject.set(x, "allNamespaces", js.undefined)
    
    inline def setEncryptionKey(value: SchemaEncryptionKey): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setIncludeSecrets(value: Boolean): Self = StObject.set(x, "includeSecrets", value.asInstanceOf[js.Any])
    
    inline def setIncludeSecretsNull: Self = StObject.set(x, "includeSecrets", null)
    
    inline def setIncludeSecretsUndefined: Self = StObject.set(x, "includeSecrets", js.undefined)
    
    inline def setIncludeVolumeData(value: Boolean): Self = StObject.set(x, "includeVolumeData", value.asInstanceOf[js.Any])
    
    inline def setIncludeVolumeDataNull: Self = StObject.set(x, "includeVolumeData", null)
    
    inline def setIncludeVolumeDataUndefined: Self = StObject.set(x, "includeVolumeData", js.undefined)
    
    inline def setSelectedApplications(value: SchemaNamespacedNames): Self = StObject.set(x, "selectedApplications", value.asInstanceOf[js.Any])
    
    inline def setSelectedApplicationsUndefined: Self = StObject.set(x, "selectedApplications", js.undefined)
    
    inline def setSelectedNamespaces(value: SchemaNamespaces): Self = StObject.set(x, "selectedNamespaces", value.asInstanceOf[js.Any])
    
    inline def setSelectedNamespacesUndefined: Self = StObject.set(x, "selectedNamespaces", js.undefined)
  }
}
