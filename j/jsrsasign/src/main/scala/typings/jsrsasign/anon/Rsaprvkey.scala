package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.x509.TBSCertList
import typings.jsrsasign.jsrsasign.RSAKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rsaprvkey extends StObject {
  
  var rsaprvkey: RSAKey = js.native
  
  var tbsobj: TBSCertList = js.native
}
object Rsaprvkey {
  
  @scala.inline
  def apply(rsaprvkey: RSAKey, tbsobj: TBSCertList): Rsaprvkey = {
    val __obj = js.Dynamic.literal(rsaprvkey = rsaprvkey.asInstanceOf[js.Any], tbsobj = tbsobj.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rsaprvkey]
  }
  
  @scala.inline
  implicit class RsaprvkeyMutableBuilder[Self <: Rsaprvkey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRsaprvkey(value: RSAKey): Self = StObject.set(x, "rsaprvkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTbsobj(value: TBSCertList): Self = StObject.set(x, "tbsobj", value.asInstanceOf[js.Any])
  }
}
