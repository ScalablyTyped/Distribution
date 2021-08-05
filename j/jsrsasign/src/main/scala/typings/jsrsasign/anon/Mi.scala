package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.BigIntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.IntegerParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.NameParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.ObjectIdentifierParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.tsp.MessageImprint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mi extends StObject {
  
  var certreq: Boolean
  
  var mi: MessageImprint
  
  var nonce: IntegerParam | BigIntegerParam | HexParam | Double
  
  var policy: ObjectIdentifierParam | HexParam | NameParam
}
object Mi {
  
  inline def apply(
    certreq: Boolean,
    mi: MessageImprint,
    nonce: IntegerParam | BigIntegerParam | HexParam | Double,
    policy: ObjectIdentifierParam | HexParam | NameParam
  ): Mi = {
    val __obj = js.Dynamic.literal(certreq = certreq.asInstanceOf[js.Any], mi = mi.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mi]
  }
  
  extension [Self <: Mi](x: Self) {
    
    inline def setCertreq(value: Boolean): Self = StObject.set(x, "certreq", value.asInstanceOf[js.Any])
    
    inline def setMi(value: MessageImprint): Self = StObject.set(x, "mi", value.asInstanceOf[js.Any])
    
    inline def setNonce(value: IntegerParam | BigIntegerParam | HexParam | Double): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setPolicy(value: ObjectIdentifierParam | HexParam | NameParam): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
  }
}
