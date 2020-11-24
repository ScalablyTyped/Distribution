package typings.jsrsasign.jsrsasign

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrivatePKCS8HexResult extends js.Object {
  
  /** hexadecimal string of OID of asymmetric key algorithm */
  var algoid: String = js.native
  
  /** hexadecimal string of OID of ECC curve name or null */
  var algparam: String | Null = js.native
  
  /** string starting index of key in `pkcs8PrvHex` */
  var keyidx: String = js.native
}
object PrivatePKCS8HexResult {
  
  @scala.inline
  def apply(algoid: String, keyidx: String): PrivatePKCS8HexResult = {
    val __obj = js.Dynamic.literal(algoid = algoid.asInstanceOf[js.Any], keyidx = keyidx.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivatePKCS8HexResult]
  }
  
  @scala.inline
  implicit class PrivatePKCS8HexResultOps[Self <: PrivatePKCS8HexResult] (val x: Self) extends AnyVal {
    
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
    def setAlgoid(value: String): Self = this.set("algoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyidx(value: String): Self = this.set("keyidx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgparam(value: String): Self = this.set("algparam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgparamNull: Self = this.set("algparam", null)
  }
}
