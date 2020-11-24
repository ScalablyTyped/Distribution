package typings.hapiHawk.anon

import typings.cryptoJs.anon.PartialCipherParams
import typings.cryptoJs.mod.global.CryptoJS.lib.CipherParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `0` extends js.Object {
  
  /**
    * Initializes a newly created cipher params object.
    *
    * @param cipherParams An object with any of the possible cipher parameters.
    *
    * @example
    *
    *     var cipherParams = CryptoJS.lib.CipherParams.create({
    *         ciphertext: ciphertextWordArray,
    *         key: keyWordArray,
    *         iv: ivWordArray,
    *         salt: saltWordArray,
    *         algorithm: CryptoJS.algo.AES,
    *         mode: CryptoJS.mode.CBC,
    *         padding: CryptoJS.pad.PKCS7,
    *         blockSize: 4,
    *         formatter: CryptoJS.format.OpenSSL
    *     });
    */
  def create(cipherParams: PartialCipherParams): CipherParams = js.native
}
object `0` {
  
  @scala.inline
  def apply(create: PartialCipherParams => CipherParams): `0` = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create))
    __obj.asInstanceOf[`0`]
  }
  
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: PartialCipherParams => CipherParams): Self = this.set("create", js.Any.fromFunction1(value))
  }
}
