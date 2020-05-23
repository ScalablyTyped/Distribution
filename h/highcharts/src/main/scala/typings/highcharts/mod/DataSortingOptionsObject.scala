package typings.highcharts.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSortingOptionsObject extends js.Object {
  /**
    * Enable or disable data sorting for the series.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether to allow matching points by name in an update.
    */
  var matchByName: js.UndefOr[Boolean] = js.undefined
  /**
    * Determines what data value should be used to sort by.
    */
  var sortKey: js.UndefOr[String] = js.undefined
}

object DataSortingOptionsObject {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    matchByName: js.UndefOr[Boolean] = js.undefined,
    sortKey: String = null
  ): DataSortingOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(matchByName)) __obj.updateDynamic("matchByName")(matchByName.get.asInstanceOf[js.Any])
    if (sortKey != null) __obj.updateDynamic("sortKey")(sortKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSortingOptionsObject]
  }
}

