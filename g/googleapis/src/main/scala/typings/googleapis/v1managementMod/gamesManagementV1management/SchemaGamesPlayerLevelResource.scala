package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGamesPlayerLevelResource extends StObject {
  
  /**
    * The level for the user.
    */
  var level: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The maximum experience points for this level.
    */
  var maxExperiencePoints: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The minimum experience points for this level.
    */
  var minExperiencePoints: js.UndefOr[String | Null] = js.undefined
}
object SchemaGamesPlayerLevelResource {
  
  inline def apply(): SchemaGamesPlayerLevelResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesPlayerLevelResource]
  }
  
  extension [Self <: SchemaGamesPlayerLevelResource](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelNull: Self = StObject.set(x, "level", null)
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMaxExperiencePoints(value: String): Self = StObject.set(x, "maxExperiencePoints", value.asInstanceOf[js.Any])
    
    inline def setMaxExperiencePointsNull: Self = StObject.set(x, "maxExperiencePoints", null)
    
    inline def setMaxExperiencePointsUndefined: Self = StObject.set(x, "maxExperiencePoints", js.undefined)
    
    inline def setMinExperiencePoints(value: String): Self = StObject.set(x, "minExperiencePoints", value.asInstanceOf[js.Any])
    
    inline def setMinExperiencePointsNull: Self = StObject.set(x, "minExperiencePoints", null)
    
    inline def setMinExperiencePointsUndefined: Self = StObject.set(x, "minExperiencePoints", js.undefined)
  }
}
