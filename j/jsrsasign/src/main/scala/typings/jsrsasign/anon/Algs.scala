package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Algs extends StObject {
  
  var algs: String
  
  var certs: String
  
  var obj: SignedData
  
  var revs: String
  
  var si: js.Array[SignerInfo]
  
  var version: String
}
object Algs {
  
  inline def apply(
    algs: String,
    certs: String,
    obj: SignedData,
    revs: String,
    si: js.Array[SignerInfo],
    version: String
  ): Algs = {
    val __obj = js.Dynamic.literal(algs = algs.asInstanceOf[js.Any], certs = certs.asInstanceOf[js.Any], obj = obj.asInstanceOf[js.Any], revs = revs.asInstanceOf[js.Any], si = si.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Algs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Algs] (val x: Self) extends AnyVal {
    
    inline def setAlgs(value: String): Self = StObject.set(x, "algs", value.asInstanceOf[js.Any])
    
    inline def setCerts(value: String): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    inline def setObj(value: SignedData): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    inline def setRevs(value: String): Self = StObject.set(x, "revs", value.asInstanceOf[js.Any])
    
    inline def setSi(value: js.Array[SignerInfo]): Self = StObject.set(x, "si", value.asInstanceOf[js.Any])
    
    inline def setSiVarargs(value: SignerInfo*): Self = StObject.set(x, "si", js.Array(value*))
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
