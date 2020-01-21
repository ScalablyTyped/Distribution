package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetTcpProxiesSetBackendServiceRequest extends js.Object {
  /**
    * The URL of the new BackendService resource for the targetTcpProxy.
    */
  var service: js.UndefOr[String] = js.native
}

object SchemaTargetTcpProxiesSetBackendServiceRequest {
  @scala.inline
  def apply(service: String = null): SchemaTargetTcpProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetTcpProxiesSetBackendServiceRequest]
  }
}

