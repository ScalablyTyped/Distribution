package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnShowingEventUIParam extends js.Object {
  /**
  	 * Gets the shown column index.
  	 */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the shown column key.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the GridHiding widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnShowingEventUIParam {
  @scala.inline
  def apply(columnIndex: Int | Double = null, columnKey: String = null, owner: js.Any = null): ColumnShowingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ColumnShowingEventUIParam]
  }
}

