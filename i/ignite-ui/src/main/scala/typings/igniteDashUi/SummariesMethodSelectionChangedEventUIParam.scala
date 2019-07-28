package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummariesMethodSelectionChangedEventUIParam extends js.Object {
  /**
  	 * Gets the column key of the column where it is changed selection of summary method.
  	 */
  var columnKey: js.UndefOr[String] = js.undefined
  /**
  	 * Gets whether method is selected or not.
  	 */
  var isSelected: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets the summary method name.
  	 */
  var methodName: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the igGridSummaries widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object SummariesMethodSelectionChangedEventUIParam {
  @scala.inline
  def apply(
    columnKey: String = null,
    isSelected: js.UndefOr[Boolean] = js.undefined,
    methodName: String = null,
    owner: js.Any = null
  ): SummariesMethodSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKey != null) __obj.updateDynamic("columnKey")(columnKey)
    if (!js.isUndefined(isSelected)) __obj.updateDynamic("isSelected")(isSelected)
    if (methodName != null) __obj.updateDynamic("methodName")(methodName)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[SummariesMethodSelectionChangedEventUIParam]
  }
}

