package typings.knockoutKogrid.kg

import typings.knockout.KnockoutObservable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterOptions extends js.Object {
  /** Variable to contain the current search filter */
  var filterText: js.UndefOr[KnockoutObservable[String]] = js.undefined
  /** Number of seconds to throttle before reapplying search */
  var filterThrottle: js.UndefOr[Double] = js.undefined
  /** Is the filtering internal or does it require a server visit. You should subscribe to filterText to refresh */
  var useExternalFilter: js.UndefOr[Boolean] = js.undefined
}

object FilterOptions {
  @scala.inline
  def apply(
    filterText: KnockoutObservable[String] = null,
    filterThrottle: js.UndefOr[Double] = js.undefined,
    useExternalFilter: js.UndefOr[Boolean] = js.undefined
  ): FilterOptions = {
    val __obj = js.Dynamic.literal()
    if (filterText != null) __obj.updateDynamic("filterText")(filterText.asInstanceOf[js.Any])
    if (!js.isUndefined(filterThrottle)) __obj.updateDynamic("filterThrottle")(filterThrottle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useExternalFilter)) __obj.updateDynamic("useExternalFilter")(useExternalFilter.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterOptions]
  }
}

