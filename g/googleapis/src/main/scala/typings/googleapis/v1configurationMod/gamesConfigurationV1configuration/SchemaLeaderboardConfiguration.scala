package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLeaderboardConfiguration extends StObject {
  
  /**
    * The draft data of the leaderboard.
    */
  var draft: js.UndefOr[SchemaLeaderboardConfigurationDetail] = js.undefined
  
  /**
    * The ID of the leaderboard.
    */
  var id: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `gamesConfiguration#leaderboardConfiguration`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The read-only published data of the leaderboard.
    */
  var published: js.UndefOr[SchemaLeaderboardConfigurationDetail] = js.undefined
  
  /**
    * Maximum score that can be posted to this leaderboard.
    */
  var scoreMax: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Minimum score that can be posted to this leaderboard.
    */
  var scoreMin: js.UndefOr[String | Null] = js.undefined
  
  var scoreOrder: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The token for this resource.
    */
  var token: js.UndefOr[String | Null] = js.undefined
}
object SchemaLeaderboardConfiguration {
  
  inline def apply(): SchemaLeaderboardConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaderboardConfiguration]
  }
  
  extension [Self <: SchemaLeaderboardConfiguration](x: Self) {
    
    inline def setDraft(value: SchemaLeaderboardConfigurationDetail): Self = StObject.set(x, "draft", value.asInstanceOf[js.Any])
    
    inline def setDraftUndefined: Self = StObject.set(x, "draft", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setPublished(value: SchemaLeaderboardConfigurationDetail): Self = StObject.set(x, "published", value.asInstanceOf[js.Any])
    
    inline def setPublishedUndefined: Self = StObject.set(x, "published", js.undefined)
    
    inline def setScoreMax(value: String): Self = StObject.set(x, "scoreMax", value.asInstanceOf[js.Any])
    
    inline def setScoreMaxNull: Self = StObject.set(x, "scoreMax", null)
    
    inline def setScoreMaxUndefined: Self = StObject.set(x, "scoreMax", js.undefined)
    
    inline def setScoreMin(value: String): Self = StObject.set(x, "scoreMin", value.asInstanceOf[js.Any])
    
    inline def setScoreMinNull: Self = StObject.set(x, "scoreMin", null)
    
    inline def setScoreMinUndefined: Self = StObject.set(x, "scoreMin", js.undefined)
    
    inline def setScoreOrder(value: String): Self = StObject.set(x, "scoreOrder", value.asInstanceOf[js.Any])
    
    inline def setScoreOrderNull: Self = StObject.set(x, "scoreOrder", null)
    
    inline def setScoreOrderUndefined: Self = StObject.set(x, "scoreOrder", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenNull: Self = StObject.set(x, "token", null)
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
