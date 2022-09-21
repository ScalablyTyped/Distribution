package typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVitalsErrorsCountsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Name of the errors metric set. Format: apps/{app\}/errorCountMetricSet
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceVitalsErrorsCountsGet {
  
  inline def apply(): ParamsResourceVitalsErrorsCountsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVitalsErrorsCountsGet]
  }
  
  extension [Self <: ParamsResourceVitalsErrorsCountsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
