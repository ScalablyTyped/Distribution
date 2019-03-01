package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TupleMemberExpandedEventUIParam extends js.Object {
  /**
  	 * Gets the name of axis, which holds the member and the tuple.
  	 */
  var axisName: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets a reference to the data source.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the index of the member in the tuple.
  	 */
  var memberIndex: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * Gets a reference to the pivot grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the index of the tuple in the axis.
  	 */
  var tupleIndex: js.UndefOr[scala.Double] = js.undefined
}

object TupleMemberExpandedEventUIParam {
  @scala.inline
  def apply(
    axisName: java.lang.String = null,
    dataSource: js.Any = null,
    memberIndex: scala.Int | scala.Double = null,
    owner: js.Any = null,
    tupleIndex: scala.Int | scala.Double = null
  ): TupleMemberExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (axisName != null) __obj.updateDynamic("axisName")(axisName)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (memberIndex != null) __obj.updateDynamic("memberIndex")(memberIndex.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (tupleIndex != null) __obj.updateDynamic("tupleIndex")(tupleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleMemberExpandedEventUIParam]
  }
}

