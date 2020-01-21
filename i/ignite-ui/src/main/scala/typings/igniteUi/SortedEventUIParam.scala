package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortedEventUIParam extends js.Object {
  /**
  	 * Gets an array of the tuple indices and sort directions that were actually applied to the table view.
  	 */
  var appliedSortDirections: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets a reference to the pivot grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets an array of the tuple indices and sort directions that were passed to the table view.
  	 */
  var sortDirections: js.UndefOr[js.Array[_]] = js.undefined
}

object SortedEventUIParam {
  @scala.inline
  def apply(
    appliedSortDirections: js.Array[_] = null,
    owner: js.Any = null,
    sortDirections: js.Array[_] = null
  ): SortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (appliedSortDirections != null) __obj.updateDynamic("appliedSortDirections")(appliedSortDirections.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortedEventUIParam]
  }
}

