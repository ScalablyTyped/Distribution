package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaManagedZoneForwardingConfig extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneForwardingConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var targetNameServers: js.UndefOr[js.Array[SchemaManagedZoneForwardingConfigNameServerTarget]] = js.native
}
object SchemaManagedZoneForwardingConfig {
  
  @scala.inline
  def apply(): SchemaManagedZoneForwardingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneForwardingConfig]
  }
  
  @scala.inline
  implicit class SchemaManagedZoneForwardingConfigMutableBuilder[Self <: SchemaManagedZoneForwardingConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTargetNameServers(value: js.Array[SchemaManagedZoneForwardingConfigNameServerTarget]): Self = StObject.set(x, "targetNameServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNameServersUndefined: Self = StObject.set(x, "targetNameServers", js.undefined)
    
    @scala.inline
    def setTargetNameServersVarargs(value: SchemaManagedZoneForwardingConfigNameServerTarget*): Self = StObject.set(x, "targetNameServers", js.Array(value :_*))
  }
}
