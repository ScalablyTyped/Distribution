package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaPlayerLevel extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed string `games#playerLevel`.
    */
  var kind: js.UndefOr[String | Null] = js.undefined
  
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
object SchemaPlayerLevel {
  
  inline def apply(): SchemaPlayerLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerLevel]
  }
  
  extension [Self <: SchemaPlayerLevel](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
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
