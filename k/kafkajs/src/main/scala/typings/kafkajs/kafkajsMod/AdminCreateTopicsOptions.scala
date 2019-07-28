package typings.kafkajs.kafkajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdminCreateTopicsOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
  var topics: js.Array[AdminTopic]
  var validateOnly: js.UndefOr[Boolean] = js.undefined
  var waitForLeaders: js.UndefOr[Boolean] = js.undefined
}

object AdminCreateTopicsOptions {
  @scala.inline
  def apply(
    topics: js.Array[AdminTopic],
    timeout: Int | Double = null,
    validateOnly: js.UndefOr[Boolean] = js.undefined,
    waitForLeaders: js.UndefOr[Boolean] = js.undefined
  ): AdminCreateTopicsOptions = {
    val __obj = js.Dynamic.literal(topics = topics)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnly)) __obj.updateDynamic("validateOnly")(validateOnly)
    if (!js.isUndefined(waitForLeaders)) __obj.updateDynamic("waitForLeaders")(waitForLeaders)
    __obj.asInstanceOf[AdminCreateTopicsOptions]
  }
}

