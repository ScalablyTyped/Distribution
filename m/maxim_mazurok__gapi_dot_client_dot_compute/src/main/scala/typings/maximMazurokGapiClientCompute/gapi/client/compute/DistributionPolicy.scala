package typings.maximMazurokGapiClientCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionPolicy extends js.Object {
  
  /** Zones where the regional managed instance group will create and manage its instances. */
  var zones: js.UndefOr[js.Array[DistributionPolicyZoneConfiguration]] = js.native
}
object DistributionPolicy {
  
  @scala.inline
  def apply(): DistributionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionPolicy]
  }
  
  @scala.inline
  implicit class DistributionPolicyOps[Self <: DistributionPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setZonesVarargs(value: DistributionPolicyZoneConfiguration*): Self = this.set("zones", js.Array(value :_*))
    
    @scala.inline
    def setZones(value: js.Array[DistributionPolicyZoneConfiguration]): Self = this.set("zones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZones: Self = this.set("zones", js.undefined)
  }
}
