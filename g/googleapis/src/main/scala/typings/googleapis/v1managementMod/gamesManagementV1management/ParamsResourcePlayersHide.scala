package typings.googleapis.v1managementMod.gamesManagementV1management

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePlayersHide
  extends StObject
     with StandardParameters {
  
  /**
    * The application ID from the Google Play developer console.
    */
  var applicationId: js.UndefOr[String] = js.undefined
  
  /**
    * A player ID. A value of `me` may be used in place of the authenticated player's ID.
    */
  var playerId: js.UndefOr[String] = js.undefined
}
object ParamsResourcePlayersHide {
  
  inline def apply(): ParamsResourcePlayersHide = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePlayersHide]
  }
  
  extension [Self <: ParamsResourcePlayersHide](x: Self) {
    
    inline def setApplicationId(value: String): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationIdUndefined: Self = StObject.set(x, "applicationId", js.undefined)
    
    inline def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
  }
}
