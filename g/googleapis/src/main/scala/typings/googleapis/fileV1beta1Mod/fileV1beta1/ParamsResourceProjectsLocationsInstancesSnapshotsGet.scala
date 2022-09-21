package typings.googleapis.fileV1beta1Mod.fileV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsInstancesSnapshotsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The snapshot resource name, in the format `projects/{project_id\}/locations/{location\}/instances/{instance_id\}/snapshots/{snapshot_id\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsInstancesSnapshotsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsInstancesSnapshotsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsInstancesSnapshotsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsInstancesSnapshotsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
