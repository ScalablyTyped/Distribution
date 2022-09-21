package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRestoreplansRestoresDelete
  extends StObject
     with StandardParameters {
  
  /**
    * If provided, this value must match the current value of the target Restore's etag field or the request is rejected.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * If set to true, any VolumeRestores below this restore will also be deleted. Otherwise, the request will only succeed if the restore has no VolumeRestores.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required. Full name of the Restore Format: `projects/x/locations/x/restorePlans/x/restores/x`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRestoreplansRestoresDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsRestoreplansRestoresDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRestoreplansRestoresDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRestoreplansRestoresDelete](x: Self) {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
