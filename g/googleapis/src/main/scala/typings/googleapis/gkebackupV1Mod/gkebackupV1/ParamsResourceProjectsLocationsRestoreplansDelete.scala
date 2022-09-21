package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRestoreplansDelete
  extends StObject
     with StandardParameters {
  
  /**
    * If provided, this value must match the current value of the target RestorePlan's etag field or the request is rejected.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, any Restores below this RestorePlan will also be deleted. Otherwise, the request will only succeed if the RestorePlan has no Restores.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Fully qualified RestorePlan name. Format: `projects/x/locations/x/restorePlans/x`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRestoreplansDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsRestoreplansDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRestoreplansDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRestoreplansDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
