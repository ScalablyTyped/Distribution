package typings.instagramDashPrivateDashApi.distResponsesLoginDashRequiredDotResponseMod

import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.fail
import typings.instagramDashPrivateDashApi.instagramDashPrivateDashApiStrings.login_required
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoginRequiredResponse extends js.Object {
  var logout_reason: Double
  var message: login_required
  var status: fail
}

object LoginRequiredResponse {
  @scala.inline
  def apply(logout_reason: Double, message: login_required, status: fail): LoginRequiredResponse = {
    val __obj = js.Dynamic.literal(logout_reason = logout_reason.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LoginRequiredResponse]
  }
}

