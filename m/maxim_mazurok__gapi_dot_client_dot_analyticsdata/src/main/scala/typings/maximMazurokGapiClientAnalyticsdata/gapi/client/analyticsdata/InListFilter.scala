package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InListFilter extends StObject {
  
  /** If true, the string value is case sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  
  /** The list of string values. Must be non-empty. */
  var values: js.UndefOr[js.Array[String]] = js.undefined
}
object InListFilter {
  
  inline def apply(): InListFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InListFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InListFilter] (val x: Self) extends AnyVal {
    
    inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
