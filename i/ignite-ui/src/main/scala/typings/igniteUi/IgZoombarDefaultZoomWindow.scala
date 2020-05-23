package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgZoombarDefaultZoomWindow
  extends /**
  * Option for JSONPDataSourceSettings
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
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    left: js.UndefOr[Double] = js.undefined,
    width: String = null
  ): IgZoombarDefaultZoomWindow = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgZoombarDefaultZoomWindow]
  }
}

