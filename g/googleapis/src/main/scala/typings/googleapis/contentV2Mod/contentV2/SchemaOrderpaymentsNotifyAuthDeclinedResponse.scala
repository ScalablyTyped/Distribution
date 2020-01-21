package typings.googleapis.contentV2Mod.contentV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrderpaymentsNotifyAuthDeclinedResponse extends js.Object {
  /**
    * The status of the execution.
    */
  var executionStatus: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#orderpaymentsNotifyAuthDeclinedResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaOrderpaymentsNotifyAuthDeclinedResponse {
  @scala.inline
  def apply(executionStatus: String = null, kind: String = null): SchemaOrderpaymentsNotifyAuthDeclinedResponse = {
    val __obj = js.Dynamic.literal()
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrderpaymentsNotifyAuthDeclinedResponse]
  }
}

