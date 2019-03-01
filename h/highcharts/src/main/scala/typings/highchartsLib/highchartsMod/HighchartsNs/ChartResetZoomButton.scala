package typings
package highchartsLib.highchartsMod.HighchartsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartResetZoomButton extends js.Object {
  /**
    * The position of the button. This is an object that can hold the properties align, verticalAlign, x and y.
    * @since 2.2
    */
  var position: js.UndefOr[Position] = js.undefined
  /**
    * What frame the button should be placed related to. Can be either 'plot' or 'chart'.
    * @default 'plot'
    * @since 2.2
    */
  var relativeTo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A collection of attributes for the button. The object takes SVG attributes like fill, stroke, stroke-width or r,
    * the border radius. The theme also supports style, a collection of CSS properties for the text. Equivalent
    * attributes for the hover state are given in theme.states.hover.
    * @since 2.2
    */
  var theme: js.UndefOr[ButtonStatesTheme] = js.undefined
}

object ChartResetZoomButton {
  @scala.inline
  def apply(position: Position = null, relativeTo: java.lang.String = null, theme: ButtonStatesTheme = null): ChartResetZoomButton = {
    val __obj = js.Dynamic.literal()
    if (position != null) __obj.updateDynamic("position")(position)
    if (relativeTo != null) __obj.updateDynamic("relativeTo")(relativeTo)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    __obj.asInstanceOf[ChartResetZoomButton]
  }
}

