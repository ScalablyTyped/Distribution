package typings.googleapis.pubsubV1Mod.pubsubV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsSnapshotsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the snapshot to delete. Format is `projects/{project\}/snapshots/{snap\}`.
    */
  var snapshot: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsSnapshotsDelete {
  
  inline def apply(): ParamsResourceProjectsSnapshotsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsSnapshotsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsSnapshotsDelete](x: Self) {
    
    inline def setSnapshot(value: String): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}
