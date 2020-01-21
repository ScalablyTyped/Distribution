package typings.javascriptTimeAgo.localeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tense extends js.Object {
  var current: js.UndefOr[QuantifyType | String] = js.undefined
  var future: js.UndefOr[QuantifyType | String] = js.undefined
  var next: js.UndefOr[QuantifyType | String] = js.undefined
  var past: js.UndefOr[QuantifyType | String] = js.undefined
  var previous: js.UndefOr[QuantifyType | String] = js.undefined
}

object Tense {
  @scala.inline
  def apply(
    current: QuantifyType | String = null,
    future: QuantifyType | String = null,
    next: QuantifyType | String = null,
    past: QuantifyType | String = null,
    previous: QuantifyType | String = null
  ): Tense = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (future != null) __obj.updateDynamic("future")(future.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    if (past != null) __obj.updateDynamic("past")(past.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tense]
  }
}

