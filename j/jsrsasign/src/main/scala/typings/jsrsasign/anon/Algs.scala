package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignedData
import typings.jsrsasign.jsrsasign.KJUR.asn1.cms.SignerInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Algs extends StObject {
  
  var algs: String = js.native
  
  var certs: String = js.native
  
  var obj: SignedData = js.native
  
  var revs: String = js.native
  
  var si: js.Array[SignerInfo] = js.native
  
  var version: String = js.native
}
object Algs {
  
  @scala.inline
  def apply(
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
  implicit class AlgsMutableBuilder[Self <: Algs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlgs(value: String): Self = StObject.set(x, "algs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCerts(value: String): Self = StObject.set(x, "certs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObj(value: SignedData): Self = StObject.set(x, "obj", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevs(value: String): Self = StObject.set(x, "revs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSi(value: js.Array[SignerInfo]): Self = StObject.set(x, "si", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSiVarargs(value: SignerInfo*): Self = StObject.set(x, "si", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
