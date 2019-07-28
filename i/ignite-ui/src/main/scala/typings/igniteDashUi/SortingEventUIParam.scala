package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the pivot grid.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets an array of the tuple indices and sort directions that will be used.
  	 */
  var sortDirections: js.UndefOr[js.Array[_]] = js.undefined
}

object SortingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, sortDirections: js.Array[_] = null): SortingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections)
    __obj.asInstanceOf[SortingEventUIParam]
  }
}

