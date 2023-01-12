package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Digalg extends StObject {
  
  var digalg: String
  
  var obj: SignerInfo
  
  var sattrs: String
  
  var si: String
  
  var sigalg: String
  
  var sigval: String
  
  var version: String
}
object Digalg {
  
  inline def apply(
    digalg: String,
    obj: SignerInfo,
    sattrs: String,
    si: String,
    sigalg: String,
    sigval: String,
    version: String
  ): Digalg = {
    val __obj = js.Dynamic.literal(digalg = digalg.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], sattrs = sattrs.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any], sigalg = sigalg.asInstanceOf[js.Any], sigval = sigval.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Digalg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Digalg] (val x: Self) extends AnyVal {
    
    inline def setDigalg(value: String): Self = StObject.set(x, "digalg", value.asInstanceOf[js.Any])
    
    inline def setObj(value: SignerInfo): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    inline def setSattrs(value: String): Self = StObject.set(x, "sattrs", value.asInstanceOf[js.Any])
    
    inline def setSi(value: String): Self = StObject.set(x, "si", value.asInstanceOf[js.Any])
    
    inline def setSigalg(value: String): Self = StObject.set(x, "sigalg", value.asInstanceOf[js.Any])
    
    inline def setSigval(value: String): Self = StObject.set(x, "sigval", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
