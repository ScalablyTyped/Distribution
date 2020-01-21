package typings.kefir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFlushOnChange extends js.Object {
  var flushOnChange: js.UndefOr[Boolean] = js.undefined
  var flushOnEnd: js.UndefOr[Boolean] = js.undefined
}

object AnonFlushOnChange {
  @scala.inline
  def apply(flushOnChange: js.UndefOr[Boolean] = js.undefined, flushOnEnd: js.UndefOr[Boolean] = js.undefined): AnonFlushOnChange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flushOnChange)) __obj.updateDynamic("flushOnChange")(flushOnChange.asInstanceOf[js.Any])
    if (!js.isUndefined(flushOnEnd)) __obj.updateDynamic("flushOnEnd")(flushOnEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFlushOnChange]
  }
}

