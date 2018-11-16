package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgGridResizingColumnSetting
  extends /**
	 * Option for IgGridResizingColumnSetting
	 */
/* optionName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Enables disables resizing for the column.
  	 *
  	 */
  var allowResizing: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Column index. Can be used in place of column key. the preferred way of populating a column setting is to always use the column keys as identifiers.
  	 *
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Column key. this is a required property in every column setting if columnIndex is not set.
  	 *
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Maximum column width in pixels or percents.
  	 *
  	 */
  var maximumWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
  	 * Minimum column width in pixels or percents.
  	 *
  	 */
  var minimumWidth: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

