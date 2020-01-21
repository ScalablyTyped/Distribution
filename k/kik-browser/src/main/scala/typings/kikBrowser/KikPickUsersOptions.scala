package typings.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KikPickUsersOptions extends js.Object {
  var filterSelf: js.UndefOr[Boolean] = js.undefined
  var filtered: js.UndefOr[js.Array[String]] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var minResults: js.UndefOr[Double] = js.undefined
  var preselected: js.UndefOr[js.Array[AnonUsername]] = js.undefined
}

object KikPickUsersOptions {
  @scala.inline
  def apply(
    filterSelf: js.UndefOr[Boolean] = js.undefined,
    filtered: js.Array[String] = null,
    maxResults: Int | Double = null,
    minResults: Int | Double = null,
    preselected: js.Array[AnonUsername] = null
  ): KikPickUsersOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filterSelf)) __obj.updateDynamic("filterSelf")(filterSelf.asInstanceOf[js.Any])
    if (filtered != null) __obj.updateDynamic("filtered")(filtered.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (minResults != null) __obj.updateDynamic("minResults")(minResults.asInstanceOf[js.Any])
    if (preselected != null) __obj.updateDynamic("preselected")(preselected.asInstanceOf[js.Any])
    __obj.asInstanceOf[KikPickUsersOptions]
  }
}

