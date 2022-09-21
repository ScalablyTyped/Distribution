package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstancesBackupsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the backup to delete. Values are of the form `projects//instances//backups/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstancesBackupsDelete {
  
  inline def apply(): ParamsResourceProjectsInstancesBackupsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstancesBackupsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsInstancesBackupsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
