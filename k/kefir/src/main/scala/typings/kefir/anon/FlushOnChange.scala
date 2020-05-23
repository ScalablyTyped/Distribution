package typings.kefir.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlushOnChange extends js.Object {
  var flushOnChange: js.UndefOr[Boolean] = js.undefined
  var flushOnEnd: js.UndefOr[Boolean] = js.undefined
}

object FlushOnChange {
  @scala.inline
  def apply(flushOnChange: js.UndefOr[Boolean] = js.undefined, flushOnEnd: js.UndefOr[Boolean] = js.undefined): FlushOnChange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flushOnChange)) __obj.updateDynamic("flushOnChange")(flushOnChange.get.asInstanceOf[js.Any])
    if (!js.isUndefined(flushOnEnd)) __obj.updateDynamic("flushOnEnd")(flushOnEnd.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlushOnChange]
  }
}

