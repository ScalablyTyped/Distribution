package typings.libp2pGossipsub.interfacesMod

import typings.peerId.mod.^
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Envelope extends js.Object {
  
  def isEqual(other: Envelope): Boolean = js.native
  
  def marshal(): Uint8Array = js.native
  
  var payload: Uint8Array = js.native
  
  var payloadType: Uint8Array = js.native
  
  var peerId: ^ = js.native
  
  var signature: Uint8Array = js.native
  
  def validate(domain: String): js.Promise[Boolean] = js.native
}
object Envelope {
  
  @scala.inline
  def apply(
    isEqual: Envelope => Boolean,
    marshal: () => Uint8Array,
    payload: Uint8Array,
    payloadType: Uint8Array,
    peerId: ^,
    signature: Uint8Array,
    validate: String => js.Promise[Boolean]
  ): Envelope = {
    val __obj = js.Dynamic.literal(isEqual = js.Any.fromFunction1(isEqual), marshal = js.Any.fromFunction0(marshal), payload = payload.asInstanceOf[js.Any], payloadType = payloadType.asInstanceOf[js.Any], peerId = peerId.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Envelope]
  }
  
  @scala.inline
  implicit class EnvelopeOps[Self <: Envelope] (val x: Self) extends AnyVal {
    
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
    def setIsEqual(value: Envelope => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMarshal(value: () => Uint8Array): Self = this.set("marshal", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPayload(value: Uint8Array): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadType(value: Uint8Array): Self = this.set("payloadType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPeerId(value: ^): Self = this.set("peerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignature(value: Uint8Array): Self = this.set("signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidate(value: String => js.Promise[Boolean]): Self = this.set("validate", js.Any.fromFunction1(value))
  }
}
