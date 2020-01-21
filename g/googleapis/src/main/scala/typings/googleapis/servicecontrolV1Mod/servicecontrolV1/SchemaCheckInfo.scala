package typings.googleapis.servicecontrolV1Mod.servicecontrolV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains additional information about the check operation.
  */
@js.native
trait SchemaCheckInfo extends js.Object {
  /**
    * Consumer info of this check.
    */
  var consumerInfo: js.UndefOr[SchemaConsumerInfo] = js.native
  /**
    * A list of fields and label keys that are ignored by the server. The
    * client doesn&#39;t need to send them for following requests to improve
    * performance and allow better aggregation.
    */
  var unusedArguments: js.UndefOr[js.Array[String]] = js.native
}

object SchemaCheckInfo {
  @scala.inline
  def apply(consumerInfo: SchemaConsumerInfo = null, unusedArguments: js.Array[String] = null): SchemaCheckInfo = {
    val __obj = js.Dynamic.literal()
    if (consumerInfo != null) __obj.updateDynamic("consumerInfo")(consumerInfo.asInstanceOf[js.Any])
    if (unusedArguments != null) __obj.updateDynamic("unusedArguments")(unusedArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaCheckInfo]
  }
}

