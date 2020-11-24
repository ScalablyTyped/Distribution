package typings.libp2pNoise.payloadMod.pb

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a NoiseHandshakePayload. */
@js.native
trait INoiseHandshakePayload extends js.Object {
  
  /** NoiseHandshakePayload data */
  var data: js.UndefOr[Uint8Array | Null] = js.native
  
  /** NoiseHandshakePayload identityKey */
  var identityKey: js.UndefOr[Uint8Array | Null] = js.native
  
  /** NoiseHandshakePayload identitySig */
  var identitySig: js.UndefOr[Uint8Array | Null] = js.native
}
object INoiseHandshakePayload {
  
  @scala.inline
  def apply(): INoiseHandshakePayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INoiseHandshakePayload]
  }
  
  @scala.inline
  implicit class INoiseHandshakePayloadOps[Self <: INoiseHandshakePayload] (val x: Self) extends AnyVal {
    
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
    def setData(value: Uint8Array): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setIdentityKey(value: Uint8Array): Self = this.set("identityKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentityKey: Self = this.set("identityKey", js.undefined)
    
    @scala.inline
    def setIdentityKeyNull: Self = this.set("identityKey", null)
    
    @scala.inline
    def setIdentitySig(value: Uint8Array): Self = this.set("identitySig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentitySig: Self = this.set("identitySig", js.undefined)
    
    @scala.inline
    def setIdentitySigNull: Self = this.set("identitySig", null)
  }
}
