package typings.hapiHawk.anon

import typings.cryptoJs.mod.Cipher
import typings.cryptoJs.mod.CipherHelper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `1` extends js.Object {
  
  /**
    * Creates shortcut functions to a cipher's object interface.
    *
    * @param cipher The cipher to create a helper for.
    *
    * @return An object with encrypt and decrypt shortcut functions.
    *
    * @example
    *
    *     var AES = CryptoJS.lib.Cipher._createHelper(CryptoJS.algo.AES);
    */
  def _createHelper(cipher: Cipher): CipherHelper = js.native
}
object `1` {
  
  @scala.inline
  def apply(_createHelper: Cipher => CipherHelper): `1` = {
    val __obj = js.Dynamic.literal(_createHelper = js.Any.fromFunction1(_createHelper))
    __obj.asInstanceOf[`1`]
  }
  
  @scala.inline
  implicit class `1Ops`[Self <: `1`] (val x: Self) extends AnyVal {
    
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
    def set_createHelper(value: Cipher => CipherHelper): Self = this.set("_createHelper", js.Any.fromFunction1(value))
  }
}
