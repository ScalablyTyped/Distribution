package typings.matchSorter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var keepDiacritics: js.UndefOr[Boolean] = js.undefined
  var keys: js.UndefOr[js.Array[KeyOptions[T] | ExtendedKeyOptions[T]]] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    keepDiacritics: js.UndefOr[Boolean] = js.undefined,
    keys: js.Array[KeyOptions[T] | ExtendedKeyOptions[T]] = null,
    threshold: js.UndefOr[Double] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepDiacritics)) __obj.updateDynamic("keepDiacritics")(keepDiacritics.get.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

