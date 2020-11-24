package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typings.jsrsasign.jsrsasign.RSAKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ext extends js.Object {
  
  var ext: js.UndefOr[js.Array[SubjectAltName]] = js.native
  
  var sbjprvkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String = js.native
  
  var sbjpubkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String = js.native
  
  var sigalg: String = js.native
  
  var subject: StringParamcertissuerstri | X500NameParamcertissuerst | Certissuer = js.native
}
object Ext {
  
  @scala.inline
  def apply(
    sbjprvkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String,
    sbjpubkey: RSAKey | ECDSA | DSA | JsonWebKey | E | String,
    sigalg: String,
    subject: StringParamcertissuerstri | X500NameParamcertissuerst | Certissuer
  ): Ext = {
    val __obj = js.Dynamic.literal(sbjprvkey = sbjprvkey.asInstanceOf[js.Any], sbjpubkey = sbjpubkey.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ext]
  }
  
  @scala.inline
  implicit class ExtOps[Self <: Ext] (val x: Self) extends AnyVal {
    
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
    def setSbjprvkey(value: RSAKey | ECDSA | DSA | JsonWebKey | E | String): Self = this.set("sbjprvkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSbjpubkey(value: RSAKey | ECDSA | DSA | JsonWebKey | E | String): Self = this.set("sbjpubkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigalg(value: String): Self = this.set("sigalg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: StringParamcertissuerstri | X500NameParamcertissuerst | Certissuer): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtVarargs(value: SubjectAltName*): Self = this.set("ext", js.Array(value :_*))
    
    @scala.inline
    def setExt(value: js.Array[SubjectAltName]): Self = this.set("ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExt: Self = this.set("ext", js.undefined)
  }
}
