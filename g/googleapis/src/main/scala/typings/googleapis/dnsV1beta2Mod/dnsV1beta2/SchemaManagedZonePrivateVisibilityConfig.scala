package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaManagedZonePrivateVisibilityConfig extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePrivateVisibilityConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var networks: js.UndefOr[js.Array[SchemaManagedZonePrivateVisibilityConfigNetwork]] = js.native
}
object SchemaManagedZonePrivateVisibilityConfig {
  
  @scala.inline
  def apply(): SchemaManagedZonePrivateVisibilityConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePrivateVisibilityConfig]
  }
  
  @scala.inline
  implicit class SchemaManagedZonePrivateVisibilityConfigMutableBuilder[Self <: SchemaManagedZonePrivateVisibilityConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNetworks(value: js.Array[SchemaManagedZonePrivateVisibilityConfigNetwork]): Self = StObject.set(x, "networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworksUndefined: Self = StObject.set(x, "networks", js.undefined)
    
    @scala.inline
    def setNetworksVarargs(value: SchemaManagedZonePrivateVisibilityConfigNetwork*): Self = StObject.set(x, "networks", js.Array(value :_*))
  }
}
