package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceLocationsGlobalMetricsscopesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name of the Metrics Scope. Example: locations/global/metricsScopes/{SCOPING_PROJECT_ID_OR_NUMBER\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceLocationsGlobalMetricsscopesGet {
  
  inline def apply(): ParamsResourceLocationsGlobalMetricsscopesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceLocationsGlobalMetricsscopesGet]
  }
  
  extension [Self <: ParamsResourceLocationsGlobalMetricsscopesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
