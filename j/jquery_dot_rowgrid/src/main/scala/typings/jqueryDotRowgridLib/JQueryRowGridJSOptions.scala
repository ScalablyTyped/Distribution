package typings
package jqueryDotRowgridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryRowGridJSOptions extends js.Object {
  var itemSelector: java.lang.String
  var maxMargin: js.UndefOr[scala.Double] = js.undefined
  var minMargin: js.UndefOr[scala.Double] = js.undefined
}

object JQueryRowGridJSOptions {
  @scala.inline
  def apply(
    itemSelector: java.lang.String,
    maxMargin: scala.Int | scala.Double = null,
    minMargin: scala.Int | scala.Double = null
  ): JQueryRowGridJSOptions = {
    val __obj = js.Dynamic.literal(itemSelector = itemSelector)
    if (maxMargin != null) __obj.updateDynamic("maxMargin")(maxMargin.asInstanceOf[js.Any])
    if (minMargin != null) __obj.updateDynamic("minMargin")(minMargin.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryRowGridJSOptions]
  }
}

