package typings.googleapis.gkehubV1betaMod.gkehubV1beta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaConfigManagementConfigSync extends StObject {
  
  /**
    * Enables the installation of ConfigSync. If set to true, ConfigSync resources will be created and the other ConfigSync fields will be applied if exist. If set to false, all other ConfigSync fields will be ignored, ConfigSync resources will be deleted. If omitted, ConfigSync resources will be managed depends on the presence of git field.
    */
  var enabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Git repo configuration for the cluster.
    */
  var git: js.UndefOr[SchemaConfigManagementGitConfig] = js.undefined
  
  /**
    * OCI repo configuration for the cluster
    */
  var oci: js.UndefOr[SchemaConfigManagementOciConfig] = js.undefined
  
  /**
    * Set to true to enable the Config Sync admission webhook to prevent drifts. If set to `false`, disables the Config Sync admission webhook and does not prevent drifts.
    */
  var preventDrift: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Specifies whether the Config Sync Repo is in “hierarchical” or “unstructured” mode.
    */
  var sourceFormat: js.UndefOr[String | Null] = js.undefined
}
object SchemaConfigManagementConfigSync {
  
  inline def apply(): SchemaConfigManagementConfigSync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConfigManagementConfigSync]
  }
  
  extension [Self <: SchemaConfigManagementConfigSync](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledNull: Self = StObject.set(x, "enabled", null)
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setGit(value: SchemaConfigManagementGitConfig): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
    
    inline def setGitUndefined: Self = StObject.set(x, "git", js.undefined)
    
    inline def setOci(value: SchemaConfigManagementOciConfig): Self = StObject.set(x, "oci", value.asInstanceOf[js.Any])
    
    inline def setOciUndefined: Self = StObject.set(x, "oci", js.undefined)
    
    inline def setPreventDrift(value: Boolean): Self = StObject.set(x, "preventDrift", value.asInstanceOf[js.Any])
    
    inline def setPreventDriftNull: Self = StObject.set(x, "preventDrift", null)
    
    inline def setPreventDriftUndefined: Self = StObject.set(x, "preventDrift", js.undefined)
    
    inline def setSourceFormat(value: String): Self = StObject.set(x, "sourceFormat", value.asInstanceOf[js.Any])
    
    inline def setSourceFormatNull: Self = StObject.set(x, "sourceFormat", null)
    
    inline def setSourceFormatUndefined: Self = StObject.set(x, "sourceFormat", js.undefined)
  }
}
