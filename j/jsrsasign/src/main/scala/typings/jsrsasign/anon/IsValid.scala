package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsValid extends js.Object {
  
  var isValid: Boolean = js.native
  
  var parse: CertsIdx = js.native
  
  var signerInfos: js.Array[_] = js.native
}
object IsValid {
  
  @scala.inline
  def apply(isValid: Boolean, parse: CertsIdx, signerInfos: js.Array[_]): IsValid = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsValid]
  }
  
  @scala.inline
  implicit class IsValidOps[Self <: IsValid] (val x: Self) extends AnyVal {
    
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
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParse(value: CertsIdx): Self = this.set("parse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerInfosVarargs(value: js.Any*): Self = this.set("signerInfos", js.Array(value :_*))
    
    @scala.inline
    def setSignerInfos(value: js.Array[_]): Self = this.set("signerInfos", value.asInstanceOf[js.Any])
  }
}
