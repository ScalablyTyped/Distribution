package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The contentOwnerDetails object encapsulates channel data that is relevant
  * for YouTube Partners linked with the channel.
  */
@js.native
trait SchemaChannelContentOwnerDetails extends js.Object {
  /**
    * The ID of the content owner linked to the channel.
    */
  var contentOwner: js.UndefOr[String] = js.native
  /**
    * The date and time of when the channel was linked to the content owner.
    * The value is specified in ISO 8601 (YYYY-MM-DDThh:mm:ss.sZ) format.
    */
  var timeLinked: js.UndefOr[String] = js.native
}

object SchemaChannelContentOwnerDetails {
  @scala.inline
  def apply(): SchemaChannelContentOwnerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelContentOwnerDetails]
  }
  @scala.inline
  implicit class SchemaChannelContentOwnerDetailsOps[Self <: SchemaChannelContentOwnerDetails] (val x: Self) extends AnyVal {
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
    def setContentOwner(value: String): Self = this.set("contentOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentOwner: Self = this.set("contentOwner", js.undefined)
    @scala.inline
    def setTimeLinked(value: String): Self = this.set("timeLinked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeLinked: Self = this.set("timeLinked", js.undefined)
  }
  
}

