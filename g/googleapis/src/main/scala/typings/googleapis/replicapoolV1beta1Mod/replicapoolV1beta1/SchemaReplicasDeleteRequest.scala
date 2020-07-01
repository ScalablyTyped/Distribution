package typings.googleapis.replicapoolV1beta1Mod.replicapoolV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReplicasDeleteRequest extends js.Object {
  /**
    * Whether the instance resource represented by this replica should be
    * deleted or abandoned. If abandoned, the replica will be deleted but the
    * virtual machine instance will remain. By default, this is set to false
    * and the instance will be deleted along with the replica.
    */
  var abandonInstance: js.UndefOr[Boolean] = js.native
}

object SchemaReplicasDeleteRequest {
  @scala.inline
  def apply(abandonInstance: js.UndefOr[Boolean] = js.undefined): SchemaReplicasDeleteRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abandonInstance)) __obj.updateDynamic("abandonInstance")(abandonInstance.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReplicasDeleteRequest]
  }
}

