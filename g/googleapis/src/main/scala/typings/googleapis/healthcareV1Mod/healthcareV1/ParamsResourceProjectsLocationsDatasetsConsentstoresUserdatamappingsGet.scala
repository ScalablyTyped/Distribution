package typings.googleapis.healthcareV1Mod.healthcareV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the User data mapping to retrieve.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
