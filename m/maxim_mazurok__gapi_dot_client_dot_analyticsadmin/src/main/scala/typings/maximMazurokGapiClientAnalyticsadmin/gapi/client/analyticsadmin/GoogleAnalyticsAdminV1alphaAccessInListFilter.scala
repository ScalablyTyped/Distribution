package typings.maximMazurokGapiClientAnalyticsadmin.gapi.client.analyticsadmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleAnalyticsAdminV1alphaAccessInListFilter extends StObject {
  
  /** If true, the string value is case sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /** The list of string values. Must be non-empty. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleAnalyticsAdminV1alphaAccessInListFilter {
  
  inline def apply(): GoogleAnalyticsAdminV1alphaAccessInListFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleAnalyticsAdminV1alphaAccessInListFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleAnalyticsAdminV1alphaAccessInListFilter] (val x: Self) extends AnyVal {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
