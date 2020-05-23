package typings.jqueryPin.mod

import typings.jqueryPin.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var activeClass: js.UndefOr[String] = js.undefined
  var containerSelector: js.UndefOr[String] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[Bottom] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    activeClass: String = null,
    containerSelector: String = null,
    minWidth: js.UndefOr[Double] = js.undefined,
    padding: Bottom = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (containerSelector != null) __obj.updateDynamic("containerSelector")(containerSelector.asInstanceOf[js.Any])
    if (!js.isUndefined(minWidth)) __obj.updateDynamic("minWidth")(minWidth.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

