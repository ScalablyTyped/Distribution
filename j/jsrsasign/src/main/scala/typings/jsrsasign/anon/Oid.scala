package typings.jsrsasign.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Oid extends StObject {
  
  var hash: Alg | typings.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier = js.native
  
  var oid: String = js.native
}
object Oid {
  
  @scala.inline
  def apply(hash: Alg | typings.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier, oid: String): Oid = {
    val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], oid = oid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Oid]
  }
  
  @scala.inline
  implicit class OidMutableBuilder[Self <: Oid] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHash(value: Alg | typings.jsrsasign.jsrsasign.KJUR.asn1.cades.SignaturePolicyIdentifier): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOid(value: String): Self = StObject.set(x, "oid", value.asInstanceOf[js.Any])
  }
}
