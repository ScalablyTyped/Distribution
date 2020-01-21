package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupsSetNamedPortsRequest extends js.Object {
  /**
    * The fingerprint of the named ports information for this instance group.
    * Use this optional property to prevent conflicts when multiple users
    * change the named ports settings concurrently. Obtain the fingerprint with
    * the instanceGroups.get method. Then, include the fingerprint in your
    * request to ensure that you do not overwrite changes that were applied
    * from another concurrent request. A request with an incorrect fingerprint
    * will fail with error 412 conditionNotMet.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The list of named ports to set for this instance group.
    */
  var namedPorts: js.UndefOr[js.Array[SchemaNamedPort]] = js.native
}

object SchemaInstanceGroupsSetNamedPortsRequest {
  @scala.inline
  def apply(fingerprint: String = null, namedPorts: js.Array[SchemaNamedPort] = null): SchemaInstanceGroupsSetNamedPortsRequest = {
    val __obj = js.Dynamic.literal()
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (namedPorts != null) __obj.updateDynamic("namedPorts")(namedPorts.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupsSetNamedPortsRequest]
  }
}

