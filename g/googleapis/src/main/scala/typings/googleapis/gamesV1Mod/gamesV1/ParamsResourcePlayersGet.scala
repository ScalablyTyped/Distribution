package typings.googleapis.gamesV1Mod.gamesV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePlayersGet
  extends StObject
     with StandardParameters {
  
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * A player ID. A value of `me` may be used in place of the authenticated player's ID.
    */
  var playerId: js.UndefOr[String] = js.undefined
  
  /**
    * Consistency token of the player id. The call returns a 'not found' result when the token is present and invalid. Empty value is ignored. See also GlobalPlayerIdConsistencyTokenProto
    */
  var playerIdConsistencyToken: js.UndefOr[String] = js.undefined
}
object ParamsResourcePlayersGet {
  
  inline def apply(): ParamsResourcePlayersGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePlayersGet]
  }
  
  extension [Self <: ParamsResourcePlayersGet](x: Self) {
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setPlayerId(value: String): Self = StObject.set(x, "playerId", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdConsistencyToken(value: String): Self = StObject.set(x, "playerIdConsistencyToken", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdConsistencyTokenUndefined: Self = StObject.set(x, "playerIdConsistencyToken", js.undefined)
    
    inline def setPlayerIdUndefined: Self = StObject.set(x, "playerId", js.undefined)
  }
}
