package typings.googleapis.youtubeV3Mod.youtubeV3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The auditDetails object encapsulates channel data that is relevant for
  * YouTube Partners during the audit process.
  */
@js.native
trait SchemaChannelAuditDetails extends js.Object {
  /**
    * Whether or not the channel respects the community guidelines.
    */
  var communityGuidelinesGoodStanding: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the channel has any unresolved claims.
    */
  var contentIdClaimsGoodStanding: js.UndefOr[Boolean] = js.native
  /**
    * Whether or not the channel has any copyright strikes.
    */
  var copyrightStrikesGoodStanding: js.UndefOr[Boolean] = js.native
}

object SchemaChannelAuditDetails {
  @scala.inline
  def apply(): SchemaChannelAuditDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaChannelAuditDetails]
  }
  @scala.inline
  implicit class SchemaChannelAuditDetailsOps[Self <: SchemaChannelAuditDetails] (val x: Self) extends AnyVal {
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
    def setCommunityGuidelinesGoodStanding(value: Boolean): Self = this.set("communityGuidelinesGoodStanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommunityGuidelinesGoodStanding: Self = this.set("communityGuidelinesGoodStanding", js.undefined)
    @scala.inline
    def setContentIdClaimsGoodStanding(value: Boolean): Self = this.set("contentIdClaimsGoodStanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentIdClaimsGoodStanding: Self = this.set("contentIdClaimsGoodStanding", js.undefined)
    @scala.inline
    def setCopyrightStrikesGoodStanding(value: Boolean): Self = this.set("copyrightStrikesGoodStanding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyrightStrikesGoodStanding: Self = this.set("copyrightStrikesGoodStanding", js.undefined)
  }
  
}

