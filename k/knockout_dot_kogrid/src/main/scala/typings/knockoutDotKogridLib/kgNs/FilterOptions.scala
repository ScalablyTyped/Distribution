package typings
package knockoutDotKogridLib.kgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOptions extends js.Object {
  /** Variable to contain the current search filter */
  var filterText: js.UndefOr[knockoutLib.KnockoutObservable[java.lang.String]] = js.undefined
  /** Number of seconds to throttle before reapplying search */
  var filterThrottle: js.UndefOr[scala.Double] = js.undefined
  /** Is the filtering internal or does it require a server visit. You should subscribe to filterText to refresh */
  var useExternalFilter: js.UndefOr[scala.Boolean] = js.undefined
}

object FilterOptions {
  @scala.inline
  def apply(
    filterText: knockoutLib.KnockoutObservable[java.lang.String] = null,
    filterThrottle: scala.Int | scala.Double = null,
    useExternalFilter: js.UndefOr[scala.Boolean] = js.undefined
  ): FilterOptions = {
    val __obj = js.Dynamic.literal()
    if (filterText != null) __obj.updateDynamic("filterText")(filterText)
    if (filterThrottle != null) __obj.updateDynamic("filterThrottle")(filterThrottle.asInstanceOf[js.Any])
    if (!js.isUndefined(useExternalFilter)) __obj.updateDynamic("useExternalFilter")(useExternalFilter)
    __obj.asInstanceOf[FilterOptions]
  }
}

