package typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var accountAddress: Uint8Array | String
  var consensusPublicKey: Uint8Array | String
  var networkIdentityPublicKey: Uint8Array | String
  var networkSigningPublicKey: Uint8Array | String
}

object AsObject {
  @scala.inline
  def apply(
    accountAddress: Uint8Array | String,
    consensusPublicKey: Uint8Array | String,
    networkIdentityPublicKey: Uint8Array | String,
    networkSigningPublicKey: Uint8Array | String
  ): AsObject = {
    val __obj = js.Dynamic.literal(accountAddress = accountAddress.asInstanceOf[js.Any], consensusPublicKey = consensusPublicKey.asInstanceOf[js.Any], networkIdentityPublicKey = networkIdentityPublicKey.asInstanceOf[js.Any], networkSigningPublicKey = networkSigningPublicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsObject]
  }
}

