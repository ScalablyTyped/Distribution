package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the User data mapping to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsDatasetsConsentstoresUserdatamappingsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
