package typings.googleapis.gkebackupV1Mod.gkebackupV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsRestoreplansRestoresVolumerestoresGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Full name of the VolumeRestore resource. Format: `projects/x/locations/x/restorePlans/x/restores/x/volumeRestores/x`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsRestoreplansRestoresVolumerestoresGet {
  
  inline def apply(): ParamsResourceProjectsLocationsRestoreplansRestoresVolumerestoresGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsRestoreplansRestoresVolumerestoresGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsRestoreplansRestoresVolumerestoresGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
