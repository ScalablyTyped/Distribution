package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about any potential InterconnectAttachments between an
  * Interconnect at a specific InterconnectLocation, and a specific Cloud
  * Region.
  */
@js.native
trait SchemaInterconnectLocationRegionInfo extends js.Object {
  /**
    * Expected round-trip time in milliseconds, from this InterconnectLocation
    * to a VM in this region.
    */
  var expectedRttMs: js.UndefOr[String] = js.native
  /**
    * Identifies the network presence of this location.
    */
  var locationPresence: js.UndefOr[String] = js.native
  /**
    * URL for the region of this location.
    */
  var region: js.UndefOr[String] = js.native
}

object SchemaInterconnectLocationRegionInfo {
  @scala.inline
  def apply(): SchemaInterconnectLocationRegionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaInterconnectLocationRegionInfo]
  }
  @scala.inline
  implicit class SchemaInterconnectLocationRegionInfoOps[Self <: SchemaInterconnectLocationRegionInfo] (val x: Self) extends AnyVal {
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
    def setExpectedRttMs(value: String): Self = this.set("expectedRttMs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpectedRttMs: Self = this.set("expectedRttMs", js.undefined)
    @scala.inline
    def setLocationPresence(value: String): Self = this.set("locationPresence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocationPresence: Self = this.set("locationPresence", js.undefined)
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
  }
  
}

