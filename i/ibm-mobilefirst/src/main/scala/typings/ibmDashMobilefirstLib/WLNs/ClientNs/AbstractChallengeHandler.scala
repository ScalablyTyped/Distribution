package typings
package ibmDashMobilefirstLib.WLNs.ClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WL.Client.AbstractChallengeHandler")
@js.native
class AbstractChallengeHandler () extends js.Object {
  def handleChallenge(challenge: js.Any): scala.Boolean = js.native
  def isCustomResponse(transport: js.Any): scala.Boolean = js.native
  def submitAdapterAuthentication(invocationData: ChallengehandlerInvocationData, options: ChallengeHandlerAuthenticationOptions): scala.Unit = js.native
  def submitFailure(error: java.lang.String): scala.Unit = js.native
  def submitLoginForm(
    reqURL: java.lang.String,
    options: ChallengeHandlerSubmitLoginFormOptions,
    submitLoginFormCallback: js.Function1[/* transport */ js.Any, scala.Unit]
  ): scala.Unit = js.native
  def submitSuccess(): scala.Unit = js.native
}

