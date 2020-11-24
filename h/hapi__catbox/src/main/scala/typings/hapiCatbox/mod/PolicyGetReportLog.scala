package typings.hapiCatbox.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolicyGetReportLog extends js.Object {
  
  /** error - lookup error. */
  var error: js.UndefOr[Error] = js.native
  
  /** isStale - true if the item is stale. */
  var isStale: Boolean = js.native
  
  /** msec - the cache lookup time in milliseconds. */
  var msec: Double = js.native
  
  /** stored - the timestamp when the item was stored in the cache. */
  var stored: Double = js.native
  
  /** ttl - the cache ttl value for the record. */
  var ttl: Double = js.native
}
object PolicyGetReportLog {
  
  @scala.inline
  def apply(isStale: Boolean, msec: Double, stored: Double, ttl: Double): PolicyGetReportLog = {
    val __obj = js.Dynamic.literal(isStale = isStale.asInstanceOf[js.Any], msec = msec.asInstanceOf[js.Any], stored = stored.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyGetReportLog]
  }
  
  @scala.inline
  implicit class PolicyGetReportLogOps[Self <: PolicyGetReportLog] (val x: Self) extends AnyVal {
    
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
    def setIsStale(value: Boolean): Self = this.set("isStale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsec(value: Double): Self = this.set("msec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStored(value: Double): Self = this.set("stored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
