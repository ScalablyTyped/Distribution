package typings
package kafkajsLib.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConsumerSubscribeOptions extends js.Object {
  var fromBeginning: js.UndefOr[scala.Boolean] = js.undefined
  var topic: java.lang.String
}

object ConsumerSubscribeOptions {
  @scala.inline
  def apply(topic: java.lang.String, fromBeginning: js.UndefOr[scala.Boolean] = js.undefined): ConsumerSubscribeOptions = {
    val __obj = js.Dynamic.literal(topic = topic)
    if (!js.isUndefined(fromBeginning)) __obj.updateDynamic("fromBeginning")(fromBeginning)
    __obj.asInstanceOf[ConsumerSubscribeOptions]
  }
}

