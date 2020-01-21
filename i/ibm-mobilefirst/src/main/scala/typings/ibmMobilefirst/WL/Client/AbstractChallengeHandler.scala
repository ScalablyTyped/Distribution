package typings.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Client.AbstractChallengeHandler")
@js.native
class AbstractChallengeHandler () extends js.Object {
  def handleChallenge(challenge: js.Any): Boolean = js.native
  def isCustomResponse(transport: js.Any): Boolean = js.native
  def submitAdapterAuthentication(invocationData: ChallengehandlerInvocationData, options: ChallengeHandlerAuthenticationOptions): Unit = js.native
  def submitFailure(error: String): Unit = js.native
  def submitLoginForm(
    reqURL: String,
    options: ChallengeHandlerSubmitLoginFormOptions,
    submitLoginFormCallback: js.Function1[/* transport */ js.Any, Unit]
  ): Unit = js.native
  def submitSuccess(): Unit = js.native
}

