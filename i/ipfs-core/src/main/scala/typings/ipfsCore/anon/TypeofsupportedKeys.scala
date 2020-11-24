package typings.ipfsCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofsupportedKeys extends js.Object {
  
  val ed25519: Typeofed25519 = js.native
  
  val rsa: Typeofrsa = js.native
  
  val secp256k1: Typeofsecp256k1 = js.native
}
object TypeofsupportedKeys {
  
  @scala.inline
  def apply(ed25519: Typeofed25519, rsa: Typeofrsa, secp256k1: Typeofsecp256k1): TypeofsupportedKeys = {
    val __obj = js.Dynamic.literal(ed25519 = ed25519.asInstanceOf[js.Any], rsa = rsa.asInstanceOf[js.Any], secp256k1 = secp256k1.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofsupportedKeys]
  }
  
  @scala.inline
  implicit class TypeofsupportedKeysOps[Self <: TypeofsupportedKeys] (val x: Self) extends AnyVal {
    
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
    def setEd25519(value: Typeofed25519): Self = this.set("ed25519", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRsa(value: Typeofrsa): Self = this.set("rsa", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecp256k1(value: Typeofsecp256k1): Self = this.set("secp256k1", value.asInstanceOf[js.Any])
  }
}
