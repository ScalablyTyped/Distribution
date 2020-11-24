package typings.libp2pNoise.handshakeMod

import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.basicMod.uint64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NoiseSession extends js.Object {
  
  var cs1: js.UndefOr[CipherState] = js.native
  
  var cs2: js.UndefOr[CipherState] = js.native
  
  var h: js.UndefOr[bytes32] = js.native
  
  var hs: HandshakeState = js.native
  
  var i: Boolean = js.native
  
  var mc: uint64 = js.native
}
object NoiseSession {
  
  @scala.inline
  def apply(hs: HandshakeState, i: Boolean, mc: uint64): NoiseSession = {
    val __obj = js.Dynamic.literal(hs = hs.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], mc = mc.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoiseSession]
  }
  
  @scala.inline
  implicit class NoiseSessionOps[Self <: NoiseSession] (val x: Self) extends AnyVal {
    
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
    def setHs(value: HandshakeState): Self = this.set("hs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setI(value: Boolean): Self = this.set("i", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMc(value: uint64): Self = this.set("mc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCs1(value: CipherState): Self = this.set("cs1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCs1: Self = this.set("cs1", js.undefined)
    
    @scala.inline
    def setCs2(value: CipherState): Self = this.set("cs2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCs2: Self = this.set("cs2", js.undefined)
    
    @scala.inline
    def setH(value: bytes32): Self = this.set("h", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteH: Self = this.set("h", js.undefined)
  }
}
