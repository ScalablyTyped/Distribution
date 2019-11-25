package typings.kafkaDashNode.kafkaDashNodeMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProduceRequest extends js.Object {
  var attributes: js.UndefOr[Double] = js.undefined
   // string[] | Array<KeyedMessage> | string | KeyedMessage
  var key: js.UndefOr[String | Buffer] = js.undefined
  var messages: js.Any
  var partition: js.UndefOr[Double] = js.undefined
  var topic: String
}

object ProduceRequest {
  @scala.inline
  def apply(
    messages: js.Any,
    topic: String,
    attributes: Int | Double = null,
    key: String | Buffer = null,
    partition: Int | Double = null
  ): ProduceRequest = {
    val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (partition != null) __obj.updateDynamic("partition")(partition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProduceRequest]
  }
}

