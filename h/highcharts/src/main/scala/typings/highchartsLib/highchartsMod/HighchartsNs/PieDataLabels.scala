package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PieDataLabels extends DataLabels {
  /**
    * The color of the line connecting the data label to the pie slice. The default color is the same as the point's
    * color. Defaults to {point.color}.
    * @since 2.1
    */
  var connectorColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The distance from the data label to the connector.
    * @default 5
    * @since 2.1
    */
  var connectorPadding: js.UndefOr[scala.Double] = js.undefined
  /**
    * The width of the line connecting the data label to the pie slice.
    * @default 1
    * @since 2.1
    */
  var connectorWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * The distance of the data label from the pie's edge. Negative numbers put the data label on top of the pie slices.
    * Connectors are only shown for data labels outside the pie.
    * @default 30
    * @since 2.1
    */
  var distance: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether to render the connector as a soft arc or a line with sharp break.
    * @default true
    * @since 2.1.7
    */
  var softConnector: js.UndefOr[scala.Boolean] = js.undefined
}

object PieDataLabels {
  @scala.inline
  def apply(
    align: java.lang.String = null,
    allowOverlap: js.UndefOr[scala.Boolean] = js.undefined,
    backgroundColor: java.lang.String | Gradient = null,
    borderColor: java.lang.String | Gradient = null,
    borderRadius: scala.Int | scala.Double = null,
    borderWidth: scala.Int | scala.Double = null,
    className: java.lang.String = null,
    color: java.lang.String | Gradient = null,
    connectorColor: java.lang.String = null,
    connectorPadding: scala.Int | scala.Double = null,
    connectorWidth: scala.Int | scala.Double = null,
    crop: js.UndefOr[scala.Boolean] = js.undefined,
    defer: js.UndefOr[scala.Boolean] = js.undefined,
    distance: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    format: java.lang.String = null,
    formatter: () => java.lang.String = null,
    inside: js.UndefOr[scala.Boolean] = js.undefined,
    overflow: java.lang.String = null,
    padding: scala.Int | scala.Double = null,
    reserveSpace: js.UndefOr[scala.Boolean] = js.undefined,
    rotation: scala.Int | scala.Double = null,
    shadow: scala.Boolean | Shadow = null,
    shape: java.lang.String = null,
    softConnector: js.UndefOr[scala.Boolean] = js.undefined,
    style: CSSObject = null,
    useHTML: js.UndefOr[scala.Boolean] = js.undefined,
    verticalAlign: java.lang.String = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null,
    zIndex: scala.Int | scala.Double = null
  ): PieDataLabels = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align)
    if (!js.isUndefined(allowOverlap)) __obj.updateDynamic("allowOverlap")(allowOverlap)
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (borderRadius != null) __obj.updateDynamic("borderRadius")(borderRadius.asInstanceOf[js.Any])
    if (borderWidth != null) __obj.updateDynamic("borderWidth")(borderWidth.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (connectorColor != null) __obj.updateDynamic("connectorColor")(connectorColor)
    if (connectorPadding != null) __obj.updateDynamic("connectorPadding")(connectorPadding.asInstanceOf[js.Any])
    if (connectorWidth != null) __obj.updateDynamic("connectorWidth")(connectorWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(crop)) __obj.updateDynamic("crop")(crop)
    if (!js.isUndefined(defer)) __obj.updateDynamic("defer")(defer)
    if (distance != null) __obj.updateDynamic("distance")(distance.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction0(formatter))
    if (!js.isUndefined(inside)) __obj.updateDynamic("inside")(inside)
    if (overflow != null) __obj.updateDynamic("overflow")(overflow)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(reserveSpace)) __obj.updateDynamic("reserveSpace")(reserveSpace)
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (shadow != null) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (!js.isUndefined(softConnector)) __obj.updateDynamic("softConnector")(softConnector)
    if (style != null) __obj.updateDynamic("style")(style)
    if (!js.isUndefined(useHTML)) __obj.updateDynamic("useHTML")(useHTML)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign)
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PieDataLabels]
  }
}

