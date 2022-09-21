package typings.googleapis.fileV1Mod.fileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBackupsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The backup resource name, in the format `projects/{project_number\}/locations/{location\}/backups/{backup_id\}`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsBackupsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsBackupsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBackupsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBackupsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
