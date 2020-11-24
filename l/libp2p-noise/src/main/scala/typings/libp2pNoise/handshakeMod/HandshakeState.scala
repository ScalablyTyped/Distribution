package typings.libp2pNoise.handshakeMod

import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.libp2pMod.KeyPair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandshakeState extends js.Object {
  
  var e: js.UndefOr[KeyPair] = js.native
  
  var psk: bytes32 = js.native
  
  var re: bytes32 = js.native
  
  var rs: bytes32 = js.native
  
  var s: KeyPair = js.native
  
  var ss: SymmetricState = js.native
}
object HandshakeState {
  
  @scala.inline
  def apply(psk: bytes32, re: bytes32, rs: bytes32, s: KeyPair, ss: SymmetricState): HandshakeState = {
    val __obj = js.Dynamic.literal(psk = psk.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any], rs = rs.asInstanceOf[js.Any], s = s.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandshakeState]
  }
  
  @scala.inline
  implicit class HandshakeStateOps[Self <: HandshakeState] (val x: Self) extends AnyVal {
    
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
    def setPsk(value: bytes32): Self = this.set("psk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRe(value: bytes32): Self = this.set("re", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRs(value: bytes32): Self = this.set("rs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS(value: KeyPair): Self = this.set("s", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSs(value: SymmetricState): Self = this.set("ss", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setE(value: KeyPair): Self = this.set("e", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteE: Self = this.set("e", js.undefined)
  }
}
