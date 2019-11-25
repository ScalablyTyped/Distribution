package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgZoombarDefaultZoomWindow
  extends /**
	 * Option for IgZoombarDefaultZoomWindow
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * The left component of the zoom window in percentages.
  	 *
  	 */
  var left: js.UndefOr[Double] = js.undefined
  /**
  	 * The width of the zoom window in percentages.
  	 *
  	 */
  var width: js.UndefOr[String] = js.undefined
}

object IgZoombarDefaultZoomWindow {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgZoombarDefaultZoomWindow
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    left: Int | Double = null,
    width: String = null
  ): IgZoombarDefaultZoomWindow = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgZoombarDefaultZoomWindow]
  }
}

