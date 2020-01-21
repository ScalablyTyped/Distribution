package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderpaymentsNotifyAuthDeclinedRequest extends js.Object {
  /**
    * Reason why payment authorization was declined.
    */
  var declineReason: js.UndefOr[String] = js.native
}

object SchemaOrderpaymentsNotifyAuthDeclinedRequest {
  @scala.inline
  def apply(declineReason: String = null): SchemaOrderpaymentsNotifyAuthDeclinedRequest = {
    val __obj = js.Dynamic.literal()
    if (declineReason != null) __obj.updateDynamic("declineReason")(declineReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyAuthDeclinedRequest]
  }
}

