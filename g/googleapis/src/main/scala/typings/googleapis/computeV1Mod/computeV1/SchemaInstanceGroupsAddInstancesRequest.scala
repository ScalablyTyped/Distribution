package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstanceGroupsAddInstancesRequest extends js.Object {
  /**
    * The list of instances to add to the instance group.
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceReference]] = js.native
}

object SchemaInstanceGroupsAddInstancesRequest {
  @scala.inline
  def apply(instances: js.Array[SchemaInstanceReference] = null): SchemaInstanceGroupsAddInstancesRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstanceGroupsAddInstancesRequest]
  }
}

