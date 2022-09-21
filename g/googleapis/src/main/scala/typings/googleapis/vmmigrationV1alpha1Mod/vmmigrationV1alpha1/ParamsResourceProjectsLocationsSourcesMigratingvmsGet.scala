package typings.googleapis.vmmigrationV1alpha1Mod.vmmigrationV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsSourcesMigratingvmsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the MigratingVm.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The level of details of the migrating VM.
    */
  var view: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsSourcesMigratingvmsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsSourcesMigratingvmsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsSourcesMigratingvmsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsSourcesMigratingvmsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setView(value: String): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}
