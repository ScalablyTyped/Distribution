package typings.maximMazurokGapiClientContainer.gapi.client.container

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkloadIdentityConfig extends StObject {
  
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
  implicit class WorkloadIdentityConfigMutableBuilder[Self <: WorkloadIdentityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkloadPool(value: String): Self = StObject.set(x, "workloadPool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkloadPoolUndefined: Self = StObject.set(x, "workloadPool", js.undefined)
  }
}
