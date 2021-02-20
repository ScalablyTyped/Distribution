package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InListFilter extends StObject {
  
  /** If true, the string value is case sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /** The list of string values. Must be non-empty. */
  var values: js.UndefOr[js.Array[String]] = js.native
}
object InListFilter {
  
  @scala.inline
  def apply(): InListFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InListFilter]
  }
  
  @scala.inline
  implicit class InListFilterMutableBuilder[Self <: InListFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
