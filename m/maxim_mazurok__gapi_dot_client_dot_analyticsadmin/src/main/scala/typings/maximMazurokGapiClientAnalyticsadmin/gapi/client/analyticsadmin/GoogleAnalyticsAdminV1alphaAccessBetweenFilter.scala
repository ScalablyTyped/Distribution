package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessBetweenFilter extends StObject {
  
  /** Begins with this number. */
  var fromValue: js.UndefOr[GoogleAnalyticsAdminV1alphaNumericValue] = js.undefined
  
  /** Ends with this number. */
  var toValue: js.UndefOr[GoogleAnalyticsAdminV1alphaNumericValue] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessBetweenFilter {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessBetweenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessBetweenFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAccessBetweenFilter] (val x: Self) extends AnyVal {
    
    inline def setFromValue(value: GoogleAnalyticsAdminV1alphaNumericValue): Self = StObject.set(x, "fromValue", value.asInstanceOf[js.Any])
    
    inline def setFromValueUndefined: Self = StObject.set(x, "fromValue", js.undefined)
    
    inline def setToValue(value: GoogleAnalyticsAdminV1alphaNumericValue): Self = StObject.set(x, "toValue", value.asInstanceOf[js.Any])
    
    inline def setToValueUndefined: Self = StObject.set(x, "toValue", js.undefined)
  }
}
