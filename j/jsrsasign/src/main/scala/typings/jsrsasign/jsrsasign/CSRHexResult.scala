package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSRHexResult extends js.Object {
  
  /** hexadecimal string of subject public key in PKCS#8 */
  var p8pubkeyhex: String = js.native
}
object CSRHexResult {
  
  @scala.inline
  def apply(p8pubkeyhex: String): CSRHexResult = {
    val __obj = js.Dynamic.literal(p8pubkeyhex = p8pubkeyhex.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSRHexResult]
  }
  
  @scala.inline
  implicit class CSRHexResultOps[Self <: CSRHexResult] (val x: Self) extends AnyVal {
    
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
    def setP8pubkeyhex(value: String): Self = this.set("p8pubkeyhex", value.asInstanceOf[js.Any])
  }
}
