package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgZoombarDefaultZoomWindow
  extends /**
	 * Option for IgZoombarDefaultZoomWindow
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * The left component of the zoom window in percentages.
  	 *
  	 */
  var left: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The width of the zoom window in percentages.
  	 *
  	 */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object IgZoombarDefaultZoomWindow {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgZoombarDefaultZoomWindow
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    left: scala.Int | scala.Double = null,
    width: java.lang.String = null
  ): IgZoombarDefaultZoomWindow = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[IgZoombarDefaultZoomWindow]
  }
}

