package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Full name of the VolumeBackup resource. Format: `projects/x/locations/x/backupPlans/x/backups/x/volumeBackups/x`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBackupplansBackupsVolumebackupsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
