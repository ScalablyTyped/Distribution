package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DataFilteringEventUIParam extends js.Object {
  /**
  	 * Gets the column index. Applicable only when filtering mode is "simple".
  	 */
  var columnIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets the column key. Applicable only when filtering mode is "simple".
  	 */
  var columnKey: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the filtering expressions. Filtering expressions could be changed in this event handler and after that data binding is applied. In this way the user could control filtering more easily before applying data-binding.
  	 */
  var newExpressions: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets reference to GridFiltering.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

