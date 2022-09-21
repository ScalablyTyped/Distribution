package typings.googleapis.iamV1Mod.iamV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsWorkloadidentitypoolsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the pool to retrieve.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsWorkloadidentitypoolsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsWorkloadidentitypoolsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsWorkloadidentitypoolsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsWorkloadidentitypoolsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
