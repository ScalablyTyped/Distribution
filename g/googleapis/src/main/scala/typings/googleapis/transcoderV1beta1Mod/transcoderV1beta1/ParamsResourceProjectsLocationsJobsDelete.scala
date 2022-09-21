package typings.googleapis.transcoderV1beta1Mod.transcoderV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsJobsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the job to delete. Format: `projects/{project\}/locations/{location\}/jobs/{job\}`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsJobsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsJobsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsJobsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsJobsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
