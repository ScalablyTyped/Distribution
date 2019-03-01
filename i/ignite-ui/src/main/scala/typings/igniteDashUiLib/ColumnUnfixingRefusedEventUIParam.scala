package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnUnfixingRefusedEventUIParam extends js.Object {
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

object ColumnUnfixingRefusedEventUIParam {
  @scala.inline
  def apply(
    columnIdentifier: js.Any = null,
    errorMessage: java.lang.String = null,
    isGroupHeader: js.UndefOr[scala.Boolean] = js.undefined,
    owner: js.Any = null
  ): ColumnUnfixingRefusedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIdentifier != null) __obj.updateDynamic("columnIdentifier")(columnIdentifier)
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage)
    if (!js.isUndefined(isGroupHeader)) __obj.updateDynamic("isGroupHeader")(isGroupHeader)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ColumnUnfixingRefusedEventUIParam]
  }
}

