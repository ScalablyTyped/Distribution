package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IgGridColumnFixingColumnSetting
  extends /**
	 * Option for IgGridColumnFixingColumnSetting
	 */
/* optionName */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
  	 * Specifies whether the column can be fixed or not. If allow fixing is false, then the fixing pin will not be rendered for the column.
  	 *
  	 */
  var allowFixing: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Identifies the grid column by index. Either key or index must be set in every column setting.
  	 *
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Identifies the grid column by key. Either key or index must be set in every column setting.
  	 *
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Specifies whether the column is initially fixed or not. Check [this topic](http://www.igniteui.com/help/iggrid-columnfixing-configuring#initial-state) out for more information.
  	 *
  	 */
  var isFixed: js.UndefOr[scala.Boolean] = js.undefined
}

