package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.ExtParam
import typings.jsrsasign.jsrsasign.RevokedCertificate
import typings.jsrsasign.jsrsasign.X500Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Revcert extends StObject {
  
  var ext: js.UndefOr[js.Array[ExtParam]] = js.undefined
  
  var issuer: X500Name | OmitX500Namearray
  
  var nextupdate: js.UndefOr[String] = js.undefined
  
  var revcert: js.UndefOr[js.Array[RevokedCertificate]] = js.undefined
  
  var sigalg: String
  
  var sighex: String
  
  var tbshex: js.UndefOr[String] = js.undefined
  
  var thisupdate: String
  
  var version: js.UndefOr[Double] = js.undefined
}
object Revcert {
  
  inline def apply(issuer: X500Name | OmitX500Namearray, sigalg: String, sighex: String, thisupdate: String): Revcert = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], sighex = sighex.asInstanceOf[js.Any], thisupdate = thisupdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revcert]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Revcert] (val x: Self) extends AnyVal {
    
    inline def setExt(value: js.Array[ExtParam]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setExtVarargs(value: ExtParam*): Self = StObject.set(x, "ext", js.Array(value*))
    
    inline def setIssuer(value: X500Name | OmitX500Namearray): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setNextupdate(value: String): Self = StObject.set(x, "nextupdate", value.asInstanceOf[js.Any])
    
    inline def setNextupdateUndefined: Self = StObject.set(x, "nextupdate", js.undefined)
    
    inline def setRevcert(value: js.Array[RevokedCertificate]): Self = StObject.set(x, "revcert", value.asInstanceOf[js.Any])
    
    inline def setRevcertUndefined: Self = StObject.set(x, "revcert", js.undefined)
    
    inline def setRevcertVarargs(value: RevokedCertificate*): Self = StObject.set(x, "revcert", js.Array(value*))
    
    inline def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
    
    inline def setSighex(value: String): Self = StObject.set(x, "sighex", value.asInstanceOf[js.Any])
    
    inline def setTbshex(value: String): Self = StObject.set(x, "tbshex", value.asInstanceOf[js.Any])
    
    inline def setTbshexUndefined: Self = StObject.set(x, "tbshex", js.undefined)
    
    inline def setThisupdate(value: String): Self = StObject.set(x, "thisupdate", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
