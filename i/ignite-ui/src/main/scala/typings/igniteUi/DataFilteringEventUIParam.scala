package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataFilteringEventUIParam extends js.Object {
  /**
  	 * Gets the column index. Applicable only when filtering mode is "simple".
  	 */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets the column key. Applicable only when filtering mode is "simple".
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the filtering expressions. Filtering expressions could be changed in this event handler and after that data binding is applied. In this way the user could control filtering more easily before applying data-binding.
  	 */
  var newExpressions: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DataFilteringEventUIParam {
  @scala.inline
  def apply(
    columnIndex: Int | Double = null,
    columnKey: String = null,
    newExpressions: js.Array[_] = null,
    owner: js.Any = null
  ): DataFilteringEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey.asInstanceOf[js.Any])
    if (newExpressions != null) __obj.updateDynamic("newExpressions")(newExpressions.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataFilteringEventUIParam]
  }
}

