package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the provider to delete.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersDelete {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersDelete]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkloadidentitypoolsProvidersDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
