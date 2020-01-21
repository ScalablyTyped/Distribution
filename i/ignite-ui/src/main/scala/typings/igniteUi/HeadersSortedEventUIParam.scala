package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersSortedEventUIParam extends js.Object {
  /**
  	 * Gets an array of the level names and sort directions that were actually applied to the table view.
  	 */
  var appliedLevelSortDirections: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets an array of the level names and sort directions that were used.
  	 */
  var levelSortDirections: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets a reference to the pivot grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object HeadersSortedEventUIParam {
  @scala.inline
  def apply(
    appliedLevelSortDirections: js.Array[_] = null,
    levelSortDirections: js.Array[_] = null,
    owner: js.Any = null
  ): HeadersSortedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (appliedLevelSortDirections != null) __obj.updateDynamic("appliedLevelSortDirections")(appliedLevelSortDirections.asInstanceOf[js.Any])
    if (levelSortDirections != null) __obj.updateDynamic("levelSortDirections")(levelSortDirections.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersSortedEventUIParam]
  }
}

