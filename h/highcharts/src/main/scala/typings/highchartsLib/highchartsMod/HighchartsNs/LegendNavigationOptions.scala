package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendNavigationOptions extends js.Object {
  /**
    * The color for the active up or down arrow in the legend page navigation.
    * @default '#3E576F'
    * @since 2.2.4
    */
  var activeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * How to animate the pages when navigating up or down. A value of true applies the default navigation given in the
    * chart.animation option. Additional options can be given as an object containing values for easing and duration.
    * @default true
    * @since 2.2.4
    */
  var animation: js.UndefOr[scala.Boolean | Animation] = js.undefined
  /**
    * The pixel size of the up and down arrows in the legend paging navigation.
    * @default 12
    * @since 2.2.4
    */
  var arrowSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * The color of the inactive up or down arrow in the legend page navigation.
    * @default '#CCC'
    */
  var inactiveColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Text styles for the legend page navigation.
    * @since 2.2.4
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}

object LegendNavigationOptions {
  @scala.inline
  def apply(
    activeColor: java.lang.String = null,
    animation: scala.Boolean | Animation = null,
    arrowSize: scala.Int | scala.Double = null,
    inactiveColor: java.lang.String = null,
    style: CSSObject = null
  ): LegendNavigationOptions = {
    val __obj = js.Dynamic.literal()
    if (activeColor != null) __obj.updateDynamic("activeColor")(activeColor)
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (arrowSize != null) __obj.updateDynamic("arrowSize")(arrowSize.asInstanceOf[js.Any])
    if (inactiveColor != null) __obj.updateDynamic("inactiveColor")(inactiveColor)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[LegendNavigationOptions]
  }
}

