package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for 1P/3P metadata about a user&#39;s level.
  */
trait SchemaPlayerLevel extends StObject {
  
  /**
    * Uniquely identifies the type of this resource. Value is always the fixed
    * string games#playerLevel.
    */
  var kind: js.UndefOr[String] = js.undefined
  
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
object SchemaPlayerLevel {
  
  @scala.inline
  def apply(): SchemaPlayerLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaPlayerLevel]
  }
  
  @scala.inline
  implicit class SchemaPlayerLevelMutableBuilder[Self <: SchemaPlayerLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMaxExperiencePoints(value: String): Self = StObject.set(x, "maxExperiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxExperiencePointsUndefined: Self = StObject.set(x, "maxExperiencePoints", js.undefined)
    
    @scala.inline
    def setMinExperiencePoints(value: String): Self = StObject.set(x, "minExperiencePoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinExperiencePointsUndefined: Self = StObject.set(x, "minExperiencePoints", js.undefined)
  }
}
