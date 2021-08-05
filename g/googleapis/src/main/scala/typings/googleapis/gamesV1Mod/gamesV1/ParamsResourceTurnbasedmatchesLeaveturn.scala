package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTurnbasedmatchesLeaveturn
  extends StObject
     with StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.undefined
  
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the match.
    */
  var matchId: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the match being updated.
    */
  var matchVersion: js.UndefOr[Double] = js.undefined
  
  /**
    * The ID of another participant who should take their turn next. If not
    * set, the match will wait for other player(s) to join via automatching;
    * this is only valid if automatch criteria is set on the match with
    * remaining slots for automatched players.
    */
  var pendingParticipantId: js.UndefOr[String] = js.undefined
}
object ParamsResourceTurnbasedmatchesLeaveturn {
  
  inline def apply(): ParamsResourceTurnbasedmatchesLeaveturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTurnbasedmatchesLeaveturn]
  }
  
  extension [Self <: ParamsResourceTurnbasedmatchesLeaveturn](x: Self) {
    
    inline def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
    
    inline def setAuthUndefined: Self = StObject.set(x, "auth", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setMatchId(value: String): Self = StObject.set(x, "matchId", value.asInstanceOf[js.Any])
    
    inline def setMatchIdUndefined: Self = StObject.set(x, "matchId", js.undefined)
    
    inline def setMatchVersion(value: Double): Self = StObject.set(x, "matchVersion", value.asInstanceOf[js.Any])
    
    inline def setMatchVersionUndefined: Self = StObject.set(x, "matchVersion", js.undefined)
    
    inline def setPendingParticipantId(value: String): Self = StObject.set(x, "pendingParticipantId", value.asInstanceOf[js.Any])
    
    inline def setPendingParticipantIdUndefined: Self = StObject.set(x, "pendingParticipantId", js.undefined)
  }
}
