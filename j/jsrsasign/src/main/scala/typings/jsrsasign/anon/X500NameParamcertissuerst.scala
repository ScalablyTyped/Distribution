package typings.jsrsasign.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined jsrsasign.jsrsasign.KJUR.asn1.x509.X500NameParam & {  certissuer :string | undefined,   certsubject :string | undefined} */
@js.native
trait X500NameParamcertissuerst extends js.Object {
  
  var C: String = js.native
  
  var CN: String = js.native
  
  var O: String = js.native
  
  var certissuer: js.UndefOr[String] = js.native
  
  var certsubject: js.UndefOr[String] = js.native
}
object X500NameParamcertissuerst {
  
  @scala.inline
  def apply(C: String, CN: String, O: String): X500NameParamcertissuerst = {
    val __obj = js.Dynamic.literal(C = C.asInstanceOf[js.Any], CN = CN.asInstanceOf[js.Any], O = O.asInstanceOf[js.Any])
    __obj.asInstanceOf[X500NameParamcertissuerst]
  }
  
  @scala.inline
  implicit class X500NameParamcertissuerstOps[Self <: X500NameParamcertissuerst] (val x: Self) extends AnyVal {
    
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
    def setC(value: String): Self = this.set("C", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCN(value: String): Self = this.set("CN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setO(value: String): Self = this.set("O", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertissuer(value: String): Self = this.set("certissuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertissuer: Self = this.set("certissuer", js.undefined)
    
    @scala.inline
    def setCertsubject(value: String): Self = this.set("certsubject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertsubject: Self = this.set("certsubject", js.undefined)
  }
}
