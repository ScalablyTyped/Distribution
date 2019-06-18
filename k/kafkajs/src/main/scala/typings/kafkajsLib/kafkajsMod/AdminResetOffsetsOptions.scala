package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminResetOffsetsOptions extends js.Object {
  var earliest: js.UndefOr[scala.Boolean] = js.undefined
  var groupId: java.lang.String
  var topic: java.lang.String
}

object AdminResetOffsetsOptions {
  @scala.inline
  def apply(
    groupId: java.lang.String,
    topic: java.lang.String,
    earliest: js.UndefOr[scala.Boolean] = js.undefined
  ): AdminResetOffsetsOptions = {
    val __obj = js.Dynamic.literal(groupId = groupId, topic = topic)
    if (!js.isUndefined(earliest)) __obj.updateDynamic("earliest")(earliest)
    __obj.asInstanceOf[AdminResetOffsetsOptions]
  }
}

