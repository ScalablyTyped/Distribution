package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for a Quest resource.
  */
trait SchemaQuest extends StObject {
  
  /**
    * The timestamp at which the user accepted the quest in milliseconds since
    * the epoch in UTC. Only present if the player has accepted the quest.
    */
  var acceptedTimestampMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the application this quest is part of.
    */
  var applicationId: js.UndefOr[String] = js.undefined
  
  /**
    * The banner image URL for the quest.
    */
  var bannerUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The description of the quest.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp at which the quest ceases to be active in milliseconds
    * since the epoch in UTC.
    */
  var endTimestampMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The icon image URL for the quest.
    */
  var iconUrl: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the quest.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether the banner image being returned is a default image, or
    * is game-provided.
    */
  var isDefaultBannerUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the icon image being returned is a default image, or is
    * game-provided.
    */
  var isDefaultIconUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#quest.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp at which the quest was last updated by the user in
    * milliseconds since the epoch in UTC. Only present if the player has
    * accepted the quest.
    */
  var lastUpdatedTimestampMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The quest milestones.
    */
  var milestones: js.UndefOr[js.Array[SchemaQuestMilestone]] = js.undefined
  
  /**
    * The name of the quest.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp at which the user should be notified that the quest will
    * end soon in milliseconds since the epoch in UTC.
    */
  var notifyTimestampMillis: js.UndefOr[String] = js.undefined
  
  /**
    * The timestamp at which the quest becomes active in milliseconds since the
    * epoch in UTC.
    */
  var startTimestampMillis: js.UndefOr[String] = js.undefined
  
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
  var state: js.UndefOr[String] = js.undefined
}
object SchemaQuest {
  
  inline def apply(): SchemaQuest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaQuest]
  }
  
  extension [Self <: SchemaQuest](x: Self) {
    
    inline def setAcceptedTimestampMillis(value: String): Self = StObject.set(x, "acceptedTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setAcceptedTimestampMillisUndefined: Self = StObject.set(x, "acceptedTimestampMillis", js.undefined)
    
    inline def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    inline def setBannerUrl(value: String): Self = StObject.set(x, "bannerUrl", value.asInstanceOf[js.Any])
    
    inline def setBannerUrlUndefined: Self = StObject.set(x, "bannerUrl", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEndTimestampMillis(value: String): Self = StObject.set(x, "endTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setEndTimestampMillisUndefined: Self = StObject.set(x, "endTimestampMillis", js.undefined)
    
    inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
    
    inline def setIconUrlUndefined: Self = StObject.set(x, "iconUrl", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsDefaultBannerUrl(value: Boolean): Self = StObject.set(x, "isDefaultBannerUrl", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultBannerUrlUndefined: Self = StObject.set(x, "isDefaultBannerUrl", js.undefined)
    
    inline def setIsDefaultIconUrl(value: Boolean): Self = StObject.set(x, "isDefaultIconUrl", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultIconUrlUndefined: Self = StObject.set(x, "isDefaultIconUrl", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLastUpdatedTimestampMillis(value: String): Self = StObject.set(x, "lastUpdatedTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampMillisUndefined: Self = StObject.set(x, "lastUpdatedTimestampMillis", js.undefined)
    
    inline def setMilestones(value: js.Array[SchemaQuestMilestone]): Self = StObject.set(x, "milestones", value.asInstanceOf[js.Any])
    
    inline def setMilestonesUndefined: Self = StObject.set(x, "milestones", js.undefined)
    
    inline def setMilestonesVarargs(value: SchemaQuestMilestone*): Self = StObject.set(x, "milestones", js.Array(value :_*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotifyTimestampMillis(value: String): Self = StObject.set(x, "notifyTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setNotifyTimestampMillisUndefined: Self = StObject.set(x, "notifyTimestampMillis", js.undefined)
    
    inline def setStartTimestampMillis(value: String): Self = StObject.set(x, "startTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setStartTimestampMillisUndefined: Self = StObject.set(x, "startTimestampMillis", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
