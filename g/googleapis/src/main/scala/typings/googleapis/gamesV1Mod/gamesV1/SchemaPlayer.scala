package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleapis.anon.FamilyName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a Player resource.
  */
@js.native
trait SchemaPlayer extends js.Object {
  /**
    * The base URL for the image that represents the player.
    */
  var avatarImageUrl: js.UndefOr[String] = js.native
  /**
    * The url to the landscape mode player banner image.
    */
  var bannerUrlLandscape: js.UndefOr[String] = js.native
  /**
    * The url to the portrait mode player banner image.
    */
  var bannerUrlPortrait: js.UndefOr[String] = js.native
  /**
    * The name to display for the player.
    */
  var displayName: js.UndefOr[String] = js.native
  /**
    * An object to represent Play Game experience information for the player.
    */
  var experienceInfo: js.UndefOr[SchemaPlayerExperienceInfo] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#player.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Details about the last time this player played a multiplayer game with
    * the currently authenticated player. Populated for PLAYED_WITH player
    * collection members.
    */
  var lastPlayedWith: js.UndefOr[SchemaPlayed] = js.native
  /**
    * An object representation of the individual components of the player&#39;s
    * name. For some players, these fields may not be present.
    */
  var name: js.UndefOr[FamilyName] = js.native
  /**
    * The player ID that was used for this player the first time they signed
    * into the game in question. This is only populated for calls to player.get
    * for the requesting player, only if the player ID has subsequently
    * changed, and only to clients that support remapping player IDs.
    */
  var originalPlayerId: js.UndefOr[String] = js.native
  /**
    * The ID of the player.
    */
  var playerId: js.UndefOr[String] = js.native
  /**
    * The player&#39;s profile settings. Controls whether or not the
    * player&#39;s profile is visible to other players.
    */
  var profileSettings: js.UndefOr[SchemaProfileSettings] = js.native
  /**
    * The player&#39;s title rewarded for their game activities.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaPlayer {
  @scala.inline
  def apply(): SchemaPlayer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayer]
  }
  @scala.inline
  implicit class SchemaPlayerOps[Self <: SchemaPlayer] (val x: Self) extends AnyVal {
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
    def setAvatarImageUrl(value: String): Self = this.set("avatarImageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvatarImageUrl: Self = this.set("avatarImageUrl", js.undefined)
    @scala.inline
    def setBannerUrlLandscape(value: String): Self = this.set("bannerUrlLandscape", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBannerUrlLandscape: Self = this.set("bannerUrlLandscape", js.undefined)
    @scala.inline
    def setBannerUrlPortrait(value: String): Self = this.set("bannerUrlPortrait", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBannerUrlPortrait: Self = this.set("bannerUrlPortrait", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setExperienceInfo(value: SchemaPlayerExperienceInfo): Self = this.set("experienceInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExperienceInfo: Self = this.set("experienceInfo", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLastPlayedWith(value: SchemaPlayed): Self = this.set("lastPlayedWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastPlayedWith: Self = this.set("lastPlayedWith", js.undefined)
    @scala.inline
    def setName(value: FamilyName): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOriginalPlayerId(value: String): Self = this.set("originalPlayerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginalPlayerId: Self = this.set("originalPlayerId", js.undefined)
    @scala.inline
    def setPlayerId(value: String): Self = this.set("playerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlayerId: Self = this.set("playerId", js.undefined)
    @scala.inline
    def setProfileSettings(value: SchemaProfileSettings): Self = this.set("profileSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileSettings: Self = this.set("profileSettings", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

