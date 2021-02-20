package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.KJUR.jws.JWS.JsonWebKey
import typings.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ext extends StObject {
  
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
  implicit class ExtMutableBuilder[Self <: Ext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExt(value: js.Array[SubjectAltName]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    @scala.inline
    def setExtVarargs(value: SubjectAltName*): Self = StObject.set(x, "ext", js.Array(value :_*))
    
    @scala.inline
    def setSbjprvkey(value: RSAKey | ECDSA | DSA | JsonWebKey | E | String): Self = StObject.set(x, "sbjprvkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSbjpubkey(value: RSAKey | ECDSA | DSA | JsonWebKey | E | String): Self = StObject.set(x, "sbjpubkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: StringParamcertissuerstri | X500NameParamcertissuerst | Certissuer): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
  }
}
