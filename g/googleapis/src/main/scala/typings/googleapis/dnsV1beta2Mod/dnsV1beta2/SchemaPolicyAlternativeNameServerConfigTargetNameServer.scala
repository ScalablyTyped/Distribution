package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyAlternativeNameServerConfigTargetNameServer extends StObject {
  
  var ipv4Address: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#policyAlternativeNameServerConfigTargetNameServer&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaPolicyAlternativeNameServerConfigTargetNameServer {
  
  inline def apply(): SchemaPolicyAlternativeNameServerConfigTargetNameServer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyAlternativeNameServerConfigTargetNameServer]
  }
  
  extension [Self <: SchemaPolicyAlternativeNameServerConfigTargetNameServer](x: Self) {
    
    inline def setIpv4Address(value: String): Self = StObject.set(x, "ipv4Address", value.asInstanceOf[js.Any])
    
    inline def setIpv4AddressUndefined: Self = StObject.set(x, "ipv4Address", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
