package typings
package jqueryDashKnobLib.JQueryKnobNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait JQueryKnobOptions extends js.Object {
  /**
  		 * arc size in degrees | default=360
  		 */
  var angleArc: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * starting angle in degrees | default=0
  		 */
  var angleOffset: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * background color
  		 */
  var bgColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * triggered on [esc] keydown
  		 */
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  		 * executed at each change of the value
  		 */
  var change: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
  		 * display mode "cursor", cursor size could be changed passing a
  		 * numeric value to the option, default width is used when passing
  		 * boolean value "true" | default=gauge
  		 */
  var cursor: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
  /**
  		 * default=true | false=hide input
  		 */
  var displayInput: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * default=false | true=displays the previous value with transparency
  		 */
  var displayPrevious: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * when drawing the canvas
  		 */
  var draw: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  		 * foreground color
  		 */
  var fgColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * font family
  		 */
  var font: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * font weight
  		 */
  var fontWeight: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * allows to format output (add unit %, ms...)
  		 */
  var format: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
  		 * dial height
  		 */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * input value (number) color
  		 */
  var inputColor: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * gauge stroke endings | default=butt, round=rounded line endings
  		 */
  var lineCap: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * max value | default=100
  		 */
  var max: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * min value | default=0
  		 */
  var min: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * disable input and events | default=false
  		 */
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * executed on release
  		 */
  var release: js.UndefOr[js.Function1[/* value */ scala.Double, scala.Unit]] = js.undefined
  /**
  		 * direction of progression | default=clockwise
  		 */
  var rotation: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * step size | default=1
  		 */
  var step: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * stop at min & max on keydown/mousewheel | default=true
  		 */
  var stopper: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * gauge thickness
  		 */
  var thickness: js.UndefOr[scala.Double] = js.undefined
  /**
  		 * dial width
  		 */
  var width: js.UndefOr[scala.Double] = js.undefined
}

