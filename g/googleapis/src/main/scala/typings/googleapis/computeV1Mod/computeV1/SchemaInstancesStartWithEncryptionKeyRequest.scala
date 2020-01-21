package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaInstancesStartWithEncryptionKeyRequest extends js.Object {
  /**
    * Array of disks associated with this instance that are protected with a
    * customer-supplied encryption key.  In order to start the instance, the
    * disk url and its corresponding key must be provided.  If the disk is not
    * protected with a customer-supplied encryption key it should not be
    * specified.
    */
  var disks: js.UndefOr[js.Array[SchemaCustomerEncryptionKeyProtectedDisk]] = js.native
}

object SchemaInstancesStartWithEncryptionKeyRequest {
  @scala.inline
  def apply(disks: js.Array[SchemaCustomerEncryptionKeyProtectedDisk] = null): SchemaInstancesStartWithEncryptionKeyRequest = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaInstancesStartWithEncryptionKeyRequest]
  }
}

