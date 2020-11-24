package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobScheduling extends js.Object {
  
  /**
    * Optional. Maximum number of times per hour a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed.A job may be reported as
    * thrashing if driver exits with non-zero code 4 times within 10 minute window.Maximum value is 10.
    */
  var maxFailuresPerHour: js.UndefOr[Double] = js.native
  
  /** Optional. Maximum number of times in total a driver may be restarted as a result of driver exiting with non-zero code before job is reported failed. Maximum value is 240 */
  var maxFailuresTotal: js.UndefOr[Double] = js.native
}
object JobScheduling {
  
  @scala.inline
  def apply(): JobScheduling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobScheduling]
  }
  
  @scala.inline
  implicit class JobSchedulingOps[Self <: JobScheduling] (val x: Self) extends AnyVal {
    
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
    def setMaxFailuresPerHour(value: Double): Self = this.set("maxFailuresPerHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFailuresPerHour: Self = this.set("maxFailuresPerHour", js.undefined)
    
    @scala.inline
    def setMaxFailuresTotal(value: Double): Self = this.set("maxFailuresTotal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFailuresTotal: Self = this.set("maxFailuresTotal", js.undefined)
  }
}
