package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnUnfixingEventUIParam extends js.Object {
  /**
    * Gets the columnKey or the columnIndex.
    */
  var columnIdentifier: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets whether header cell has children(use this argument ONLY when multi-column-headers are enabled).
    */
  var isGroupHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets a reference to the widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnUnfixingEventUIParam {
  @scala.inline
  def apply(
    columnIdentifier: js.Any = null,
    isGroupHeader: js.UndefOr[Boolean] = js.undefined,
    owner: js.Any = null
  ): ColumnUnfixingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIdentifier != null) __obj.updateDynamic("columnIdentifier")(columnIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(isGroupHeader)) __obj.updateDynamic("isGroupHeader")(isGroupHeader.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnUnfixingEventUIParam]
  }
}

