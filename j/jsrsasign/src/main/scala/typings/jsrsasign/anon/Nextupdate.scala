package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.IdentityResponse
import typings.jsrsasign.jsrsasign.RevokedCertificate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nextupdate extends StObject {
  
  var ext: js.UndefOr[js.Array[RevokedCertificate]] = js.undefined
  
  var issuer: IdentityResponse
  
  var nextupdate: js.UndefOr[String | scala.Null] = js.undefined
  
  var revCerts: js.UndefOr[js.Array[RevokedCertificate]] = js.undefined
  
  var sigalg: String
  
  var sighex: ArrayStrString
  
  var tbshex: js.UndefOr[String] = js.undefined
  
  var thisupdate: String
}
object Nextupdate {
  
  inline def apply(issuer: IdentityResponse, sigalg: String, sighex: ArrayStrString, thisupdate: String): Nextupdate = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], sighex = sighex.asInstanceOf[js.Any], thisupdate = thisupdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nextupdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nextupdate] (val x: Self) extends AnyVal {
    
    inline def setExt(value: js.Array[RevokedCertificate]): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
    
    inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
    
    inline def setExtVarargs(value: RevokedCertificate*): Self = StObject.set(x, "ext", js.Array(value*))
    
    inline def setIssuer(value: IdentityResponse): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setNextupdate(value: String): Self = StObject.set(x, "nextupdate", value.asInstanceOf[js.Any])
    
    inline def setNextupdateNull: Self = StObject.set(x, "nextupdate", null)
    
    inline def setNextupdateUndefined: Self = StObject.set(x, "nextupdate", js.undefined)
    
    inline def setRevCerts(value: js.Array[RevokedCertificate]): Self = StObject.set(x, "revCerts", value.asInstanceOf[js.Any])
    
    inline def setRevCertsUndefined: Self = StObject.set(x, "revCerts", js.undefined)
    
    inline def setRevCertsVarargs(value: RevokedCertificate*): Self = StObject.set(x, "revCerts", js.Array(value*))
    
    inline def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
    
    inline def setSighex(value: ArrayStrString): Self = StObject.set(x, "sighex", value.asInstanceOf[js.Any])
    
    inline def setTbshex(value: String): Self = StObject.set(x, "tbshex", value.asInstanceOf[js.Any])
    
    inline def setTbshexUndefined: Self = StObject.set(x, "tbshex", js.undefined)
    
    inline def setThisupdate(value: String): Self = StObject.set(x, "thisupdate", value.asInstanceOf[js.Any])
  }
}
