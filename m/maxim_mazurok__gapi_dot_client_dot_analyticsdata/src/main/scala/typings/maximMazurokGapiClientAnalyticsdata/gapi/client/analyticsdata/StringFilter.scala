package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StringFilter extends js.Object {
  
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
  implicit class StringFilterOps[Self <: StringFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setMatchType(value: String): Self = this.set("matchType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchType: Self = this.set("matchType", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
