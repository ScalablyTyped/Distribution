package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSnapshotsList
  extends StObject
     with StandardParameters {
  
  /**
    * If specified, list snapshots created from this job.
    */
  var jobId: js.UndefOr[String] = js.undefined
  
  /**
    * The location to list snapshots in.
    */
  var location: js.UndefOr[String] = js.undefined
  
  /**
    * The project ID to list snapshots for.
    */
  var projectId: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSnapshotsList {
  
  inline def apply(): ParamsResourceProjectsLocationsSnapshotsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSnapshotsList]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSnapshotsList](x: Self) {
    
    inline def setJobId(value: String): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
  }
}
