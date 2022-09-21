package typings.googleapis.playdeveloperreportingV1alpha1Mod.playdeveloperreportingV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceVitalsExcessivewakeuprateQuery
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The resource name. Format: apps/{app\}/excessiveWakeupRateMetricSet
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[
    SchemaGooglePlayDeveloperReportingV1alpha1QueryExcessiveWakeupRateMetricSetRequest
  ] = js.undefined
}
object ParamsResourceVitalsExcessivewakeuprateQuery {
  
  inline def apply(): ParamsResourceVitalsExcessivewakeuprateQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceVitalsExcessivewakeuprateQuery]
  }
  
  extension [Self <: ParamsResourceVitalsExcessivewakeuprateQuery](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGooglePlayDeveloperReportingV1alpha1QueryExcessiveWakeupRateMetricSetRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
