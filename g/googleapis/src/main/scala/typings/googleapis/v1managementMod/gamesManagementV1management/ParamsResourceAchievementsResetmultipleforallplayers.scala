package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceAchievementsResetmultipleforallplayers
  extends StObject
     with StandardParameters {
  
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[SchemaAchievementResetMultipleForAllRequest] = js.undefined
}
object ParamsResourceAchievementsResetmultipleforallplayers {
  
  inline def apply(): ParamsResourceAchievementsResetmultipleforallplayers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceAchievementsResetmultipleforallplayers]
  }
  
  extension [Self <: ParamsResourceAchievementsResetmultipleforallplayers](x: Self) {
    
    inline def setRequestBody(value: SchemaAchievementResetMultipleForAllRequest): Self = StObject.set(x, "requestBody", value.asInstanceOf[js.Any])
    
    inline def setRequestBodyUndefined: Self = StObject.set(x, "requestBody", js.undefined)
  }
}
