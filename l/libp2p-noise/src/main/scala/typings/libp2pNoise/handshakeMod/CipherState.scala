package typings.libp2pNoise.handshakeMod

import typings.libp2pNoise.basicMod.bytes32
import typings.libp2pNoise.basicMod.uint32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherState extends js.Object {
  
  var k: bytes32 = js.native
  
  var n: uint32 = js.native
}
object CipherState {
  
  @scala.inline
  def apply(k: bytes32, n: uint32): CipherState = {
    val __obj = js.Dynamic.literal(k = k.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any])
    __obj.asInstanceOf[CipherState]
  }
  
  @scala.inline
  implicit class CipherStateOps[Self <: CipherState] (val x: Self) extends AnyVal {
    
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
    def setK(value: bytes32): Self = this.set("k", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setN(value: uint32): Self = this.set("n", value.asInstanceOf[js.Any])
  }
}
