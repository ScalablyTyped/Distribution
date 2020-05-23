package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AckBatchOptions extends js.Object {
  var noAckBatchAge: Double | Null
  var noAckBatchSize: Double | Null
}

object AckBatchOptions {
  @scala.inline
  def apply(
    noAckBatchAge: Double = null.asInstanceOf[Double],
    noAckBatchSize: Double = null.asInstanceOf[Double]
  ): AckBatchOptions = {
    val __obj = js.Dynamic.literal(noAckBatchAge = noAckBatchAge.asInstanceOf[js.Any], noAckBatchSize = noAckBatchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AckBatchOptions]
  }
}

