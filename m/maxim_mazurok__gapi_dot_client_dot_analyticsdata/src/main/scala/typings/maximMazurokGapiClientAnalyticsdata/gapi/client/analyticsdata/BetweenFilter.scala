package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BetweenFilter extends js.Object {
  
  /** Begins with this number. */
  var fromValue: js.UndefOr[NumericValue] = js.native
  
  /** Ends with this number. */
  var toValue: js.UndefOr[NumericValue] = js.native
}
object BetweenFilter {
  
  @scala.inline
  def apply(): BetweenFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BetweenFilter]
  }
  
  @scala.inline
  implicit class BetweenFilterOps[Self <: BetweenFilter] (val x: Self) extends AnyVal {
    
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
    def setFromValue(value: NumericValue): Self = this.set("fromValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFromValue: Self = this.set("fromValue", js.undefined)
    
    @scala.inline
    def setToValue(value: NumericValue): Self = this.set("toValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToValue: Self = this.set("toValue", js.undefined)
  }
}
