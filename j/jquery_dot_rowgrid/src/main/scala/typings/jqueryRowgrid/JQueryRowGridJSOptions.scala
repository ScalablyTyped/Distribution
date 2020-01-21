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
  def apply(itemSelector: String, maxMargin: Int | Double = null, minMargin: Int | Double = null): JQueryRowGridJSOptions = {
    val __obj = js.Dynamic.literal(itemSelector = itemSelector.asInstanceOf[js.Any])
    if (maxMargin != null) __obj.updateDynamic("maxMargin")(maxMargin.asInstanceOf[js.Any])
    if (minMargin != null) __obj.updateDynamic("minMargin")(minMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryRowGridJSOptions]
  }
}

