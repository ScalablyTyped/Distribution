package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlignObject extends js.Object {
  /**
    * Horizontal alignment. Can be one of `left`, `center` and `right`.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * Use the `transform` attribute with translateX and translateY custom
    * attributes to align this elements rather than `x` and `y` attributes.
    */
  var alignByTranslate: js.UndefOr[Boolean] = js.undefined
  /**
    * Vertical alignment. Can be one of `top`, `middle` and `bottom`.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * Horizontal pixel offset from alignment.
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * Vertical pixel offset from alignment.
    */
  var y: js.UndefOr[Double] = js.undefined
}

object AlignObject {
  @scala.inline
  def apply(
    align: AlignValue = null,
    alignByTranslate: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: VerticalAlignValue = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): AlignObject = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(alignByTranslate)) __obj.updateDynamic("alignByTranslate")(alignByTranslate.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignObject]
  }
}

