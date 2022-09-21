package typings.googleapis.v1alphaMod.analyticsadminV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePropertiesRunaccessreport
  extends StObject
     with StandardParameters {
  
  /**
    * The Data Access Report is requested for this property. For example if "123" is your GA4 property ID, then entity should be "properties/123".
    */
  var entity: js.UndefOr[String] = js.undefined
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaGoogleAnalyticsAdminV1alphaRunAccessReportRequest] = js.undefined
}
object ParamsResourcePropertiesRunaccessreport {
  
  inline def apply(): ParamsResourcePropertiesRunaccessreport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePropertiesRunaccessreport]
  }
  
  extension [Self <: ParamsResourcePropertiesRunaccessreport](x: Self) {
    
    inline def setEntity(value: String): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntityUndefined: Self = StObject.set(x, "entity", js.undefined)
    
    inline def setRequestBody(value: SchemaGoogleAnalyticsAdminV1alphaRunAccessReportRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
