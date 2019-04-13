package typings
package highchartsLib.highchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for displaying a message like 'No data to display'. This feature requires the file no-data-to-display.js to
  * be loaded in the page. The actual text to display is set in the lang.noData option.
  */
trait NoDataOptions extends js.Object {
  /**
    * An object of additional SVG attributes for the no-data label.
    * @since 3.0.8
    */
  var attr: js.UndefOr[js.Object] = js.undefined
  /**
    * The position of the no-data label, relative to the plot area.
    * @default { 'x': 0, 'y': 0, 'align': 'center', 'verticalAlign': 'middle' }
    * @since 3.0.8
    */
  var position: js.UndefOr[Position] = js.undefined
  /**
    * CSS styles for the no-data label.
    * @default { 'fontSize': '12px', 'fontWeight': 'bold', 'color': '#60606a' }
    */
  var style: js.UndefOr[CSSObject] = js.undefined
}

object NoDataOptions {
  @scala.inline
  def apply(attr: js.Object = null, position: Position = null, style: CSSObject = null): NoDataOptions = {
    val __obj = js.Dynamic.literal()
    if (attr != null) __obj.updateDynamic("attr")(attr)
    if (position != null) __obj.updateDynamic("position")(position)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[NoDataOptions]
  }
}

