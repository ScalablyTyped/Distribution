package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AckBatchOptions extends js.Object {
  var noAckBatchAge: scala.Double | scala.Null
  var noAckBatchSize: scala.Double | scala.Null
}

object AckBatchOptions {
  @scala.inline
  def apply(noAckBatchAge: scala.Int | scala.Double = null, noAckBatchSize: scala.Int | scala.Double = null): AckBatchOptions = {
    val __obj = js.Dynamic.literal()
    if (noAckBatchAge != null) __obj.updateDynamic("noAckBatchAge")(noAckBatchAge.asInstanceOf[js.Any])
    if (noAckBatchSize != null) __obj.updateDynamic("noAckBatchSize")(noAckBatchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[AckBatchOptions]
  }
}

