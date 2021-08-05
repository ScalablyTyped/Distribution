package typings.jsrsasign.anon

import typings.jsrsasign.jsrsasign.KJUR.asn1.HexParam
import typings.jsrsasign.jsrsasign.KJUR.asn1.StringParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Critical extends StObject {
  
  var critical: js.UndefOr[Boolean] = js.undefined
  
  var issuer: StringParam
  
  var kid: HexParam
  
  var sn: HexParam
}
object Critical {
  
  inline def apply(issuer: StringParam, kid: HexParam, sn: HexParam): Critical = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], sn = sn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Critical]
  }
  
  extension [Self <: Critical](x: Self) {
    
    inline def setCritical(value: Boolean): Self = StObject.set(x, "critical", value.asInstanceOf[js.Any])
    
    inline def setCriticalUndefined: Self = StObject.set(x, "critical", js.undefined)
    
    inline def setIssuer(value: StringParam): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setKid(value: HexParam): Self = StObject.set(x, "kid", value.asInstanceOf[js.Any])
    
    inline def setSn(value: HexParam): Self = StObject.set(x, "sn", value.asInstanceOf[js.Any])
  }
}
