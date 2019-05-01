package typings
package matchDashSorterLib.matchDashSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var keepDiacritics: js.UndefOr[scala.Boolean] = js.undefined
  var keys: js.UndefOr[
    js.Array[
      java.lang.String | (js.Function1[/* item */ T, java.lang.String]) | ExtendedKeyOptions[T]
    ]
  ] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    keepDiacritics: js.UndefOr[scala.Boolean] = js.undefined,
    keys: js.Array[
      java.lang.String | (js.Function1[/* item */ T, java.lang.String]) | ExtendedKeyOptions[T]
    ] = null,
    threshold: scala.Int | scala.Double = null
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(keepDiacritics)) __obj.updateDynamic("keepDiacritics")(keepDiacritics)
    if (keys != null) __obj.updateDynamic("keys")(keys)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

