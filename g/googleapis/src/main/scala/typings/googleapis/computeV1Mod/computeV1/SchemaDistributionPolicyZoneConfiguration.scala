package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaDistributionPolicyZoneConfiguration extends js.Object {
  /**
    * The URL of the zone. The zone must exist in the region where the managed
    * instance group is located.
    */
  var zone: js.UndefOr[String] = js.native
}

object SchemaDistributionPolicyZoneConfiguration {
  @scala.inline
  def apply(): SchemaDistributionPolicyZoneConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDistributionPolicyZoneConfiguration]
  }
  @scala.inline
  implicit class SchemaDistributionPolicyZoneConfigurationOps[Self <: SchemaDistributionPolicyZoneConfiguration] (val x: Self) extends AnyVal {
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
    def setZone(value: String): Self = this.set("zone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZone: Self = this.set("zone", js.undefined)
  }
  
}

