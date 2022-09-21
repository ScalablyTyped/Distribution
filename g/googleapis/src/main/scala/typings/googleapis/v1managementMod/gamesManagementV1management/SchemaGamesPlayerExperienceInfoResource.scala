package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGamesPlayerExperienceInfoResource extends StObject {
  
  /**
    * The current number of experience points for the player.
    */
  var currentExperiencePoints: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The current level of the player.
    */
  var currentLevel: js.UndefOr[SchemaGamesPlayerLevelResource] = js.undefined
  
  /**
    * The timestamp when the player was leveled up, in millis since Unix epoch UTC.
    */
  var lastLevelUpTimestampMillis: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The next level of the player. If the current level is the maximum level, this should be same as the current level.
    */
  var nextLevel: js.UndefOr[SchemaGamesPlayerLevelResource] = js.undefined
}
object SchemaGamesPlayerExperienceInfoResource {
  
  inline def apply(): SchemaGamesPlayerExperienceInfoResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesPlayerExperienceInfoResource]
  }
  
  extension [Self <: SchemaGamesPlayerExperienceInfoResource](x: Self) {
    
    inline def setCurrentExperiencePoints(value: String): Self = StObject.set(x, "currentExperiencePoints", value.asInstanceOf[js.Any])
    
    inline def setCurrentExperiencePointsNull: Self = StObject.set(x, "currentExperiencePoints", null)
    
    inline def setCurrentExperiencePointsUndefined: Self = StObject.set(x, "currentExperiencePoints", js.undefined)
    
    inline def setCurrentLevel(value: SchemaGamesPlayerLevelResource): Self = StObject.set(x, "currentLevel", value.asInstanceOf[js.Any])
    
    inline def setCurrentLevelUndefined: Self = StObject.set(x, "currentLevel", js.undefined)
    
    inline def setLastLevelUpTimestampMillis(value: String): Self = StObject.set(x, "lastLevelUpTimestampMillis", value.asInstanceOf[js.Any])
    
    inline def setLastLevelUpTimestampMillisNull: Self = StObject.set(x, "lastLevelUpTimestampMillis", null)
    
    inline def setLastLevelUpTimestampMillisUndefined: Self = StObject.set(x, "lastLevelUpTimestampMillis", js.undefined)
    
    inline def setNextLevel(value: SchemaGamesPlayerLevelResource): Self = StObject.set(x, "nextLevel", value.asInstanceOf[js.Any])
    
    inline def setNextLevelUndefined: Self = StObject.set(x, "nextLevel", js.undefined)
  }
}
