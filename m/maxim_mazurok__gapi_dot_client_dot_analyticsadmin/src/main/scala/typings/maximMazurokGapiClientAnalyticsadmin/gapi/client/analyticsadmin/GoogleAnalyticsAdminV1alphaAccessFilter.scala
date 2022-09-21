package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessFilter extends StObject {
  
  /** A filter for two values. */
  var betweenFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessBetweenFilter] = js.undefined
  
  /** The dimension name or metric name. */
  var fieldName: js.UndefOr[String] = js.undefined
  
  /** A filter for in list values. */
  var inListFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessInListFilter] = js.undefined
  
  /** A filter for numeric or date values. */
  var numericFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessNumericFilter] = js.undefined
  
  /** Strings related filter. */
  var stringFilter: js.UndefOr[GoogleAnalyticsAdminV1alphaAccessStringFilter] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessFilter {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessFilter]
  }
  
  extension [Self <: GoogleAnalyticsAdminV1alphaAccessFilter](x: Self) {
    
    inline def setBetweenFilter(value: GoogleAnalyticsAdminV1alphaAccessBetweenFilter): Self = StObject.set(x, "betweenFilter", value.asInstanceOf[js.Any])
    
    inline def setBetweenFilterUndefined: Self = StObject.set(x, "betweenFilter", js.undefined)
    
    inline def setFieldName(value: String): Self = StObject.set(x, "fieldName", value.asInstanceOf[js.Any])
    
    inline def setFieldNameUndefined: Self = StObject.set(x, "fieldName", js.undefined)
    
    inline def setInListFilter(value: GoogleAnalyticsAdminV1alphaAccessInListFilter): Self = StObject.set(x, "inListFilter", value.asInstanceOf[js.Any])
    
    inline def setInListFilterUndefined: Self = StObject.set(x, "inListFilter", js.undefined)
    
    inline def setNumericFilter(value: GoogleAnalyticsAdminV1alphaAccessNumericFilter): Self = StObject.set(x, "numericFilter", value.asInstanceOf[js.Any])
    
    inline def setNumericFilterUndefined: Self = StObject.set(x, "numericFilter", js.undefined)
    
    inline def setStringFilter(value: GoogleAnalyticsAdminV1alphaAccessStringFilter): Self = StObject.set(x, "stringFilter", value.asInstanceOf[js.Any])
    
    inline def setStringFilterUndefined: Self = StObject.set(x, "stringFilter", js.undefined)
  }
}
