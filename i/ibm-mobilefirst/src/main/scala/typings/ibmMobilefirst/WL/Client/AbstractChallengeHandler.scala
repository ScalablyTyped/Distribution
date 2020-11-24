package typings.ibmMobilefirst.WL.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbstractChallengeHandler extends js.Object {
  
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
  
  @scala.inline
  implicit class AbstractChallengeHandlerOps[Self <: AbstractChallengeHandler] (val x: Self) extends AnyVal {
    
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
    def setHandleChallenge(value: js.Any => Boolean): Self = this.set("handleChallenge", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsCustomResponse(value: js.Any => Boolean): Self = this.set("isCustomResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmitAdapterAuthentication(value: (ChallengehandlerInvocationData, ChallengeHandlerAuthenticationOptions) => Unit): Self = this.set("submitAdapterAuthentication", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSubmitFailure(value: String => Unit): Self = this.set("submitFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSubmitLoginForm(
      value: (String, ChallengeHandlerSubmitLoginFormOptions, js.Function1[/* transport */ js.Any, Unit]) => Unit
    ): Self = this.set("submitLoginForm", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSubmitSuccess(value: () => Unit): Self = this.set("submitSuccess", js.Any.fromFunction0(value))
  }
}
