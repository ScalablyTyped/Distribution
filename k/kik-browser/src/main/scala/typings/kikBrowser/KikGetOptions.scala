package typings.kikBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KikGetOptions extends js.Object {
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxResults: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minResults: js.UndefOr[Double] = js.undefined
  var quality: js.UndefOr[Double] = js.undefined
}

object KikGetOptions {
  @scala.inline
  def apply(
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxResults: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    minResults: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined
  ): KikGetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxResults)) __obj.updateDynamic("maxResults")(maxResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minResults)) __obj.updateDynamic("minResults")(minResults.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[KikGetOptions]
  }
}

