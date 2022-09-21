package typings.googleapis.dnsV2Mod.dnsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyAlternativeNameServerConfig extends StObject {
  
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Sets an alternative name server for the associated networks. When specified, all DNS queries are forwarded to a name server that you choose. Names such as .internal are not available when an alternative name server is specified.
    */
  var targetNameServers: js.UndefOr[js.Array[SchemaPolicyAlternativeNameServerConfigTargetNameServer]] = js.undefined
}
object SchemaPolicyAlternativeNameServerConfig {
  
  inline def apply(): SchemaPolicyAlternativeNameServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyAlternativeNameServerConfig]
  }
  
  extension [Self <: SchemaPolicyAlternativeNameServerConfig](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setTargetNameServers(value: js.Array[SchemaPolicyAlternativeNameServerConfigTargetNameServer]): Self = StObject.set(x, "targetNameServers", value.asInstanceOf[js.Any])
    
    inline def setTargetNameServersUndefined: Self = StObject.set(x, "targetNameServers", js.undefined)
    
    inline def setTargetNameServersVarargs(value: SchemaPolicyAlternativeNameServerConfigTargetNameServer*): Self = StObject.set(x, "targetNameServers", js.Array(value*))
  }
}
