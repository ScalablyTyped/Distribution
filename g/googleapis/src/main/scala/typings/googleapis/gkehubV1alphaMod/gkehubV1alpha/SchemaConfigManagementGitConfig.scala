package typings.googleapis.gkehubV1alphaMod.gkehubV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementGitConfig extends StObject {
  
  /**
    * The GCP Service Account Email used for auth when secret_type is gcpServiceAccount.
    */
  var gcpServiceAccountEmail: js.UndefOr[String | Null] = js.undefined
  
  /**
    * URL for the HTTPS proxy to be used when communicating with the Git repo.
    */
  var httpsProxy: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The path within the Git repository that represents the top level of the repo to sync. Default: the root directory of the repository.
    */
  var policyDir: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of secret configured for access to the Git repo. Must be one of ssh, cookiefile, gcenode, token, gcpserviceaccount or none. The validation of this is case-sensitive. Required.
    */
  var secretType: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The branch of the repository to sync from. Default: master.
    */
  var syncBranch: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The URL of the Git repository to use as the source of truth.
    */
  var syncRepo: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Git revision (tag or hash) to check out. Default HEAD.
    */
  var syncRev: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Period in seconds between consecutive syncs. Default: 15.
    */
  var syncWaitSecs: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementGitConfig {
  
  inline def apply(): SchemaConfigManagementGitConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementGitConfig]
  }
  
  extension [Self <: SchemaConfigManagementGitConfig](x: Self) {
    
    inline def setGcpServiceAccountEmail(value: String): Self = StObject.set(x, "gcpServiceAccountEmail", value.asInstanceOf[js.Any])
    
    inline def setGcpServiceAccountEmailNull: Self = StObject.set(x, "gcpServiceAccountEmail", null)
    
    inline def setGcpServiceAccountEmailUndefined: Self = StObject.set(x, "gcpServiceAccountEmail", js.undefined)
    
    inline def setHttpsProxy(value: String): Self = StObject.set(x, "httpsProxy", value.asInstanceOf[js.Any])
    
    inline def setHttpsProxyNull: Self = StObject.set(x, "httpsProxy", null)
    
    inline def setHttpsProxyUndefined: Self = StObject.set(x, "httpsProxy", js.undefined)
    
    inline def setPolicyDir(value: String): Self = StObject.set(x, "policyDir", value.asInstanceOf[js.Any])
    
    inline def setPolicyDirNull: Self = StObject.set(x, "policyDir", null)
    
    inline def setPolicyDirUndefined: Self = StObject.set(x, "policyDir", js.undefined)
    
    inline def setSecretType(value: String): Self = StObject.set(x, "secretType", value.asInstanceOf[js.Any])
    
    inline def setSecretTypeNull: Self = StObject.set(x, "secretType", null)
    
    inline def setSecretTypeUndefined: Self = StObject.set(x, "secretType", js.undefined)
    
    inline def setSyncBranch(value: String): Self = StObject.set(x, "syncBranch", value.asInstanceOf[js.Any])
    
    inline def setSyncBranchNull: Self = StObject.set(x, "syncBranch", null)
    
    inline def setSyncBranchUndefined: Self = StObject.set(x, "syncBranch", js.undefined)
    
    inline def setSyncRepo(value: String): Self = StObject.set(x, "syncRepo", value.asInstanceOf[js.Any])
    
    inline def setSyncRepoNull: Self = StObject.set(x, "syncRepo", null)
    
    inline def setSyncRepoUndefined: Self = StObject.set(x, "syncRepo", js.undefined)
    
    inline def setSyncRev(value: String): Self = StObject.set(x, "syncRev", value.asInstanceOf[js.Any])
    
    inline def setSyncRevNull: Self = StObject.set(x, "syncRev", null)
    
    inline def setSyncRevUndefined: Self = StObject.set(x, "syncRev", js.undefined)
    
    inline def setSyncWaitSecs(value: String): Self = StObject.set(x, "syncWaitSecs", value.asInstanceOf[js.Any])
    
    inline def setSyncWaitSecsNull: Self = StObject.set(x, "syncWaitSecs", null)
    
    inline def setSyncWaitSecsUndefined: Self = StObject.set(x, "syncWaitSecs", js.undefined)
  }
}
