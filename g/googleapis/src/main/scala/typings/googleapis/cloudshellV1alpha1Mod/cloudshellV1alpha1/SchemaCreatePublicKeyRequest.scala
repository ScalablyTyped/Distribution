package typings.googleapis.cloudshellV1alpha1Mod.cloudshellV1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request message for CreatePublicKey.
  */
@js.native
trait SchemaCreatePublicKeyRequest extends js.Object {
  /**
    * Key that should be added to the environment.
    */
  var key: js.UndefOr[SchemaPublicKey] = js.native
}

object SchemaCreatePublicKeyRequest {
  @scala.inline
  def apply(key: SchemaPublicKey = null): SchemaCreatePublicKeyRequest = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCreatePublicKeyRequest]
  }
}

