package typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalDomainsBackupsCreate
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Backup Id, unique name to identify the backups with the following restrictions: * Must be lowercase letters, numbers, and hyphens * Must start with a letter. * Must contain between 1-63 characters. * Must end with a number or a letter. * Must be unique within the domain.
    */
  var backupId: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The domain resource name using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}`
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaBackup] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalDomainsBackupsCreate {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalDomainsBackupsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalDomainsBackupsCreate]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalDomainsBackupsCreate](x: Self) {
    
    inline def setBackupId(value: String): Self = StObject.set(x, "backupId", value.asInstanceOf[js.Any])
    
    inline def setBackupIdUndefined: Self = StObject.set(x, "backupId", js.undefined)
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setRequestBody(value: SchemaBackup): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
