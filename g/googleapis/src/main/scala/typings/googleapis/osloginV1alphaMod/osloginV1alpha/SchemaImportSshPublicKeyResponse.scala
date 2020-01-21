package typings.googleapis.osloginV1alphaMod.osloginV1alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A response message from importing an SSH public key.
  */
@js.native
trait SchemaImportSshPublicKeyResponse extends js.Object {
  /**
    * The login profile information for the user.
    */
  var loginProfile: js.UndefOr[SchemaLoginProfile] = js.native
}

object SchemaImportSshPublicKeyResponse {
  @scala.inline
  def apply(loginProfile: SchemaLoginProfile = null): SchemaImportSshPublicKeyResponse = {
    val __obj = js.Dynamic.literal()
    if (loginProfile != null) __obj.updateDynamic("loginProfile")(loginProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaImportSshPublicKeyResponse]
  }
}

