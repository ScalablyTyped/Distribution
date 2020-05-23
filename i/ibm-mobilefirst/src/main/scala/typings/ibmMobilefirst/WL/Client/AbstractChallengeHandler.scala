package typings.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractChallengeHandler extends js.Object {
  def handleChallenge(challenge: js.Any): Boolean
  def isCustomResponse(transport: js.Any): Boolean
  def submitAdapterAuthentication(invocationData: ChallengehandlerInvocationData, options: ChallengeHandlerAuthenticationOptions): Unit
  def submitFailure(error: String): Unit
  def submitLoginForm(
    reqURL: String,
    options: ChallengeHandlerSubmitLoginFormOptions,
    submitLoginFormCallback: js.Function1[/* transport */ js.Any, Unit]
  ): Unit
  def submitSuccess(): Unit
}

object AbstractChallengeHandler {
  @scala.inline
  def apply(
    handleChallenge: js.Any => Boolean,
    isCustomResponse: js.Any => Boolean,
    submitAdapterAuthentication: (ChallengehandlerInvocationData, ChallengeHandlerAuthenticationOptions) => Unit,
    submitFailure: String => Unit,
    submitLoginForm: (String, ChallengeHandlerSubmitLoginFormOptions, js.Function1[/* transport */ js.Any, Unit]) => Unit,
    submitSuccess: () => Unit
  ): AbstractChallengeHandler = {
    val __obj = js.Dynamic.literal(handleChallenge = js.Any.fromFunction1(handleChallenge), isCustomResponse = js.Any.fromFunction1(isCustomResponse), submitAdapterAuthentication = js.Any.fromFunction2(submitAdapterAuthentication), submitFailure = js.Any.fromFunction1(submitFailure), submitLoginForm = js.Any.fromFunction3(submitLoginForm), submitSuccess = js.Any.fromFunction0(submitSuccess))
    __obj.asInstanceOf[AbstractChallengeHandler]
  }
}

