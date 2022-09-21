package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVitalsCrashrateGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name. Format: apps/{app\}/crashRateMetricSet
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceVitalsCrashrateGet {
  
  inline def apply(): ParamsResourceVitalsCrashrateGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVitalsCrashrateGet]
  }
  
  extension [Self <: ParamsResourceVitalsCrashrateGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
