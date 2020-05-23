package typings.luminoWidgets.scrollbarMod.ScrollBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An options object for creating a scroll bar.
  */
trait IOptions extends js.Object {
  /**
    * The maximum value for the scroll bar.
    *
    * The default is `100`.
    */
  var maximum: js.UndefOr[Double] = js.undefined
  /**
    * The orientation of the scroll bar.
    *
    * The default is `'vertical'`.
    */
  var orientation: js.UndefOr[Orientation] = js.undefined
  /**
    * The page size for the scroll bar.
    *
    * The default is `10`.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * The value for the scroll bar.
    *
    * The default is `0`.
    */
  var value: js.UndefOr[Double] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    maximum: js.UndefOr[Double] = js.undefined,
    orientation: Orientation = null,
    page: js.UndefOr[Double] = js.undefined,
    value: js.UndefOr[Double] = js.undefined
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maximum)) __obj.updateDynamic("maximum")(maximum.get.asInstanceOf[js.Any])
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

