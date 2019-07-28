package typings.matchDashSorter.matchDashSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var keepDiacritics: js.UndefOr[Boolean] = js.undefined
  var keys: js.UndefOr[js.Array[String | (js.Function1[/* item */ T, String]) | ExtendedKeyOptions[T]]] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    keepDiacritics: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[String | (js.Function1[/* item */ T, String]) | ExtendedKeyOptions[T]] = null,
    threshold: Int | Double = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepDiacritics)) __obj.updateDynamic("keepDiacritics")(keepDiacritics)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

