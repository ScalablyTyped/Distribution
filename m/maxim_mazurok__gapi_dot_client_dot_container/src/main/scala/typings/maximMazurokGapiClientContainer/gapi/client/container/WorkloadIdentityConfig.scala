package typings.maximMazurokGapiClientContainer.gapi.client.container

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkloadIdentityConfig extends js.Object {
  
  /** The workload pool to attach all Kubernetes service accounts to. */
  var workloadPool: js.UndefOr[String] = js.native
}
object WorkloadIdentityConfig {
  
  @scala.inline
  def apply(): WorkloadIdentityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkloadIdentityConfig]
  }
  
  @scala.inline
  implicit class WorkloadIdentityConfigOps[Self <: WorkloadIdentityConfig] (val x: Self) extends AnyVal {
    
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
    def setWorkloadPool(value: String): Self = this.set("workloadPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkloadPool: Self = this.set("workloadPool", js.undefined)
  }
}
