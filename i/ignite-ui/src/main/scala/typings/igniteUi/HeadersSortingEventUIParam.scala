package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadersSortingEventUIParam extends js.Object {
  /**
  	 * Gets an array of the level names and sort directions that will be used.
  	 */
  var levelSortDirections: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets a reference to the pivot grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object HeadersSortingEventUIParam {
  @scala.inline
  def apply(levelSortDirections: js.Array[_] = null, owner: js.Any = null): HeadersSortingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (levelSortDirections != null) __obj.updateDynamic("levelSortDirections")(levelSortDirections.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersSortingEventUIParam]
  }
}

