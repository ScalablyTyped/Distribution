package typings.googleapis.eventarcV1Mod.eventarcV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsTriggersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the trigger to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsTriggersGet {
  
  inline def apply(): ParamsResourceProjectsLocationsTriggersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsTriggersGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsTriggersGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
