package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgColorPicker
  extends /**
	 * Option for igColorPicker
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * The event is fired when a color is selected.
  	 *
  	 * Function takes arguments evt and ui.
  	 * Use ui.color to get a reference to the color object.
  	 */
  var colorSelected: js.UndefOr[ColorSelectedEvent] = js.undefined
  /**
  	 * Gets/Sets the default colors. Default colors are the ones displayed in the upper table of the color picker.
  	 *             The array should contain arrays that contain the color values for every next row.
  	 *
  	 */
  var colors: js.UndefOr[String] = js.undefined
  /**
  	 * Gets/Sets the standard colors. Standard colors are the ones displayed in the color picker bottom,
  	 *             visually separated from the default colors. The array should contain the color values.
  	 *
  	 */
  var standardColors: js.UndefOr[js.Array[_]] = js.undefined
}

object IgColorPicker {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igColorPicker
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    colorSelected: (/* event */ Event, /* ui */ ColorSelectedEventUIParam) => Unit = null,
    colors: String = null,
    standardColors: js.Array[_] = null
  ): IgColorPicker = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (colorSelected != null) __obj.updateDynamic("colorSelected")(js.Any.fromFunction2(colorSelected))
    if (colors != null) __obj.updateDynamic("colors")(colors.asInstanceOf[js.Any])
    if (standardColors != null) __obj.updateDynamic("standardColors")(standardColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgColorPicker]
  }
}

