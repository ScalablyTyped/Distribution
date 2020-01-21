package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaNetworksRemovePeeringRequest extends js.Object {
  /**
    * Name of the peering, which should conform to RFC1035.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaNetworksRemovePeeringRequest {
  @scala.inline
  def apply(name: String = null): SchemaNetworksRemovePeeringRequest = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNetworksRemovePeeringRequest]
  }
}

