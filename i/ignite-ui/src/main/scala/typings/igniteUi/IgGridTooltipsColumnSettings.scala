package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridTooltipsColumnSettings
  extends /**
  * Option for JSONPDataSourceSettings
  */
/* optionName */ StringDictionary[js.Any] {
  /**
    * Enables / disables tooltips on the specified column. By default tooltips are displayed for each column. Note: This option is mandatory.
    *
    */
  var allowTooltips: js.UndefOr[Boolean] = js.undefined
  /**
    * Either key or index must be set in every column setting.
    *
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
    * Either key or index must be set in every column setting.
    *
    */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
    * Specifies the maximum width (in pixels) of the tooltip when shown for the specified column. If unset the width of the column will be used instead.
    *
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
}

object IgGridTooltipsColumnSettings {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    allowTooltips: js.UndefOr[Boolean] = js.undefined,
    columnIndex: js.UndefOr[Double] = js.undefined,
    columnKey: String = null,
    maxWidth: js.UndefOr[Double] = js.undefined
  ): IgGridTooltipsColumnSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowTooltips)) __obj.updateDynamic("allowTooltips")(allowTooltips.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnIndex)) __obj.updateDynamic("columnIndex")(columnIndex.get.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridTooltipsColumnSettings]
  }
}

