package typings
package kafkajsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Timeout extends js.Object {
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var topics: js.Array[kafkajsLib.kafkajsMod.ITopicConfig]
  var validateOnly: js.UndefOr[scala.Boolean] = js.undefined
  var waitForLeaders: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Timeout {
  @scala.inline
  def apply(
    topics: js.Array[kafkajsLib.kafkajsMod.ITopicConfig],
    timeout: scala.Int | scala.Double = null,
    validateOnly: js.UndefOr[scala.Boolean] = js.undefined,
    waitForLeaders: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Timeout = {
    val __obj = js.Dynamic.literal(topics = topics)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(validateOnly)) __obj.updateDynamic("validateOnly")(validateOnly)
    if (!js.isUndefined(waitForLeaders)) __obj.updateDynamic("waitForLeaders")(waitForLeaders)
    __obj.asInstanceOf[Anon_Timeout]
  }
}

