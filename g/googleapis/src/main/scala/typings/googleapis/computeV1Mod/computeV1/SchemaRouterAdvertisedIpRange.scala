package typings.googleapis.computeV1Mod.computeV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description-tagged IP ranges for the router to advertise.
  */
@js.native
trait SchemaRouterAdvertisedIpRange extends js.Object {
  /**
    * User-specified description for the IP range.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The IP range to advertise. The value must be a CIDR-formatted string.
    */
  var range: js.UndefOr[String] = js.native
}

object SchemaRouterAdvertisedIpRange {
  @scala.inline
  def apply(): SchemaRouterAdvertisedIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterAdvertisedIpRange]
  }
  @scala.inline
  implicit class SchemaRouterAdvertisedIpRangeOps[Self <: SchemaRouterAdvertisedIpRange] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
  }
  
}

