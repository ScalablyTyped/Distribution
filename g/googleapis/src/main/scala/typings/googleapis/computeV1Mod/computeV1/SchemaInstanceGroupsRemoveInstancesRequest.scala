package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupsRemoveInstancesRequest extends js.Object {
  /**
    * The list of instances to remove from the instance group.
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceReference]] = js.native
}

object SchemaInstanceGroupsRemoveInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[SchemaInstanceReference] = null): SchemaInstanceGroupsRemoveInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupsRemoveInstancesRequest]
  }
}

