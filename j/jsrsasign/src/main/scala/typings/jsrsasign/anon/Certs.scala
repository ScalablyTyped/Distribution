package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Certs extends js.Object {
  
  var certs: js.Array[String] = js.native
  
  var content: StringParam = js.native
  
  var signerInfos: js.Array[HashAlg] = js.native
}
object Certs {
  
  @scala.inline
  def apply(certs: js.Array[String], content: StringParam, signerInfos: js.Array[HashAlg]): Certs = {
    val __obj = js.Dynamic.literal(certs = certs.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], signerInfos = signerInfos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certs]
  }
  
  @scala.inline
  implicit class CertsOps[Self <: Certs] (val x: Self) extends AnyVal {
    
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
    def setCertsVarargs(value: String*): Self = this.set("certs", js.Array(value :_*))
    
    @scala.inline
    def setCerts(value: js.Array[String]): Self = this.set("certs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: StringParam): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignerInfosVarargs(value: HashAlg*): Self = this.set("signerInfos", js.Array(value :_*))
    
    @scala.inline
    def setSignerInfos(value: js.Array[HashAlg]): Self = this.set("signerInfos", value.asInstanceOf[js.Any])
  }
}
