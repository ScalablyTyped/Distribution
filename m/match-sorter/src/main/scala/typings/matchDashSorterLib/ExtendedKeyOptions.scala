package typings
package matchDashSorterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtendedKeyOptions[T] extends js.Object {
  var key: java.lang.String | (js.Function1[/* item */ T, java.lang.String])
  var maxRanking: js.UndefOr[scala.Double] = js.undefined
  var minRanking: js.UndefOr[scala.Double] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
}

object ExtendedKeyOptions {
  @scala.inline
  def apply[T](
    key: java.lang.String | (js.Function1[/* item */ T, java.lang.String]),
    maxRanking: scala.Int | scala.Double = null,
    minRanking: scala.Int | scala.Double = null,
    threshold: scala.Int | scala.Double = null
  ): ExtendedKeyOptions[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (maxRanking != null) __obj.updateDynamic("maxRanking")(maxRanking.asInstanceOf[js.Any])
    if (minRanking != null) __obj.updateDynamic("minRanking")(minRanking.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedKeyOptions[T]]
  }
}

