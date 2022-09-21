package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBackupplansDelete
  extends StObject
     with StandardParameters {
  
  /**
    * If provided, this value must match the current value of the target BackupPlan's etag field or the request is rejected.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * Required. Fully qualified BackupPlan name. Format: `projects/x/locations/x/backupPlans/x`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsBackupplansDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsBackupplansDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBackupplansDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBackupplansDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
