package typings.libp2pNoise.handshakeMod

import typings.libp2pNoise.basicMod.bytes32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SymmetricState extends js.Object {
  
  var ck: bytes32 = js.native
  
  var cs: CipherState = js.native
  
    // chaining key
  var h: bytes32 = js.native
}
object SymmetricState {
  
  @scala.inline
  def apply(ck: bytes32, cs: CipherState, h: bytes32): SymmetricState = {
    val __obj = js.Dynamic.literal(ck = ck.asInstanceOf[js.Any], cs = cs.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymmetricState]
  }
  
  @scala.inline
  implicit class SymmetricStateOps[Self <: SymmetricState] (val x: Self) extends AnyVal {
    
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
    def setCk(value: bytes32): Self = this.set("ck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCs(value: CipherState): Self = this.set("cs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setH(value: bytes32): Self = this.set("h", value.asInstanceOf[js.Any])
  }
}
