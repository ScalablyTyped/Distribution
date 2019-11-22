package typings.instagramDashPrivateDashApi.distResponsesChallengeDotStateDotResponseMod

import typings.instagramDashPrivateDashApi.distResponsesAccountDotRepositoryDotLoginDotResponseMod.AccountRepositoryLoginResponseLogged_in_user
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChallengeStateResponse extends js.Object {
  var action: String
  var logged_in_user: js.UndefOr[AccountRepositoryLoginResponseLogged_in_user] = js.undefined
  var nonce_code: String
  var status: String
  var step_data: ChallengeRepositoryStateResponseStepData
  var step_name: String
  var user_id: Double
}

object ChallengeStateResponse {
  @scala.inline
  def apply(
    action: String,
    nonce_code: String,
    status: String,
    step_data: ChallengeRepositoryStateResponseStepData,
    step_name: String,
    user_id: Double,
    logged_in_user: AccountRepositoryLoginResponseLogged_in_user = null
  ): ChallengeStateResponse = {
    val __obj = js.Dynamic.literal(action = action, nonce_code = nonce_code, status = status, step_data = step_data, step_name = step_name, user_id = user_id)
    if (logged_in_user != null) __obj.updateDynamic("logged_in_user")(logged_in_user)
    __obj.asInstanceOf[ChallengeStateResponse]
  }
}

