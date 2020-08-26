package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceScoresSubmit extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The preferred language to use for strings returned by this method.
    */
  var language: js.UndefOr[String] = js.native
  /**
    * The ID of the leaderboard.
    */
  var leaderboardId: js.UndefOr[String] = js.native
  /**
    * The score you're submitting. The submitted score is ignored if it is
    * worse than a previously submitted score, where worse depends on the
    * leaderboard sort order. The meaning of the score value depends on the
    * leaderboard format type. For fixed-point, the score represents the raw
    * value. For time, the score represents elapsed time in milliseconds. For
    * currency, the score represents a value in micro units.
    */
  var score: js.UndefOr[String] = js.native
  /**
    * Additional information about the score you're submitting. Values must
    * contain no more than 64 URI-safe characters as defined by section 2.3 of
    * RFC 3986.
    */
  var scoreTag: js.UndefOr[String] = js.native
}

object ParamsResourceScoresSubmit {
  @scala.inline
  def apply(): ParamsResourceScoresSubmit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceScoresSubmit]
  }
  @scala.inline
  implicit class ParamsResourceScoresSubmitOps[Self <: ParamsResourceScoresSubmit] (val x: Self) extends AnyVal {
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
    def setLeaderboardId(value: String): Self = this.set("leaderboardId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeaderboardId: Self = this.set("leaderboardId", js.undefined)
    @scala.inline
    def setScore(value: String): Self = this.set("score", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScore: Self = this.set("score", js.undefined)
    @scala.inline
    def setScoreTag(value: String): Self = this.set("scoreTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScoreTag: Self = this.set("scoreTag", js.undefined)
  }
  
}

