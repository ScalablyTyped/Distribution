package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminResetOffsetsOptions extends js.Object {
  var earliest: js.UndefOr[Boolean] = js.undefined
  var groupId: String
  var topic: String
}

object AdminResetOffsetsOptions {
  @scala.inline
  def apply(groupId: String, topic: String, earliest: js.UndefOr[Boolean] = js.undefined): AdminResetOffsetsOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId, topic = topic)
    if (!js.isUndefined(earliest)) __obj.updateDynamic("earliest")(earliest)
    __obj.asInstanceOf[AdminResetOffsetsOptions]
  }
}

