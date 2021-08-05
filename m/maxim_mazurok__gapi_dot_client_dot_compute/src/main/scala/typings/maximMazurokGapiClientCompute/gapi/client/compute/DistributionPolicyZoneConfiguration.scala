package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionPolicyZoneConfiguration extends StObject {
  
  /** The URL of the zone. The zone must exist in the region where the managed instance group is located. */
  var zone: js.UndefOr[String] = js.undefined
}
object DistributionPolicyZoneConfiguration {
  
  inline def apply(): DistributionPolicyZoneConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionPolicyZoneConfiguration]
  }
  
  extension [Self <: DistributionPolicyZoneConfiguration](x: Self) {
    
    inline def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    inline def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
