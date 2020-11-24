package typings.libp2pCrypto.mod.aes

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * AES Cipher in CTR mode.
  */
@js.native
trait Cipher extends js.Object {
  
  def decrypt(data: Uint8Array): js.Promise[Uint8Array] = js.native
  
  def encrypt(data: Uint8Array): js.Promise[Uint8Array] = js.native
}
object Cipher {
  
  @scala.inline
  def apply(decrypt: Uint8Array => js.Promise[Uint8Array], encrypt: Uint8Array => js.Promise[Uint8Array]): Cipher = {
    val __obj = js.Dynamic.literal(decrypt = js.Any.fromFunction1(decrypt), encrypt = js.Any.fromFunction1(encrypt))
    __obj.asInstanceOf[Cipher]
  }
  
  @scala.inline
  implicit class CipherOps[Self <: Cipher] (val x: Self) extends AnyVal {
    
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
    def setDecrypt(value: Uint8Array => js.Promise[Uint8Array]): Self = this.set("decrypt", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEncrypt(value: Uint8Array => js.Promise[Uint8Array]): Self = this.set("encrypt", js.Any.fromFunction1(value))
  }
}
