package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessNumericFilter extends StObject {
  
  /** The operation type for this filter. */
  var operation: js.UndefOr[String] = js.undefined
  
  /** A numeric value or a date value. */
  var value: js.UndefOr[GoogleAnalyticsAdminV1alphaNumericValue] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessNumericFilter {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessNumericFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessNumericFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAccessNumericFilter] (val x: Self) extends AnyVal {
    
    inline def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setValue(value: GoogleAnalyticsAdminV1alphaNumericValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
