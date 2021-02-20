package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is a JSON template for 1P/3P metadata about a user&#39;s level.
  */
@js.native
trait SchemaGamesPlayerLevelResource extends StObject {
  
  /**
    * The level for the user.
    */
  var level: js.UndefOr[Double] = js.native
  
  /**
    * The maximum experience points for this level.
    */
  var maxExperiencePoints: js.UndefOr[String] = js.native
  
  /**
    * The minimum experience points for this level.
    */
  var minExperiencePoints: js.UndefOr[String] = js.native
}
object SchemaGamesPlayerLevelResource {
  
  @scala.inline
  def apply(): SchemaGamesPlayerLevelResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGamesPlayerLevelResource]
  }
  
  @scala.inline
  implicit class SchemaGamesPlayerLevelResourceMutableBuilder[Self <: SchemaGamesPlayerLevelResource] (val x: Self) extends AnyVal {
    
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
