package typings.googleapis.contactcenterinsightsV1Mod.contactcenterinsightsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsPhrasematchersGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the phrase matcher to get.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsPhrasematchersGet {
  
  inline def apply(): ParamsResourceProjectsLocationsPhrasematchersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsPhrasematchersGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsPhrasematchersGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
