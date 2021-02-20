package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringFilter extends StObject {
  
  /** If true, the string value is case sensitive. */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /** The match type for this filter. */
  var matchType: js.UndefOr[String] = js.native
  
  /** The string value used for the matching. */
  var value: js.UndefOr[String] = js.native
}
object StringFilter {
  
  @scala.inline
  def apply(): StringFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringFilter]
  }
  
  @scala.inline
  implicit class StringFilterMutableBuilder[Self <: StringFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
    
    @scala.inline
    def setMatchType(value: String): Self = StObject.set(x, "matchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchTypeUndefined: Self = StObject.set(x, "matchType", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
