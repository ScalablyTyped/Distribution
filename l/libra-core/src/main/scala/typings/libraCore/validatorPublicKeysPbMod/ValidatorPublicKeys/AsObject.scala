package typings.libraCore.validatorPublicKeysPbMod.ValidatorPublicKeys

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsObject extends js.Object {
  
  var accountAddress: Uint8Array | String = js.native
  
  var consensusPublicKey: Uint8Array | String = js.native
  
  var networkIdentityPublicKey: Uint8Array | String = js.native
  
  var networkSigningPublicKey: Uint8Array | String = js.native
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
  
  @scala.inline
  implicit class AsObjectOps[Self <: AsObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccountAddress(value: Uint8Array | String): Self = this.set("accountAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsensusPublicKey(value: Uint8Array | String): Self = this.set("consensusPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkIdentityPublicKey(value: Uint8Array | String): Self = this.set("networkIdentityPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkSigningPublicKey(value: Uint8Array | String): Self = this.set("networkSigningPublicKey", value.asInstanceOf[js.Any])
  }
}
