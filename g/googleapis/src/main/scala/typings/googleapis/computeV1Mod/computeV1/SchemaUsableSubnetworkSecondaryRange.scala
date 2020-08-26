package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Secondary IP range of a usable subnetwork.
  */
@js.native
trait SchemaUsableSubnetworkSecondaryRange extends js.Object {
  /**
    * The range of IP addresses belonging to this subnetwork secondary range.
    */
  var ipCidrRange: js.UndefOr[String] = js.native
  /**
    * The name associated with this subnetwork secondary range, used when
    * adding an alias IP range to a VM instance. The name must be 1-63
    * characters long, and comply with RFC1035. The name must be unique within
    * the subnetwork.
    */
  var rangeName: js.UndefOr[String] = js.native
}

object SchemaUsableSubnetworkSecondaryRange {
  @scala.inline
  def apply(): SchemaUsableSubnetworkSecondaryRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUsableSubnetworkSecondaryRange]
  }
  @scala.inline
  implicit class SchemaUsableSubnetworkSecondaryRangeOps[Self <: SchemaUsableSubnetworkSecondaryRange] (val x: Self) extends AnyVal {
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
    def setIpCidrRange(value: String): Self = this.set("ipCidrRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpCidrRange: Self = this.set("ipCidrRange", js.undefined)
    @scala.inline
    def setRangeName(value: String): Self = this.set("rangeName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeName: Self = this.set("rangeName", js.undefined)
  }
  
}

