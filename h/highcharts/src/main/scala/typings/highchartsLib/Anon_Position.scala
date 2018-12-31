package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Position extends js.Object {
  /**
    * Positioning options for the button within the relativeTo box. Available properties are x, y, align and
    * verticalAlign.
    * @since 3.0.8
    */
  var position: js.UndefOr[highchartsLib.highchartsMod.HighchartsNs.Position] = js.undefined
  /**
    * What box to align the button to. Can be either 'plotBox' or 'spacingBox'.
    * @default 'plotBox'
    * @since 3.0.8
    */
  var relativeTo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A collection of attributes for the button. The object takes SVG attributes like fill, stroke, stroke-width or
    * r, the border radius. The theme also supports style, a collection of CSS properties for the text. Equivalent
    * attributes for the hover state are given in theme.states.hover.
    * @since 3.0.8
    */
  var theme: js.UndefOr[highchartsLib.highchartsMod.HighchartsNs.ButtonStatesTheme] = js.undefined
}

