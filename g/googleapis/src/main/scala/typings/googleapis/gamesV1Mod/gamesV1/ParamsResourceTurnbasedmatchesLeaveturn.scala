package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParamsResourceTurnbasedmatchesLeaveturn extends StandardParameters {
  
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.native
  
  /**
    * The ID of the match.
    */
  var matchId: js.UndefOr[String] = js.native
  
  /**
    * The version of the match being updated.
    */
  var matchVersion: js.UndefOr[Double] = js.native
  
  /**
    * The ID of another participant who should take their turn next. If not
    * set, the match will wait for other player(s) to join via automatching;
    * this is only valid if automatch criteria is set on the match with
    * remaining slots for automatched players.
    */
  var pendingParticipantId: js.UndefOr[String] = js.native
}
object ParamsResourceTurnbasedmatchesLeaveturn {
  
  @scala.inline
  def apply(): ParamsResourceTurnbasedmatchesLeaveturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTurnbasedmatchesLeaveturn]
  }
  
  @scala.inline
  implicit class ParamsResourceTurnbasedmatchesLeaveturnOps[Self <: ParamsResourceTurnbasedmatchesLeaveturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuth(value: String | OAuth2Client | JWT | Compute | UserRefreshClient): Self = this.set("auth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setMatchId(value: String): Self = this.set("matchId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchId: Self = this.set("matchId", js.undefined)
    
    @scala.inline
    def setMatchVersion(value: Double): Self = this.set("matchVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchVersion: Self = this.set("matchVersion", js.undefined)
    
    @scala.inline
    def setPendingParticipantId(value: String): Self = this.set("pendingParticipantId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePendingParticipantId: Self = this.set("pendingParticipantId", js.undefined)
  }
}
