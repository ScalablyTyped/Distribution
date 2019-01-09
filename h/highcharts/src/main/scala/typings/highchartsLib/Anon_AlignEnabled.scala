package typings
package highchartsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlignEnabled extends js.Object {
  /**
    * Defines the horizontal alignment of the stack total label. Can be one of "left", "center" or "right".
    * @default calculated at runtime and depends on orientation and whether the stack is positive or negative.
    * @since 2.1.5
    */
  var align: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Enable or disable the stack total labels.
    * @default false
    * @since 2.1.5
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A format string for the data label. Available variables are the same as for formatter.
    * @default {total}
    * @since 3.0.2
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback JavaScript function to format the label. The value is given by this.total.
    * @default function() { return this.total; }
    * @since 2.1.5
    */
  var formatter: js.UndefOr[js.Function] = js.undefined
  /**
    * Rotation of the labels in degrees.
    * @default 0
    * @since 2.1.5
    */
  var rotation: js.UndefOr[scala.Double] = js.undefined
  /**
    * CSS styles for the label.
    * @default { "color": "#000000", "fontSize": "11px", "fontWeight": "bold", "textShadow": "0 0 6px contrast, 00 3px contrast" }
    * @since 2.1.5
    */
  var style: js.UndefOr[highchartsLib.highchartsMod.HighchartsNs.CSSObject] = js.undefined
  /**
    * The text alignment for the label.
    * While align determines where the texts anchor point is placed with regards to the stack, textAlign determines how the text is aligned against its anchor point.
    * Possible values are "left", "center" and "right".
    * @default calculated at runtime and depends on orientation and whether the stack is positive or negative.
    * @since 2.1.5
    */
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Whether to use HTML to render the labels.
    * @default false
    * @since 3.0
    */
  var useHTML: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Defines the vertical alignment of the stack total label. Can be one of "top", "middle" or "bottom".
    * @default calculated at runtime and depends on orientation and whether the stack is positive or negative.
    * @since 2.1.5
    */
  var verticalAlign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The x position offset of the label relative to the left of the stacked bar.
    * @default calculated at runtime and depends on orientation and whether the stack is positive or negative.
    * @since 2.1.5
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * The y position offset of the label relative to the tick position on the axis.
    * @default calculated at runtime and depends on orientation and whether the stack is positive or negative.
    * @since 2.1.5
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

