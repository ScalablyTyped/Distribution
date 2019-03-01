package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions3dFrame extends js.Object {
  /**
    * The color of the panel.
    * @default 'transparent'
    * @since 4.0
    */
  var color: js.UndefOr[java.lang.String | Gradient] = js.undefined
  /**
    * Thickness of the panel.
    * @default 1
    * @since 4.0
    */
  var size: js.UndefOr[scala.Double] = js.undefined
}

object ChartOptions3dFrame {
  @scala.inline
  def apply(color: java.lang.String | Gradient = null, size: scala.Int | scala.Double = null): ChartOptions3dFrame = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions3dFrame]
  }
}

