package typings.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridResizingColumnSetting
  extends /**
	 * Option for IgGridResizingColumnSetting
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Enables disables resizing for the column.
  	 *
  	 */
  var allowResizing: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Column index. Can be used in place of column key. the preferred way of populating a column setting is to always use the column keys as identifiers.
  	 *
  	 */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Column key. this is a required property in every column setting if columnIndex is not set.
  	 *
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Maximum column width in pixels or percents.
  	 *
  	 */
  var maximumWidth: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Minimum column width in pixels or percents.
  	 *
  	 */
  var minimumWidth: js.UndefOr[String | Double] = js.undefined
}

object IgGridResizingColumnSetting {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridResizingColumnSetting
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowResizing: js.UndefOr[Boolean] = js.undefined,
    columnIndex: Int | Double = null,
    columnKey: String = null,
    maximumWidth: String | Double = null,
    minimumWidth: String | Double = null
  ): IgGridResizingColumnSetting = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (maximumWidth != null) __obj.updateDynamic("maximumWidth")(maximumWidth.asInstanceOf[js.Any])
    if (minimumWidth != null) __obj.updateDynamic("minimumWidth")(minimumWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgGridResizingColumnSetting]
  }
}

