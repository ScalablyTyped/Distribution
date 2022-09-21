package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAchievementsUpdatemultiple
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAchievementUpdateMultipleRequest] = js.undefined
}
object ParamsResourceAchievementsUpdatemultiple {
  
  inline def apply(): ParamsResourceAchievementsUpdatemultiple = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementsUpdatemultiple]
  }
  
  extension [Self <: ParamsResourceAchievementsUpdatemultiple](x: Self) {
    
    inline def setRequestBody(value: SchemaAchievementUpdateMultipleRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
