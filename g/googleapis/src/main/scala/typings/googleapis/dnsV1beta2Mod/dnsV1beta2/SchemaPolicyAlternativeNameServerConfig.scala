package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPolicyAlternativeNameServerConfig extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#policyAlternativeNameServerConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var targetNameServers: js.UndefOr[js.Array[SchemaPolicyAlternativeNameServerConfigTargetNameServer]] = js.undefined
}
object SchemaPolicyAlternativeNameServerConfig {
  
  @scala.inline
  def apply(): SchemaPolicyAlternativeNameServerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPolicyAlternativeNameServerConfig]
  }
  
  @scala.inline
  implicit class SchemaPolicyAlternativeNameServerConfigMutableBuilder[Self <: SchemaPolicyAlternativeNameServerConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTargetNameServers(value: js.Array[SchemaPolicyAlternativeNameServerConfigTargetNameServer]): Self = StObject.set(x, "targetNameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNameServersUndefined: Self = StObject.set(x, "targetNameServers", js.undefined)
    
    @scala.inline
    def setTargetNameServersVarargs(value: SchemaPolicyAlternativeNameServerConfigTargetNameServer*): Self = StObject.set(x, "targetNameServers", js.Array(value :_*))
  }
}
