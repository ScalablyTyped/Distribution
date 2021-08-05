package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for 1P/3P metadata about a user&#39;s level.
  */
trait SchemaGamesPlayerLevelResource extends StObject {
  
  /**
    * The level for the user.
    */
  var level: js.UndefOr[Double] = js.undefined
  
  /**
    * The maximum experience points for this level.
    */
  var maxExperiencePoints: js.UndefOr[String] = js.undefined
  
  /**
    * The minimum experience points for this level.
    */
  var minExperiencePoints: js.UndefOr[String] = js.undefined
}
object SchemaGamesPlayerLevelResource {
  
  inline def apply(): SchemaGamesPlayerLevelResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesPlayerLevelResource]
  }
  
  extension [Self <: SchemaGamesPlayerLevelResource](x: Self) {
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMaxExperiencePoints(value: String): Self = StObject.set(x, "maxExperiencePoints", value.asInstanceOf[js.Any])
    
    inline def setMaxExperiencePointsUndefined: Self = StObject.set(x, "maxExperiencePoints", js.undefined)
    
    inline def setMinExperiencePoints(value: String): Self = StObject.set(x, "minExperiencePoints", value.asInstanceOf[js.Any])
    
    inline def setMinExperiencePointsUndefined: Self = StObject.set(x, "minExperiencePoints", js.undefined)
  }
}
