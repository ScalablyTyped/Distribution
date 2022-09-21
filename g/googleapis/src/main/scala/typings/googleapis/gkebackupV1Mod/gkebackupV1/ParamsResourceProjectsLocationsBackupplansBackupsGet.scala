package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBackupplansBackupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Full name of the Backup resource. Format: `projects/x/locations/x/backupPlans/x/backups/x`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsBackupplansBackupsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsBackupplansBackupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBackupplansBackupsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBackupplansBackupsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
