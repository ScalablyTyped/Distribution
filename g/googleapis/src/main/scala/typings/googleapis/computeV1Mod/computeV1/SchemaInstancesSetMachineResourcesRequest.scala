package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesSetMachineResourcesRequest extends js.Object {
  /**
    * A list of the type and count of accelerator cards attached to the
    * instance.
    */
  var guestAccelerators: js.UndefOr[js.Array[SchemaAcceleratorConfig]] = js.native
}

object SchemaInstancesSetMachineResourcesRequest {
  @scala.inline
  def apply(guestAccelerators: js.Array[SchemaAcceleratorConfig] = null): SchemaInstancesSetMachineResourcesRequest = {
    val __obj = js.Dynamic.literal()
    if (guestAccelerators != null) __obj.updateDynamic("guestAccelerators")(guestAccelerators.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesSetMachineResourcesRequest]
  }
}

