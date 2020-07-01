package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is a JSON template for a Quest resource.
  */
@js.native
trait SchemaQuest extends js.Object {
  /**
    * The timestamp at which the user accepted the quest in milliseconds since
    * the epoch in UTC. Only present if the player has accepted the quest.
    */
  var acceptedTimestampMillis: js.UndefOr[String] = js.native
  /**
    * The ID of the application this quest is part of.
    */
  var applicationId: js.UndefOr[String] = js.native
  /**
    * The banner image URL for the quest.
    */
  var bannerUrl: js.UndefOr[String] = js.native
  /**
    * The description of the quest.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The timestamp at which the quest ceases to be active in milliseconds
    * since the epoch in UTC.
    */
  var endTimestampMillis: js.UndefOr[String] = js.native
  /**
    * The icon image URL for the quest.
    */
  var iconUrl: js.UndefOr[String] = js.native
  /**
    * The ID of the quest.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Indicates whether the banner image being returned is a default image, or
    * is game-provided.
    */
  var isDefaultBannerUrl: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the icon image being returned is a default image, or is
    * game-provided.
    */
  var isDefaultIconUrl: js.UndefOr[Boolean] = js.native
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#quest.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The timestamp at which the quest was last updated by the user in
    * milliseconds since the epoch in UTC. Only present if the player has
    * accepted the quest.
    */
  var lastUpdatedTimestampMillis: js.UndefOr[String] = js.native
  /**
    * The quest milestones.
    */
  var milestones: js.UndefOr[js.Array[SchemaQuestMilestone]] = js.native
  /**
    * The name of the quest.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The timestamp at which the user should be notified that the quest will
    * end soon in milliseconds since the epoch in UTC.
    */
  var notifyTimestampMillis: js.UndefOr[String] = js.native
  /**
    * The timestamp at which the quest becomes active in milliseconds since the
    * epoch in UTC.
    */
  var startTimestampMillis: js.UndefOr[String] = js.native
  /**
    * The state of the quest. Possible values are:   - &quot;UPCOMING&quot;:
    * The quest is upcoming. The user can see the quest, but cannot accept it
    * until it is open.  - &quot;OPEN&quot;: The quest is currently open and
    * may be accepted at this time.  - &quot;ACCEPTED&quot;: The user is
    * currently participating in this quest.  - &quot;COMPLETED&quot;: The user
    * has completed the quest.  - &quot;FAILED&quot;: The quest was attempted
    * but was not completed before the deadline expired.  -
    * &quot;EXPIRED&quot;: The quest has expired and was not accepted.  -
    * &quot;DELETED&quot;: The quest should be deleted from the local database.
    */
  var state: js.UndefOr[String] = js.native
}

object SchemaQuest {
  @scala.inline
  def apply(
    acceptedTimestampMillis: String = null,
    applicationId: String = null,
    bannerUrl: String = null,
    description: String = null,
    endTimestampMillis: String = null,
    iconUrl: String = null,
    id: String = null,
    isDefaultBannerUrl: js.UndefOr[Boolean] = js.undefined,
    isDefaultIconUrl: js.UndefOr[Boolean] = js.undefined,
    kind: String = null,
    lastUpdatedTimestampMillis: String = null,
    milestones: js.Array[SchemaQuestMilestone] = null,
    name: String = null,
    notifyTimestampMillis: String = null,
    startTimestampMillis: String = null,
    state: String = null
  ): SchemaQuest = {
    val __obj = js.Dynamic.literal()
    if (acceptedTimestampMillis != null) __obj.updateDynamic("acceptedTimestampMillis")(acceptedTimestampMillis.asInstanceOf[js.Any])
    if (applicationId != null) __obj.updateDynamic("applicationId")(applicationId.asInstanceOf[js.Any])
    if (bannerUrl != null) __obj.updateDynamic("bannerUrl")(bannerUrl.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (endTimestampMillis != null) __obj.updateDynamic("endTimestampMillis")(endTimestampMillis.asInstanceOf[js.Any])
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultBannerUrl)) __obj.updateDynamic("isDefaultBannerUrl")(isDefaultBannerUrl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isDefaultIconUrl)) __obj.updateDynamic("isDefaultIconUrl")(isDefaultIconUrl.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (lastUpdatedTimestampMillis != null) __obj.updateDynamic("lastUpdatedTimestampMillis")(lastUpdatedTimestampMillis.asInstanceOf[js.Any])
    if (milestones != null) __obj.updateDynamic("milestones")(milestones.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notifyTimestampMillis != null) __obj.updateDynamic("notifyTimestampMillis")(notifyTimestampMillis.asInstanceOf[js.Any])
    if (startTimestampMillis != null) __obj.updateDynamic("startTimestampMillis")(startTimestampMillis.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaQuest]
  }
}

