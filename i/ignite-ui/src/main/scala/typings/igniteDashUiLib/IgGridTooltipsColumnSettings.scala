package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridTooltipsColumnSettings
  extends /**
	 * Option for IgGridTooltipsColumnSettings
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Enables / disables tooltips on the specified column. By default tooltips are displayed for each column. Note: This option is mandatory.
  	 *
  	 */
  var allowTooltips: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Either key or index must be set in every column setting.
  	 *
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Either key or index must be set in every column setting.
  	 *
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies the maximum width (in pixels) of the tooltip when shown for the specified column. If unset the width of the column will be used instead.
  	 *
  	 */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
}

object IgGridTooltipsColumnSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridTooltipsColumnSettings
  	 */
  /* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    allowTooltips: js.UndefOr[scala.Boolean] = js.undefined,
    columnIndex: scala.Int | scala.Double = null,
    columnKey: java.lang.String = null,
    maxWidth: scala.Int | scala.Double = null
  ): IgGridTooltipsColumnSettings = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowTooltips)) __obj.updateDynamic("allowTooltips")(allowTooltips)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridTooltipsColumnSettings]
  }
}

