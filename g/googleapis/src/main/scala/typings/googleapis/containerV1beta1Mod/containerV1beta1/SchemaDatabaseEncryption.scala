package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of etcd encryption.
  */
@js.native
trait SchemaDatabaseEncryption extends js.Object {
  /**
    * Name of CloudKMS key to use for the encryption of secrets in etcd. Ex.
    * projects/my-project/locations/global/keyRings/my-ring/cryptoKeys/my-key
    */
  var keyName: js.UndefOr[String] = js.native
  /**
    * Denotes the state of etcd encryption.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaDatabaseEncryption {
  @scala.inline
  def apply(keyName: String = null, state: String = null): SchemaDatabaseEncryption = {
    val __obj = js.Dynamic.literal()
    if (keyName != null) __obj.updateDynamic("keyName")(keyName.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaDatabaseEncryption]
  }
}

