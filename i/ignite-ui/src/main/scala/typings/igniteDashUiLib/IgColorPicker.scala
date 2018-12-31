package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgColorPicker
  extends /**
	 * Option for igColorPicker
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
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
  var colors: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets/Sets the standard colors. Standard colors are the ones displayed in the color picker bottom,
  	 *             visually separated from the default colors. The array should contain the color values.
  	 *
  	 */
  var standardColors: js.UndefOr[js.Array[_]] = js.undefined
}

