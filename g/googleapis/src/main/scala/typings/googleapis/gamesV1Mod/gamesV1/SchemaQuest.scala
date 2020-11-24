package typings.googleapis.gamesV1Mod.gamesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def apply(): SchemaQuest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuest]
  }
  
  @scala.inline
  implicit class SchemaQuestOps[Self <: SchemaQuest] (val x: Self) extends AnyVal {
    
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
    def setAcceptedTimestampMillis(value: String): Self = this.set("acceptedTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptedTimestampMillis: Self = this.set("acceptedTimestampMillis", js.undefined)
    
    @scala.inline
    def setApplicationId(value: String): Self = this.set("applicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("applicationId", js.undefined)
    
    @scala.inline
    def setBannerUrl(value: String): Self = this.set("bannerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBannerUrl: Self = this.set("bannerUrl", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setEndTimestampMillis(value: String): Self = this.set("endTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTimestampMillis: Self = this.set("endTimestampMillis", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIsDefaultBannerUrl(value: Boolean): Self = this.set("isDefaultBannerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefaultBannerUrl: Self = this.set("isDefaultBannerUrl", js.undefined)
    
    @scala.inline
    def setIsDefaultIconUrl(value: Boolean): Self = this.set("isDefaultIconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefaultIconUrl: Self = this.set("isDefaultIconUrl", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLastUpdatedTimestampMillis(value: String): Self = this.set("lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUpdatedTimestampMillis: Self = this.set("lastUpdatedTimestampMillis", js.undefined)
    
    @scala.inline
    def setMilestonesVarargs(value: SchemaQuestMilestone*): Self = this.set("milestones", js.Array(value :_*))
    
    @scala.inline
    def setMilestones(value: js.Array[SchemaQuestMilestone]): Self = this.set("milestones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMilestones: Self = this.set("milestones", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNotifyTimestampMillis(value: String): Self = this.set("notifyTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifyTimestampMillis: Self = this.set("notifyTimestampMillis", js.undefined)
    
    @scala.inline
    def setStartTimestampMillis(value: String): Self = this.set("startTimestampMillis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTimestampMillis: Self = this.set("startTimestampMillis", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
