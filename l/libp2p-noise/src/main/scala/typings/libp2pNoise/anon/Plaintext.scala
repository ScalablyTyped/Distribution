package typings.libp2pNoise.anon

import typings.libp2pNoise.basicMod.bytes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Plaintext extends js.Object {
  
  var plaintext: bytes = js.native
  
  var valid: Boolean = js.native
}
object Plaintext {
  
  @scala.inline
  def apply(plaintext: bytes, valid: Boolean): Plaintext = {
    val __obj = js.Dynamic.literal(plaintext = plaintext.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plaintext]
  }
  
  @scala.inline
  implicit class PlaintextOps[Self <: Plaintext] (val x: Self) extends AnyVal {
    
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
    def setPlaintext(value: bytes): Self = this.set("plaintext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValid(value: Boolean): Self = this.set("valid", value.asInstanceOf[js.Any])
  }
}
