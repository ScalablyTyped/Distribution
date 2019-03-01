package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSortedEventUIParam extends js.Object {
  /**
  	 * Gets the column key.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the sorting direction.
  	 */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the sorted expressions.
  	 */
  var expressions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to GridSorting.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnSortedEventUIParam {
  @scala.inline
  def apply(
    columnKey: java.lang.String = null,
    direction: java.lang.String = null,
    expressions: js.Any = null,
    owner: js.Any = null
  ): ColumnSortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (expressions != null) __obj.updateDynamic("expressions")(expressions)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ColumnSortedEventUIParam]
  }
}

