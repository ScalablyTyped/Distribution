package typings.maximMazurokGapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreezePeriod extends js.Object {
  
  /**
    * The end date (inclusive) of the freeze period. Must be no later than 90 days from the start date. If the end date is earlier than the start date, the freeze period is considered
    * wrapping year-end. Note: year must not be set. For example, {"month": 1,"date": 30}.
    */
  var endDate: js.UndefOr[Date] = js.native
  
  /** The start date (inclusive) of the freeze period. Note: year must not be set. For example, {"month": 1,"date": 30}. */
  var startDate: js.UndefOr[Date] = js.native
}
object FreezePeriod {
  
  @scala.inline
  def apply(): FreezePeriod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FreezePeriod]
  }
  
  @scala.inline
  implicit class FreezePeriodOps[Self <: FreezePeriod] (val x: Self) extends AnyVal {
    
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
    def setEndDate(value: Date): Self = this.set("endDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    
    @scala.inline
    def setStartDate(value: Date): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
}
