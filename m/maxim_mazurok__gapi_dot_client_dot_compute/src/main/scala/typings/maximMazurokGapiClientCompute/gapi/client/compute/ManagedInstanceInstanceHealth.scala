package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ManagedInstanceInstanceHealth extends js.Object {
  
  /** [Output Only] The current detailed instance health state. */
  var detailedHealthState: js.UndefOr[String] = js.native
  
  /** [Output Only] The URL for the health check that verifies whether the instance is healthy. */
  var healthCheck: js.UndefOr[String] = js.native
}
object ManagedInstanceInstanceHealth {
  
  @scala.inline
  def apply(): ManagedInstanceInstanceHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedInstanceInstanceHealth]
  }
  
  @scala.inline
  implicit class ManagedInstanceInstanceHealthOps[Self <: ManagedInstanceInstanceHealth] (val x: Self) extends AnyVal {
    
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
    def setDetailedHealthState(value: String): Self = this.set("detailedHealthState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailedHealthState: Self = this.set("detailedHealthState", js.undefined)
    
    @scala.inline
    def setHealthCheck(value: String): Self = this.set("healthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHealthCheck: Self = this.set("healthCheck", js.undefined)
  }
}
