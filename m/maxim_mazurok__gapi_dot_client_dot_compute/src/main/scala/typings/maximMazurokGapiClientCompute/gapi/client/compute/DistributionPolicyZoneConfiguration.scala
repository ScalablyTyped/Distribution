package typings.maximMazurokGapiClientCompute.gapi.client.compute

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionPolicyZoneConfiguration extends StObject {
  
  /** The URL of the zone. The zone must exist in the region where the managed instance group is located. */
  var zone: js.UndefOr[String] = js.native
}
object DistributionPolicyZoneConfiguration {
  
  @scala.inline
  def apply(): DistributionPolicyZoneConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionPolicyZoneConfiguration]
  }
  
  @scala.inline
  implicit class DistributionPolicyZoneConfigurationMutableBuilder[Self <: DistributionPolicyZoneConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
