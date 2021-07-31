package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertificate
import typings.jsrsasign.jsrsasign.KJUR.crypto.DSA
import typings.jsrsasign.jsrsasign.KJUR.crypto.ECDSA
import typings.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Prvkeyobj extends StObject {
  
  var prvkeyobj: js.UndefOr[RSAKey | ECDSA | DSA] = js.undefined
  
  var tbscertobj: js.UndefOr[TBSCertificate] = js.undefined
}
object Prvkeyobj {
  
  @scala.inline
  def apply(): Prvkeyobj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Prvkeyobj]
  }
  
  @scala.inline
  implicit class PrvkeyobjMutableBuilder[Self <: Prvkeyobj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrvkeyobj(value: RSAKey | ECDSA | DSA): Self = StObject.set(x, "prvkeyobj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrvkeyobjUndefined: Self = StObject.set(x, "prvkeyobj", js.undefined)
    
    @scala.inline
    def setTbscertobj(value: TBSCertificate): Self = StObject.set(x, "tbscertobj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTbscertobjUndefined: Self = StObject.set(x, "tbscertobj", js.undefined)
  }
}
