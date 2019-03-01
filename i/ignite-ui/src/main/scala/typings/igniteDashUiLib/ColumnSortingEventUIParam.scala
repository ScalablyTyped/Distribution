package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSortingEventUIParam extends js.Object {
  /**
  	 * Gets the column key.
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the sorting direction.
  	 */
  var direction: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets sorting expressions.
  	 */
  var newExpressions: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets a reference to GridSorting.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnSortingEventUIParam {
  @scala.inline
  def apply(
    columnKey: java.lang.String = null,
    direction: java.lang.String = null,
    newExpressions: js.Array[_] = null,
    owner: js.Any = null
  ): ColumnSortingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    if (newExpressions != null) __obj.updateDynamic("newExpressions")(newExpressions)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ColumnSortingEventUIParam]
  }
}

