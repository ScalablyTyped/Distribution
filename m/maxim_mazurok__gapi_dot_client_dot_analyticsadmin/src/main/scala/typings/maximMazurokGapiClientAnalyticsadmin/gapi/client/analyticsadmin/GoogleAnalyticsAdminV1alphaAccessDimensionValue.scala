package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessDimensionValue extends StObject {
  
  /** The dimension value. For example, this value may be 'France' for the 'country' dimension. */
  var value: js.UndefOr[String] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessDimensionValue {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessDimensionValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessDimensionValue]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAccessDimensionValue](x: Self) {
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
