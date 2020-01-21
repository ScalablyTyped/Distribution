package typings.googleapis.osloginV1betaMod.osloginV1beta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The user profile information used for logging in to a virtual machine on
  * Google Compute Engine.
  */
@js.native
trait SchemaLoginProfile extends js.Object {
  /**
    * A unique user ID.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The list of POSIX accounts associated with the user.
    */
  var posixAccounts: js.UndefOr[js.Array[SchemaPosixAccount]] = js.native
  /**
    * A map from SSH public key fingerprint to the associated key object.
    */
  var sshPublicKeys: js.UndefOr[StringDictionary[SchemaSshPublicKey]] = js.native
}

object SchemaLoginProfile {
  @scala.inline
  def apply(
    name: String = null,
    posixAccounts: js.Array[SchemaPosixAccount] = null,
    sshPublicKeys: StringDictionary[SchemaSshPublicKey] = null
  ): SchemaLoginProfile = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (posixAccounts != null) __obj.updateDynamic("posixAccounts")(posixAccounts.asInstanceOf[js.Any])
    if (sshPublicKeys != null) __obj.updateDynamic("sshPublicKeys")(sshPublicKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLoginProfile]
  }
}

