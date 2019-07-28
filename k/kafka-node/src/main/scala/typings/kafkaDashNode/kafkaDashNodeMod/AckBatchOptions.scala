package typings.kafkaDashNode.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AckBatchOptions extends js.Object {
  var noAckBatchAge: Double | Null
  var noAckBatchSize: Double | Null
}

object AckBatchOptions {
  @scala.inline
  def apply(noAckBatchAge: Int | Double = null, noAckBatchSize: Int | Double = null): AckBatchOptions = {
    val __obj = js.Dynamic.literal()
    if (noAckBatchAge != null) __obj.updateDynamic("noAckBatchAge")(noAckBatchAge.asInstanceOf[js.Any])
    if (noAckBatchSize != null) __obj.updateDynamic("noAckBatchSize")(noAckBatchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AckBatchOptions]
  }
}

