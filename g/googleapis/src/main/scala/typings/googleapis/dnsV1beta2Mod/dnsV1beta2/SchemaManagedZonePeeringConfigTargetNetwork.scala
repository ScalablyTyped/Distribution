package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaManagedZonePeeringConfigTargetNetwork extends StObject {
  
  var deactivateTime: js.UndefOr[String] = js.native
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePeeringConfigTargetNetwork&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  
  var networkUrl: js.UndefOr[String] = js.native
}
object SchemaManagedZonePeeringConfigTargetNetwork {
  
  @scala.inline
  def apply(): SchemaManagedZonePeeringConfigTargetNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePeeringConfigTargetNetwork]
  }
  
  @scala.inline
  implicit class SchemaManagedZonePeeringConfigTargetNetworkMutableBuilder[Self <: SchemaManagedZonePeeringConfigTargetNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeactivateTime(value: String): Self = StObject.set(x, "deactivateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeactivateTimeUndefined: Self = StObject.set(x, "deactivateTime", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setNetworkUrl(value: String): Self = StObject.set(x, "networkUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkUrlUndefined: Self = StObject.set(x, "networkUrl", js.undefined)
  }
}
