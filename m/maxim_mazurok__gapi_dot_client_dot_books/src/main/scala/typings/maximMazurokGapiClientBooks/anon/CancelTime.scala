package typings.maximMazurokGapiClientBooks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelTime extends js.Object {
  
  var cancelTime: js.UndefOr[String] = js.native
  
  var currentReleaseInfo: js.UndefOr[AmountInMicros] = js.native
  
  var nextReleaseInfo: js.UndefOr[AmountInMicros] = js.native
  
  var seriesSubscriptionType: js.UndefOr[String] = js.native
}
object CancelTime {
  
  @scala.inline
  def apply(): CancelTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelTime]
  }
  
  @scala.inline
  implicit class CancelTimeOps[Self <: CancelTime] (val x: Self) extends AnyVal {
    
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
    def setCancelTime(value: String): Self = this.set("cancelTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelTime: Self = this.set("cancelTime", js.undefined)
    
    @scala.inline
    def setCurrentReleaseInfo(value: AmountInMicros): Self = this.set("currentReleaseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrentReleaseInfo: Self = this.set("currentReleaseInfo", js.undefined)
    
    @scala.inline
    def setNextReleaseInfo(value: AmountInMicros): Self = this.set("nextReleaseInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextReleaseInfo: Self = this.set("nextReleaseInfo", js.undefined)
    
    @scala.inline
    def setSeriesSubscriptionType(value: String): Self = this.set("seriesSubscriptionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesSubscriptionType: Self = this.set("seriesSubscriptionType", js.undefined)
  }
}
