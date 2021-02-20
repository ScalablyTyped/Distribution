package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for an leaderboard configuration resource.
  */
@js.native
trait SchemaLeaderboardConfiguration extends StObject {
  
  /**
    * The draft data of the leaderboard.
    */
  var draft: js.UndefOr[SchemaLeaderboardConfigurationDetail] = js.native
  
  /**
    * The ID of the leaderboard.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string gamesConfiguration#leaderboardConfiguration.
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The read-only published data of the leaderboard.
    */
  var published: js.UndefOr[SchemaLeaderboardConfigurationDetail] = js.native
  
  /**
    * Maximum score that can be posted to this leaderboard.
    */
  var scoreMax: js.UndefOr[String] = js.native
  
  /**
    * Minimum score that can be posted to this leaderboard.
    */
  var scoreMin: js.UndefOr[String] = js.native
  
  /**
    * The type of the leaderboard. Possible values are:   -
    * &quot;LARGER_IS_BETTER&quot; - Larger scores posted are ranked higher.  -
    * &quot;SMALLER_IS_BETTER&quot; - Smaller scores posted are ranked higher.
    */
  var scoreOrder: js.UndefOr[String] = js.native
  
  /**
    * The token for this resource.
    */
  var token: js.UndefOr[String] = js.native
}
object SchemaLeaderboardConfiguration {
  
  @scala.inline
  def apply(): SchemaLeaderboardConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardConfiguration]
  }
  
  @scala.inline
  implicit class SchemaLeaderboardConfigurationMutableBuilder[Self <: SchemaLeaderboardConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDraft(value: SchemaLeaderboardConfigurationDetail): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setPublished(value: SchemaLeaderboardConfigurationDetail): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    @scala.inline
    def setScoreMax(value: String): Self = StObject.set(x, "scoreMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreMaxUndefined: Self = StObject.set(x, "scoreMax", js.undefined)
    
    @scala.inline
    def setScoreMin(value: String): Self = StObject.set(x, "scoreMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreMinUndefined: Self = StObject.set(x, "scoreMin", js.undefined)
    
    @scala.inline
    def setScoreOrder(value: String): Self = StObject.set(x, "scoreOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScoreOrderUndefined: Self = StObject.set(x, "scoreOrder", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
