package typings
package kafkaDashNodeLib.kafkaDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Topic extends js.Object {
  var autoCommit: js.UndefOr[scala.Boolean] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var topic: java.lang.String
}

object Topic {
  @scala.inline
  def apply(
    topic: java.lang.String,
    autoCommit: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    offset: scala.Int | scala.Double = null
  ): Topic = {
    val __obj = js.Dynamic.literal(topic = topic)
    if (!js.isUndefined(autoCommit)) __obj.updateDynamic("autoCommit")(autoCommit)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Topic]
  }
}

