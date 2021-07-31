package typings.googleapis.dnsV1beta2Mod.dnsV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaManagedZonePeeringConfig extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dns#managedZonePeeringConfig&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  var targetNetwork: js.UndefOr[SchemaManagedZonePeeringConfigTargetNetwork] = js.undefined
}
object SchemaManagedZonePeeringConfig {
  
  @scala.inline
  def apply(): SchemaManagedZonePeeringConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaManagedZonePeeringConfig]
  }
  
  @scala.inline
  implicit class SchemaManagedZonePeeringConfigMutableBuilder[Self <: SchemaManagedZonePeeringConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setTargetNetwork(value: SchemaManagedZonePeeringConfigTargetNetwork): Self = StObject.set(x, "targetNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNetworkUndefined: Self = StObject.set(x, "targetNetwork", js.undefined)
  }
}
