package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRestoreplansGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Fully qualified RestorePlan name. Format: `projects/x/locations/x/restorePlans/x`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRestoreplansGet {
  
  inline def apply(): ParamsResourceProjectsLocationsRestoreplansGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRestoreplansGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRestoreplansGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
