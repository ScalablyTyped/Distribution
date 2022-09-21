package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesCustommetricsArchive
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the CustomMetric to archive. Example format: properties/1234/customMetrics/5678
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaArchiveCustomMetricRequest] = js.undefined
}
object ParamsResourcePropertiesCustommetricsArchive {
  
  inline def apply(): ParamsResourcePropertiesCustommetricsArchive = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesCustommetricsArchive]
  }
  
  extension [Self <: ParamsResourcePropertiesCustommetricsArchive](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaArchiveCustomMetricRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
