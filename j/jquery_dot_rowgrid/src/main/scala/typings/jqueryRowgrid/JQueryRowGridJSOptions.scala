package typings.jqueryRowgrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryRowGridJSOptions extends js.Object {
  var itemSelector: String
  var maxMargin: js.UndefOr[Double] = js.undefined
  var minMargin: js.UndefOr[Double] = js.undefined
}

object JQueryRowGridJSOptions {
  @scala.inline
  def apply(
    itemSelector: String,
    maxMargin: js.UndefOr[Double] = js.undefined,
    minMargin: js.UndefOr[Double] = js.undefined
  ): JQueryRowGridJSOptions = {
    val __obj = js.Dynamic.literal(itemSelector = itemSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(maxMargin)) __obj.updateDynamic("maxMargin")(maxMargin.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minMargin)) __obj.updateDynamic("minMargin")(minMargin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryRowGridJSOptions]
  }
}

