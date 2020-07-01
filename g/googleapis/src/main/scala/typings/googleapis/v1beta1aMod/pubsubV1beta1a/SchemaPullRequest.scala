package typings.googleapis.v1beta1aMod.pubsubV1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the Pull method.
  */
@js.native
trait SchemaPullRequest extends js.Object {
  /**
    * If this is specified as true the system will respond immediately even if
    * it is not able to return a message in the Pull response. Otherwise the
    * system is allowed to wait until at least one message is available rather
    * than returning FAILED_PRECONDITION. The client may cancel the request if
    * it does not wish to wait any longer for the response.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.native
  /**
    * The subscription from which a message should be pulled.
    */
  var subscription: js.UndefOr[String] = js.native
}

object SchemaPullRequest {
  @scala.inline
  def apply(returnImmediately: js.UndefOr[Boolean] = js.undefined, subscription: String = null): SchemaPullRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(returnImmediately)) __obj.updateDynamic("returnImmediately")(returnImmediately.get.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPullRequest]
  }
}

