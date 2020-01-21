package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetSslProxiesSetBackendServiceRequest extends js.Object {
  /**
    * The URL of the new BackendService resource for the targetSslProxy.
    */
  var service: js.UndefOr[String] = js.native
}

object SchemaTargetSslProxiesSetBackendServiceRequest {
  @scala.inline
  def apply(service: String = null): SchemaTargetSslProxiesSetBackendServiceRequest = {
    val __obj = js.Dynamic.literal()
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetSslProxiesSetBackendServiceRequest]
  }
}

