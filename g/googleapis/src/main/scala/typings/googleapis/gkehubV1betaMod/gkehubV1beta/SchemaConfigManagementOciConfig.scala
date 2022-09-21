package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementOciConfig extends StObject {
  
  /**
    * The GCP Service Account Email used for auth when secret_type is gcpServiceAccount.
    */
  var gcpServiceAccountEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The absolute path of the directory that contains the local resources. Default: the root directory of the image.
    */
  var policyDir: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of secret configured for access to the Git repo.
    */
  var secretType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The OCI image repository URL for the package to sync from. e.g. `LOCATION-docker.pkg.dev/PROJECT_ID/REPOSITORY_NAME/PACKAGE_NAME`.
    */
  var syncRepo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Period in seconds between consecutive syncs. Default: 15.
    */
  var syncWaitSecs: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementOciConfig {
  
  inline def apply(): SchemaConfigManagementOciConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementOciConfig]
  }
  
  extension [Self <: SchemaConfigManagementOciConfig](x: Self) {
    
    inline def setGcpServiceAccountEmail(value: String): Self = StObject.set(x, "gcpServiceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setGcpServiceAccountEmailNull: Self = StObject.set(x, "gcpServiceAccountEmail", null)
    
    inline def setGcpServiceAccountEmailUndefined: Self = StObject.set(x, "gcpServiceAccountEmail", js.undefined)
    
    inline def setPolicyDir(value: String): Self = StObject.set(x, "policyDir", value.asInstanceOf[js.Any])
    
    inline def setPolicyDirNull: Self = StObject.set(x, "policyDir", null)
    
    inline def setPolicyDirUndefined: Self = StObject.set(x, "policyDir", js.undefined)
    
    inline def setSecretType(value: String): Self = StObject.set(x, "secretType", value.asInstanceOf[js.Any])
    
    inline def setSecretTypeNull: Self = StObject.set(x, "secretType", null)
    
    inline def setSecretTypeUndefined: Self = StObject.set(x, "secretType", js.undefined)
    
    inline def setSyncRepo(value: String): Self = StObject.set(x, "syncRepo", value.asInstanceOf[js.Any])
    
    inline def setSyncRepoNull: Self = StObject.set(x, "syncRepo", null)
    
    inline def setSyncRepoUndefined: Self = StObject.set(x, "syncRepo", js.undefined)
    
    inline def setSyncWaitSecs(value: String): Self = StObject.set(x, "syncWaitSecs", value.asInstanceOf[js.Any])
    
    inline def setSyncWaitSecsNull: Self = StObject.set(x, "syncWaitSecs", null)
    
    inline def setSyncWaitSecsUndefined: Self = StObject.set(x, "syncWaitSecs", js.undefined)
  }
}
