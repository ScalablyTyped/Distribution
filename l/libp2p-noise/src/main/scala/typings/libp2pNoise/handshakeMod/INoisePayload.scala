package typings.libp2pNoise.handshakeMod

import typings.libp2pNoise.basicMod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait INoisePayload extends js.Object {
  
  var data: bytes = js.native
  
  var identityKey: bytes = js.native
  
  var identitySig: bytes = js.native
}
object INoisePayload {
  
  @scala.inline
  def apply(data: bytes, identityKey: bytes, identitySig: bytes): INoisePayload = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], identityKey = identityKey.asInstanceOf[js.Any], identitySig = identitySig.asInstanceOf[js.Any])
    __obj.asInstanceOf[INoisePayload]
  }
  
  @scala.inline
  implicit class INoisePayloadOps[Self <: INoisePayload] (val x: Self) extends AnyVal {
    
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
    def setData(value: bytes): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentityKey(value: bytes): Self = this.set("identityKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentitySig(value: bytes): Self = this.set("identitySig", value.asInstanceOf[js.Any])
  }
}
