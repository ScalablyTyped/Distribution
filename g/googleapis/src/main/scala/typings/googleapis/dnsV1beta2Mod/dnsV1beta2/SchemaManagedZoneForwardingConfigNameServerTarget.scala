package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZoneForwardingConfigNameServerTarget extends StObject {
  
  var ipv4Address: js.UndefOr[String] = js.undefined
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZoneForwardingConfigNameServerTarget&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
}
object SchemaManagedZoneForwardingConfigNameServerTarget {
  
  @scala.inline
  def apply(): SchemaManagedZoneForwardingConfigNameServerTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZoneForwardingConfigNameServerTarget]
  }
  
  @scala.inline
  implicit class SchemaManagedZoneForwardingConfigNameServerTargetMutableBuilder[Self <: SchemaManagedZoneForwardingConfigNameServerTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpv4Address(value: String): Self = StObject.set(x, "ipv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv4AddressUndefined: Self = StObject.set(x, "ipv4Address", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
  }
}
