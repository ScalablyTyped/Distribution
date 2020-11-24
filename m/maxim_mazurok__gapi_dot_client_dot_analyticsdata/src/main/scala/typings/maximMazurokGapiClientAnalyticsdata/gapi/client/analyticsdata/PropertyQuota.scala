package typings.maximMazurokGapiClientAnalyticsdata.gapi.client.analyticsdata

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropertyQuota extends js.Object {
  
  /** Standard Analytics Properties can send up to 10 concurrent requests; Analytics 360 Properties can use up to 50 concurrent requests. */
  var concurrentRequests: js.UndefOr[QuotaStatus] = js.native
  
  /**
    * Standard Analytics Properties and cloud project pairs can have up to 10 server errors per hour; Analytics 360 Properties and cloud project pairs can have up to 50 server errors per
    * hour.
    */
  var serverErrorsPerProjectPerHour: js.UndefOr[QuotaStatus] = js.native
  
  /** Standard Analytics Properties can use up to 25,000 tokens per day; Analytics 360 Properties can use 250,000 tokens per day. Most requests consume fewer than 10 tokens. */
  var tokensPerDay: js.UndefOr[QuotaStatus] = js.native
  
  /**
    * Standard Analytics Properties can use up to 5,000 tokens per day; Analytics 360 Properties can use 50,000 tokens per day. An API request consumes a single number of tokens, and that
    * number is deducted from both the hourly and daily quotas.
    */
  var tokensPerHour: js.UndefOr[QuotaStatus] = js.native
}
object PropertyQuota {
  
  @scala.inline
  def apply(): PropertyQuota = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyQuota]
  }
  
  @scala.inline
  implicit class PropertyQuotaOps[Self <: PropertyQuota] (val x: Self) extends AnyVal {
    
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
    def setConcurrentRequests(value: QuotaStatus): Self = this.set("concurrentRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrentRequests: Self = this.set("concurrentRequests", js.undefined)
    
    @scala.inline
    def setServerErrorsPerProjectPerHour(value: QuotaStatus): Self = this.set("serverErrorsPerProjectPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerErrorsPerProjectPerHour: Self = this.set("serverErrorsPerProjectPerHour", js.undefined)
    
    @scala.inline
    def setTokensPerDay(value: QuotaStatus): Self = this.set("tokensPerDay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokensPerDay: Self = this.set("tokensPerDay", js.undefined)
    
    @scala.inline
    def setTokensPerHour(value: QuotaStatus): Self = this.set("tokensPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTokensPerHour: Self = this.set("tokensPerHour", js.undefined)
  }
}
