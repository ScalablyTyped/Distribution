package typings.googleapis.v21Mod.contentV21

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaOrdersAcknowledgeResponse extends js.Object {
  /**
    * The status of the execution.
    */
  var executionStatus: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;content#ordersAcknowledgeResponse&quot;.
    */
  var kind: js.UndefOr[String] = js.native
}

object SchemaOrdersAcknowledgeResponse {
  @scala.inline
  def apply(executionStatus: String = null, kind: String = null): SchemaOrdersAcknowledgeResponse = {
    val __obj = js.Dynamic.literal()
    if (executionStatus != null) __obj.updateDynamic("executionStatus")(executionStatus.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaOrdersAcknowledgeResponse]
  }
}

