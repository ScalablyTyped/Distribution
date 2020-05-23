package typings.kikBrowser

import typings.kikBrowser.anon.Username
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KikPickUsersOptions extends js.Object {
  var filterSelf: js.UndefOr[Boolean] = js.undefined
  var filtered: js.UndefOr[js.Array[String]] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var minResults: js.UndefOr[Double] = js.undefined
  var preselected: js.UndefOr[js.Array[Username]] = js.undefined
}

object KikPickUsersOptions {
  @scala.inline
  def apply(
    filterSelf: js.UndefOr[Boolean] = js.undefined,
    filtered: js.Array[String] = null,
    maxResults: js.UndefOr[Double] = js.undefined,
    minResults: js.UndefOr[Double] = js.undefined,
    preselected: js.Array[Username] = null
  ): KikPickUsersOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(filterSelf)) __obj.updateDynamic("filterSelf")(filterSelf.get.asInstanceOf[js.Any])
    if (filtered != null) __obj.updateDynamic("filtered")(filtered.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minResults)) __obj.updateDynamic("minResults")(minResults.get.asInstanceOf[js.Any])
    if (preselected != null) __obj.updateDynamic("preselected")(preselected.asInstanceOf[js.Any])
    __obj.asInstanceOf[KikPickUsersOptions]
  }
}

