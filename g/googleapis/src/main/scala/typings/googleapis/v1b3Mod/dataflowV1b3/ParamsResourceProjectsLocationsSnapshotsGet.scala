package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSnapshotsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The location that contains this snapshot.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Cloud Platform project that the snapshot belongs to.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var snapshotId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSnapshotsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsSnapshotsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSnapshotsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSnapshotsGet](x: Self) {
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "snapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "snapshotId", js.undefined)
  }
}
