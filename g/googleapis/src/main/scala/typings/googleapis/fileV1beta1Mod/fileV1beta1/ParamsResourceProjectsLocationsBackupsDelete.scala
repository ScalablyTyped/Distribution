package typings.googleapis.fileV1beta1Mod.fileV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsBackupsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The backup resource name, in the format `projects/{project_id\}/locations/{location\}/backups/{backup_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsBackupsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsBackupsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsBackupsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsBackupsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
