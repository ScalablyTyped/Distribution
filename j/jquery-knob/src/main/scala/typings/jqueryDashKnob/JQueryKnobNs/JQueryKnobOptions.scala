package typings.jqueryDashKnob.JQueryKnobNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryKnobOptions extends js.Object {
  /**
  		 * arc size in degrees | default=360
  		 */
  var angleArc: js.UndefOr[Double] = js.undefined
  /**
  		 * starting angle in degrees | default=0
  		 */
  var angleOffset: js.UndefOr[Double] = js.undefined
  /**
  		 * background color
  		 */
  var bgColor: js.UndefOr[String] = js.undefined
  /**
  		 * triggered on [esc] keydown
  		 */
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * executed at each change of the value
  		 */
  var change: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
  		 * display mode "cursor", cursor size could be changed passing a
  		 * numeric value to the option, default width is used when passing
  		 * boolean value "true" | default=gauge
  		 */
  var cursor: js.UndefOr[String | Boolean] = js.undefined
  /**
  		 * default=true | false=hide input
  		 */
  var displayInput: js.UndefOr[Boolean] = js.undefined
  /**
  		 * default=false | true=displays the previous value with transparency
  		 */
  var displayPrevious: js.UndefOr[Boolean] = js.undefined
  /**
  		 * when drawing the canvas
  		 */
  var draw: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * foreground color
  		 */
  var fgColor: js.UndefOr[String] = js.undefined
  /**
  		 * font family
  		 */
  var font: js.UndefOr[String] = js.undefined
  /**
  		 * font weight
  		 */
  var fontWeight: js.UndefOr[String] = js.undefined
  /**
  		 * allows to format output (add unit %, ms...)
  		 */
  var format: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
  		 * dial height
  		 */
  var height: js.UndefOr[Double] = js.undefined
  /**
  		 * input value (number) color
  		 */
  var inputColor: js.UndefOr[String] = js.undefined
  /**
  		 * gauge stroke endings | default=butt, round=rounded line endings
  		 */
  var lineCap: js.UndefOr[String] = js.undefined
  /**
  		 * max value | default=100
  		 */
  var max: js.UndefOr[Double] = js.undefined
  /**
  		 * min value | default=0
  		 */
  var min: js.UndefOr[Double] = js.undefined
  /**
  		 * disable input and events | default=false
  		 */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /**
  		 * executed on release
  		 */
  var release: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.undefined
  /**
  		 * direction of progression | default=clockwise
  		 */
  var rotation: js.UndefOr[String] = js.undefined
  /**
  		 * step size | default=1
  		 */
  var step: js.UndefOr[Double] = js.undefined
  /**
  		 * stop at min & max on keydown/mousewheel | default=true
  		 */
  var stopper: js.UndefOr[Boolean] = js.undefined
  /**
  		 * gauge thickness
  		 */
  var thickness: js.UndefOr[Double] = js.undefined
  /**
  		 * dial width
  		 */
  var width: js.UndefOr[Double] = js.undefined
}

object JQueryKnobOptions {
  @scala.inline
  def apply(
    angleArc: Int | Double = null,
    angleOffset: Int | Double = null,
    bgColor: String = null,
    cancel: () => Unit = null,
    change: /* value */ Double => Unit = null,
    cursor: String | Boolean = null,
    displayInput: js.UndefOr[Boolean] = js.undefined,
    displayPrevious: js.UndefOr[Boolean] = js.undefined,
    draw: () => Unit = null,
    fgColor: String = null,
    font: String = null,
    fontWeight: String = null,
    format: /* value */ Double => Unit = null,
    height: Int | Double = null,
    inputColor: String = null,
    lineCap: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    release: /* value */ Double => Unit = null,
    rotation: String = null,
    step: Int | Double = null,
    stopper: js.UndefOr[Boolean] = js.undefined,
    thickness: Int | Double = null,
    width: Int | Double = null
  ): JQueryKnobOptions = {
    val __obj = js.Dynamic.literal()
    if (angleArc != null) __obj.updateDynamic("angleArc")(angleArc.asInstanceOf[js.Any])
    if (angleOffset != null) __obj.updateDynamic("angleOffset")(angleOffset.asInstanceOf[js.Any])
    if (bgColor != null) __obj.updateDynamic("bgColor")(bgColor)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(displayInput)) __obj.updateDynamic("displayInput")(displayInput)
    if (!js.isUndefined(displayPrevious)) __obj.updateDynamic("displayPrevious")(displayPrevious)
    if (draw != null) __obj.updateDynamic("draw")(js.Any.fromFunction0(draw))
    if (fgColor != null) __obj.updateDynamic("fgColor")(fgColor)
    if (font != null) __obj.updateDynamic("font")(font)
    if (fontWeight != null) __obj.updateDynamic("fontWeight")(fontWeight)
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction1(format))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (inputColor != null) __obj.updateDynamic("inputColor")(inputColor)
    if (lineCap != null) __obj.updateDynamic("lineCap")(lineCap)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (release != null) __obj.updateDynamic("release")(js.Any.fromFunction1(release))
    if (rotation != null) __obj.updateDynamic("rotation")(rotation)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (!js.isUndefined(stopper)) __obj.updateDynamic("stopper")(stopper)
    if (thickness != null) __obj.updateDynamic("thickness")(thickness.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryKnobOptions]
  }
}

