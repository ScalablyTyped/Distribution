package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessDimension extends StObject {
  
  /**
    * The API name of the dimension. See [Data Access Schema](https://developers.google.com/analytics/devguides/config/admin/v1/access-api-schema) for the list of dimensions supported in
    * this API. Dimensions are referenced by name in `dimensionFilter` and `orderBys`.
    */
  var dimensionName: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessDimension {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessDimension]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAccessDimension](x: Self) {
    
    inline def setDimensionName(value: String): Self = StObject.set(x, "dimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "dimensionName", js.undefined)
  }
}
