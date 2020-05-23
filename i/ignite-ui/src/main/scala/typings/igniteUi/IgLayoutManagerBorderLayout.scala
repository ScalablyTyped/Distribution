package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgLayoutManagerBorderLayout
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Option specifying the width of the left region, either in px or percentages
    *
    */
  var leftWidth: js.UndefOr[String] = js.undefined
  /**
    * Option specifying the width of the right region, either in px or percentages
    *
    */
  var rightWidth: js.UndefOr[String] = js.undefined
  /**
    * Option specifying whether the footer region in the border layout will be hidden or shown
    *
    */
  var showFooter: js.UndefOr[Boolean] = js.undefined
  /**
    * Option specifying whether the header region in the border layout will be hidden or shown
    *
    */
  var showHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Option specifying whether the left region in the border layout will be hidden or shown
    *
    */
  var showLeft: js.UndefOr[Boolean] = js.undefined
  /**
    * Option specifying whether the right region in the border layout will be hidden or shown
    *
    */
  var showRight: js.UndefOr[Boolean] = js.undefined
}

object IgLayoutManagerBorderLayout {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    leftWidth: String = null,
    rightWidth: String = null,
    showFooter: js.UndefOr[Boolean] = js.undefined,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    showLeft: js.UndefOr[Boolean] = js.undefined,
    showRight: js.UndefOr[Boolean] = js.undefined
  ): IgLayoutManagerBorderLayout = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (leftWidth != null) __obj.updateDynamic("leftWidth")(leftWidth.asInstanceOf[js.Any])
    if (rightWidth != null) __obj.updateDynamic("rightWidth")(rightWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(showFooter)) __obj.updateDynamic("showFooter")(showFooter.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLeft)) __obj.updateDynamic("showLeft")(showLeft.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRight)) __obj.updateDynamic("showRight")(showRight.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgLayoutManagerBorderLayout]
  }
}

