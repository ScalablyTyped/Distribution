package typings.googleapis.containerV1beta1Mod.containerV1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * StatusCondition describes why a cluster or a node pool has a certain status
  * (e.g., ERROR or DEGRADED).
  */
@js.native
trait SchemaStatusCondition extends js.Object {
  /**
    * Machine-friendly representation of the condition
    */
  var code: js.UndefOr[String] = js.native
  /**
    * Human-friendly representation of the condition
    */
  var message: js.UndefOr[String] = js.native
}

object SchemaStatusCondition {
  @scala.inline
  def apply(code: String = null, message: String = null): SchemaStatusCondition = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStatusCondition]
  }
}

