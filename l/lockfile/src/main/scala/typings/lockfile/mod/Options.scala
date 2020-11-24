package typings.lockfile.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var pollPeriod: js.UndefOr[Double] = js.native
  
  var retries: js.UndefOr[Double] = js.native
  
  var retryWait: js.UndefOr[Double] = js.native
  
  var stale: js.UndefOr[Double] = js.native
  
  @JSName("wait")
  var wait_FOptions: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setPollPeriod(value: Double): Self = this.set("pollPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePollPeriod: Self = this.set("pollPeriod", js.undefined)
    
    @scala.inline
    def setRetries(value: Double): Self = this.set("retries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetries: Self = this.set("retries", js.undefined)
    
    @scala.inline
    def setRetryWait(value: Double): Self = this.set("retryWait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryWait: Self = this.set("retryWait", js.undefined)
    
    @scala.inline
    def setStale(value: Double): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
    
    @scala.inline
    def setWait(value: Double): Self = this.set("wait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWait: Self = this.set("wait", js.undefined)
  }
}
