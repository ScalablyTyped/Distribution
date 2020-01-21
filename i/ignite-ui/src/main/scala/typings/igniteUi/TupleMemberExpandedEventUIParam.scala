package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TupleMemberExpandedEventUIParam extends js.Object {
  /**
  	 * Gets the name of axis, which holds the member and the tuple.
  	 */
  var axisName: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the data source.
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the index of the member in the tuple.
  	 */
  var memberIndex: js.UndefOr[Double] = js.undefined
  /**
  	 * Gets a reference to the pivot grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the index of the tuple in the axis.
  	 */
  var tupleIndex: js.UndefOr[Double] = js.undefined
}

object TupleMemberExpandedEventUIParam {
  @scala.inline
  def apply(
    axisName: String = null,
    dataSource: js.Any = null,
    memberIndex: Int | Double = null,
    owner: js.Any = null,
    tupleIndex: Int | Double = null
  ): TupleMemberExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (axisName != null) __obj.updateDynamic("axisName")(axisName.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (memberIndex != null) __obj.updateDynamic("memberIndex")(memberIndex.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (tupleIndex != null) __obj.updateDynamic("tupleIndex")(tupleIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[TupleMemberExpandedEventUIParam]
  }
}

