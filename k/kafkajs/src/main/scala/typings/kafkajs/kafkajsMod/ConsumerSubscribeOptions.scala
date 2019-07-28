package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerSubscribeOptions extends js.Object {
  var fromBeginning: js.UndefOr[Boolean] = js.undefined
  var topic: String
}

object ConsumerSubscribeOptions {
  @scala.inline
  def apply(topic: String, fromBeginning: js.UndefOr[Boolean] = js.undefined): ConsumerSubscribeOptions = {
    val __obj = js.Dynamic.literal(topic = topic)
    if (!js.isUndefined(fromBeginning)) __obj.updateDynamic("fromBeginning")(fromBeginning)
    __obj.asInstanceOf[ConsumerSubscribeOptions]
  }
}

