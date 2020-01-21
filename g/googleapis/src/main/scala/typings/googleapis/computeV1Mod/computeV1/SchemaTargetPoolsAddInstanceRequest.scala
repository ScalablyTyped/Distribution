package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetPoolsAddInstanceRequest extends js.Object {
  /**
    * A full or partial URL to an instance to add to this target pool. This can
    * be a full or partial URL. For example, the following are valid URLs:   -
    * https://www.googleapis.com/compute/v1/projects/project-id/zones/zone/instances/instance-name
    * - projects/project-id/zones/zone/instances/instance-name  -
    * zones/zone/instances/instance-name
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceReference]] = js.native
}

object SchemaTargetPoolsAddInstanceRequest {
  @scala.inline
  def apply(instances: js.Array[SchemaInstanceReference] = null): SchemaTargetPoolsAddInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetPoolsAddInstanceRequest]
  }
}

