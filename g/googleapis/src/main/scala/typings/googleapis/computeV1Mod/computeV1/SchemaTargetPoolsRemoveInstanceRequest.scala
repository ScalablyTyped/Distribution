package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTargetPoolsRemoveInstanceRequest extends js.Object {
  /**
    * URLs of the instances to be removed from target pool.
    */
  var instances: js.UndefOr[js.Array[SchemaInstanceReference]] = js.native
}

object SchemaTargetPoolsRemoveInstanceRequest {
  @scala.inline
  def apply(instances: js.Array[SchemaInstanceReference] = null): SchemaTargetPoolsRemoveInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTargetPoolsRemoveInstanceRequest]
  }
}

