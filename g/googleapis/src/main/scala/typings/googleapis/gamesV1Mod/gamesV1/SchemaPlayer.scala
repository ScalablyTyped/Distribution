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
  def apply(
    avatarImageUrl: String = null,
    bannerUrlLandscape: String = null,
    bannerUrlPortrait: String = null,
    displayName: String = null,
    experienceInfo: SchemaPlayerExperienceInfo = null,
    kind: String = null,
    lastPlayedWith: SchemaPlayed = null,
    name: FamilyName = null,
    originalPlayerId: String = null,
    playerId: String = null,
    profileSettings: SchemaProfileSettings = null,
    title: String = null
  ): SchemaPlayer = {
    val __obj = js.Dynamic.literal()
    if (avatarImageUrl != null) __obj.updateDynamic("avatarImageUrl")(avatarImageUrl.asInstanceOf[js.Any])
    if (bannerUrlLandscape != null) __obj.updateDynamic("bannerUrlLandscape")(bannerUrlLandscape.asInstanceOf[js.Any])
    if (bannerUrlPortrait != null) __obj.updateDynamic("bannerUrlPortrait")(bannerUrlPortrait.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (experienceInfo != null) __obj.updateDynamic("experienceInfo")(experienceInfo.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastPlayedWith != null) __obj.updateDynamic("lastPlayedWith")(lastPlayedWith.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalPlayerId != null) __obj.updateDynamic("originalPlayerId")(originalPlayerId.asInstanceOf[js.Any])
    if (playerId != null) __obj.updateDynamic("playerId")(playerId.asInstanceOf[js.Any])
    if (profileSettings != null) __obj.updateDynamic("profileSettings")(profileSettings.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPlayer]
  }
}

