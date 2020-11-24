package typings.libp2pNoise.handshakeMod

import typings.libp2pNoise.basicMod.bytes
import typings.libp2pNoise.basicMod.bytes32
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MessageBuffer extends js.Object {
  
  var ciphertext: bytes = js.native
  
  @JSName("ne")
  var ne_FMessageBuffer: bytes32 = js.native
  
  var ns: bytes = js.native
}
object MessageBuffer {
  
  @scala.inline
  def apply(ciphertext: bytes, ne: bytes32, ns: bytes): MessageBuffer = {
    val __obj = js.Dynamic.literal(ciphertext = ciphertext.asInstanceOf[js.Any], ne = ne.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageBuffer]
  }
  
  @scala.inline
  implicit class MessageBufferOps[Self <: MessageBuffer] (val x: Self) extends AnyVal {
    
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
    def setCiphertext(value: bytes): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNe(value: bytes32): Self = this.set("ne", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNs(value: bytes): Self = this.set("ns", value.asInstanceOf[js.Any])
  }
}
