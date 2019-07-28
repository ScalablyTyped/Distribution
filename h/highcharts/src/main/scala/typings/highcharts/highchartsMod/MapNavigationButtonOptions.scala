package typings.highcharts.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapNavigationButtonOptions extends js.Object {
  /**
    * (Highmaps) The alignment of the navigation buttons.
    */
  var align: js.UndefOr[AlignValue] = js.undefined
  /**
    * (Highmaps) What box to align the buttons to. Possible values are
    * `plotBox` and `spacingBox`.
    */
  var alignTo: js.UndefOr[ButtonRelativeToValue] = js.undefined
  /**
    * (Highmaps) The pixel height of the map navigation buttons.
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) Padding for the navigation buttons.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) Text styles for the map navigation buttons.
    */
  var style: js.UndefOr[CSSObject] = js.undefined
  /**
    * (Highmaps) A configuration object for the button theme. The object
    * accepts SVG properties like `stroke-width`, `stroke` and `fill`.
    * Tri-state button styles are supported by the `states.hover` and
    * `states.select` objects.
    */
  var theme: js.UndefOr[SVGAttributes] = js.undefined
  /**
    * (Highmaps) The vertical alignment of the buttons. Individual alignment
    * can be adjusted by each button's `y` offset.
    */
  var verticalAlign: js.UndefOr[VerticalAlignValue] = js.undefined
  /**
    * (Highmaps) The width of the map navigation buttons.
    */
  var width: js.UndefOr[Double] = js.undefined
  /**
    * (Highmaps) The X offset of the buttons relative to its `align` setting.
    */
  var x: js.UndefOr[Double] = js.undefined
}

object MapNavigationButtonOptions {
  @scala.inline
  def apply(
    align: AlignValue = null,
    alignTo: ButtonRelativeToValue = null,
    height: Int | Double = null,
    padding: Int | Double = null,
    style: CSSObject = null,
    theme: SVGAttributes = null,
    verticalAlign: VerticalAlignValue = null,
    width: Int | Double = null,
    x: Int | Double = null
  ): MapNavigationButtonOptions = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (alignTo != null) __obj.updateDynamic("alignTo")(alignTo)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapNavigationButtonOptions]
  }
}

