package typings.igniteDashUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgGridHidingColumnSetting
  extends /**
	 * Option for IgGridHidingColumnSetting
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Allows the column to be hidden.
  	 *
  	 */
  var allowHiding: js.UndefOr[Boolean] = js.undefined
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
  	 * Sets the initial visibility of the column.
  	 *
  	 */
  var hidden: js.UndefOr[Boolean] = js.undefined
}

object IgGridHidingColumnSetting {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgGridHidingColumnSetting
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    allowHiding: js.UndefOr[Boolean] = js.undefined,
    columnIndex: Int | Double = null,
    columnKey: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined
  ): IgGridHidingColumnSetting = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(allowHiding)) __obj.updateDynamic("allowHiding")(allowHiding)
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    __obj.asInstanceOf[IgGridHidingColumnSetting]
  }
}

