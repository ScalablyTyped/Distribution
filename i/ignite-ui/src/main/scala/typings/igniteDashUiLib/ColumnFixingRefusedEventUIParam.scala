package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ColumnFixingRefusedEventUIParam extends js.Object {
  /**
  	 * Gets the columnKey or the columnIndex.
  	 */
  var columnIdentifier: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the error message describing the reason fixing has failed.
  	 */
  var errorMessage: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets whether header cell has children(use this argument ONLY when multi-column-headers are enabled).
  	 */
  var isGroupHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Gets a reference to the widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

