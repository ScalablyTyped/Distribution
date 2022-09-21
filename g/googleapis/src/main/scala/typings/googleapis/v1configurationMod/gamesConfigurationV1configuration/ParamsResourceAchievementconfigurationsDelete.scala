package typings.googleapis.v1configurationMod.gamesConfigurationV1configuration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAchievementconfigurationsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The ID of the achievement used by this method.
    */
  var achievementId: js.UndefOr[String] = js.undefined
}
object ParamsResourceAchievementconfigurationsDelete {
  
  inline def apply(): ParamsResourceAchievementconfigurationsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementconfigurationsDelete]
  }
  
  extension [Self <: ParamsResourceAchievementconfigurationsDelete](x: Self) {
    
    inline def setAchievementId(value: String): Self = StObject.set(x, "achievementId", value.asInstanceOf[js.Any])
    
    inline def setAchievementIdUndefined: Self = StObject.set(x, "achievementId", js.undefined)
  }
}
