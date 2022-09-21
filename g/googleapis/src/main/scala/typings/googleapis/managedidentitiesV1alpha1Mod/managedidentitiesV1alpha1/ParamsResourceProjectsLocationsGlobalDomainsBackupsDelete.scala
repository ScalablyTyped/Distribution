package typings.googleapis.managedidentitiesV1alpha1Mod.managedidentitiesV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsGlobalDomainsBackupsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The backup resource name using the form: `projects/{project_id\}/locations/global/domains/{domain_name\}/backups/{backup_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsGlobalDomainsBackupsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsGlobalDomainsBackupsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsGlobalDomainsBackupsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsGlobalDomainsBackupsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
