package typings.googleapis.playdeveloperreportingV1beta1Mod.playdeveloperreportingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVitalsStuckbackgroundwakelockrateQuery
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name. Format: apps/{app\}/stuckBackgroundWakelockRateMetricSet
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[
    SchemaGooglePlayDeveloperReportingV1beta1QueryStuckBackgroundWakelockRateMetricSetRequest
  ] = js.undefined
}
object ParamsResourceVitalsStuckbackgroundwakelockrateQuery {
  
  inline def apply(): ParamsResourceVitalsStuckbackgroundwakelockrateQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVitalsStuckbackgroundwakelockrateQuery]
  }
  
  extension [Self <: ParamsResourceVitalsStuckbackgroundwakelockrateQuery](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGooglePlayDeveloperReportingV1beta1QueryStuckBackgroundWakelockRateMetricSetRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
