package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLayoutManagerBorderLayout
  extends /**
	 * Option for IgLayoutManagerBorderLayout
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Option specifying the width of the left region, either in px or percentages
  	 *
  	 */
  var leftWidth: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Option specifying the width of the right region, either in px or percentages
  	 *
  	 */
  var rightWidth: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Option specifying whether the footer region in the border layout will be hidden or shown
  	 *
  	 */
  var showFooter: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Option specifying whether the header region in the border layout will be hidden or shown
  	 *
  	 */
  var showHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Option specifying whether the left region in the border layout will be hidden or shown
  	 *
  	 */
  var showLeft: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Option specifying whether the right region in the border layout will be hidden or shown
  	 *
  	 */
  var showRight: js.UndefOr[scala.Boolean] = js.undefined
}

object IgLayoutManagerBorderLayout {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgLayoutManagerBorderLayout
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    leftWidth: java.lang.String = null,
    rightWidth: java.lang.String = null,
    showFooter: js.UndefOr[scala.Boolean] = js.undefined,
    showHeader: js.UndefOr[scala.Boolean] = js.undefined,
    showLeft: js.UndefOr[scala.Boolean] = js.undefined,
    showRight: js.UndefOr[scala.Boolean] = js.undefined
  ): IgLayoutManagerBorderLayout = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (leftWidth != null) __obj.updateDynamic("leftWidth")(leftWidth)
    if (rightWidth != null) __obj.updateDynamic("rightWidth")(rightWidth)
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter)
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader)
    if (!js.isUndefined(showLeft)) __obj.updateDynamic("showLeft")(showLeft)
    if (!js.isUndefined(showRight)) __obj.updateDynamic("showRight")(showRight)
    __obj.asInstanceOf[IgLayoutManagerBorderLayout]
  }
}

