package typings.googleapis.pubsubV1beta2Mod.pubsubV1beta2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Request for the `Pull` method.
  */
@js.native
trait SchemaPullRequest extends js.Object {
  /**
    * The maximum number of messages returned for this request. The Pub/Sub
    * system may return fewer than the number specified.
    */
  var maxMessages: js.UndefOr[Double] = js.native
  /**
    * If this is specified as true the system will respond immediately even if
    * it is not able to return a message in the `Pull` response. Otherwise the
    * system is allowed to wait until at least one message is available rather
    * than returning no messages. The client may cancel the request if it does
    * not wish to wait any longer for the response.
    */
  var returnImmediately: js.UndefOr[Boolean] = js.native
}

object SchemaPullRequest {
  @scala.inline
  def apply(maxMessages: Int | Double = null, returnImmediately: js.UndefOr[Boolean] = js.undefined): SchemaPullRequest = {
    val __obj = js.Dynamic.literal()
    if (maxMessages != null) __obj.updateDynamic("maxMessages")(maxMessages.asInstanceOf[js.Any])
    if (!js.isUndefined(returnImmediately)) __obj.updateDynamic("returnImmediately")(returnImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPullRequest]
  }
}

