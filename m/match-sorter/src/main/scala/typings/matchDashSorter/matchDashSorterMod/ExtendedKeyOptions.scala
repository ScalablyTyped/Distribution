package typings.matchDashSorter.matchDashSorterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedKeyOptions[T] extends js.Object {
  var key: String | (js.Function1[/* item */ T, String])
  var maxRanking: js.UndefOr[Double] = js.undefined
  var minRanking: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object ExtendedKeyOptions {
  @scala.inline
  def apply[T](
    key: String | (js.Function1[/* item */ T, String]),
    maxRanking: Int | Double = null,
    minRanking: Int | Double = null,
    threshold: Int | Double = null
  ): ExtendedKeyOptions[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (maxRanking != null) __obj.updateDynamic("maxRanking")(maxRanking.asInstanceOf[js.Any])
    if (minRanking != null) __obj.updateDynamic("minRanking")(minRanking.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedKeyOptions[T]]
  }
}

