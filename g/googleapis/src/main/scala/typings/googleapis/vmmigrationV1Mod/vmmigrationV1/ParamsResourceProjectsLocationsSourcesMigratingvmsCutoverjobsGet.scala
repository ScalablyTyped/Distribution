package typings.googleapis.vmmigrationV1Mod.vmmigrationV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the CutoverJob.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSourcesMigratingvmsCutoverjobsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
