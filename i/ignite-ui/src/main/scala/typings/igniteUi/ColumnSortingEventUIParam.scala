package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnSortingEventUIParam extends js.Object {
  /**
  	 * Gets the column key.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the sorting direction.
  	 */
  var direction: js.UndefOr[String] = js.undefined
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
    columnKey: String = null,
    direction: String = null,
    newExpressions: js.Array[_] = null,
    owner: js.Any = null
  ): ColumnSortingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (newExpressions != null) __obj.updateDynamic("newExpressions")(newExpressions.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnSortingEventUIParam]
  }
}

