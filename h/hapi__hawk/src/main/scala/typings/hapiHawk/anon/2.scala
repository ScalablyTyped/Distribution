package typings.hapiHawk.anon

import typings.cryptoJs.mod.X64Word
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `2` extends js.Object {
  
  /**
    * Initializes a newly created 64-bit word.
    *
    * @param high The high 32 bits.
    * @param low The low 32 bits.
    *
    * @example
    *
    *     var x64Word = CryptoJS.x64.Word.create(0x00010203, 0x04050607);
    */
  def create(high: Double, low: Double): X64Word = js.native
}
object `2` {
  
  @scala.inline
  def apply(create: (Double, Double) => X64Word): `2` = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction2(create))
    __obj.asInstanceOf[`2`]
  }
  
  @scala.inline
  implicit class `2Ops`[Self <: `2`] (val x: Self) extends AnyVal {
    
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
    def setCreate(value: (Double, Double) => X64Word): Self = this.set("create", js.Any.fromFunction2(value))
  }
}
