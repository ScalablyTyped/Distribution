package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QuotaStatus extends js.Object {
  
  /** Quota consumed by this request. */
  var consumed: js.UndefOr[Double] = js.native
  
  /** Quota remaining after this request. */
  var remaining: js.UndefOr[Double] = js.native
}
object QuotaStatus {
  
  @scala.inline
  def apply(): QuotaStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QuotaStatus]
  }
  
  @scala.inline
  implicit class QuotaStatusOps[Self <: QuotaStatus] (val x: Self) extends AnyVal {
    
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
    def setConsumed(value: Double): Self = this.set("consumed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConsumed: Self = this.set("consumed", js.undefined)
    
    @scala.inline
    def setRemaining(value: Double): Self = this.set("remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemaining: Self = this.set("remaining", js.undefined)
  }
}
