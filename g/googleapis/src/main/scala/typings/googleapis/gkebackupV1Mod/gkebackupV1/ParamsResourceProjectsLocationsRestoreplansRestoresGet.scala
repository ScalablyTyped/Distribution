package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRestoreplansRestoresGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the restore resource. Format: `projects/x/locations/x/restorePlans/x/restores/x`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRestoreplansRestoresGet {
  
  inline def apply(): ParamsResourceProjectsLocationsRestoreplansRestoresGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRestoreplansRestoresGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRestoreplansRestoresGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
