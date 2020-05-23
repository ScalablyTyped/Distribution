package typings.kafkaNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topic extends js.Object {
  var autoCommit: js.UndefOr[Boolean] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var topic: String
}

object Topic {
  @scala.inline
  def apply(
    topic: String,
    autoCommit: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    offset: js.UndefOr[Double] = js.undefined
  ): Topic = {
    val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
}

