package typings.googleapis.gamesV1Mod.gamesV1

import typings.googleAuthLibrary.mod.Compute
import typings.googleAuthLibrary.mod.JWT
import typings.googleAuthLibrary.mod.OAuth2Client
import typings.googleAuthLibrary.mod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsResourceQuestmilestonesClaim extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * The ID of the milestone.
    */
  var milestoneId: js.UndefOr[String] = js.native
  /**
    * The ID of the quest.
    */
  var questId: js.UndefOr[String] = js.native
  /**
    * A numeric ID to ensure that the request is handled correctly across
    * retries. Your client application must generate this ID randomly.
    */
  var requestId: js.UndefOr[String] = js.native
}

object ParamsResourceQuestmilestonesClaim {
  @scala.inline
  def apply(): ParamsResourceQuestmilestonesClaim = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceQuestmilestonesClaim]
  }
  @scala.inline
  implicit class ParamsResourceQuestmilestonesClaimOps[Self <: ParamsResourceQuestmilestonesClaim] (val x: Self) extends AnyVal {
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
    def setMilestoneId(value: String): Self = this.set("milestoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilestoneId: Self = this.set("milestoneId", js.undefined)
    @scala.inline
    def setQuestId(value: String): Self = this.set("questId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuestId: Self = this.set("questId", js.undefined)
    @scala.inline
    def setRequestId(value: String): Self = this.set("requestId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestId: Self = this.set("requestId", js.undefined)
  }
  
}

