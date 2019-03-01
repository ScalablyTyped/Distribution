package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChildrenPopulatedEventUIParam extends js.Object {
  /**
  	 * Gets the data ID of the row.
  	 */
  var id: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the hierarchical grid object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets access the row element for the row that was populated.
  	 */
  var parentrow: js.UndefOr[java.lang.String] = js.undefined
}

object ChildrenPopulatedEventUIParam {
  @scala.inline
  def apply(id: js.Any = null, owner: js.Any = null, parentrow: java.lang.String = null): ChildrenPopulatedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (parentrow != null) __obj.updateDynamic("parentrow")(parentrow)
    __obj.asInstanceOf[ChildrenPopulatedEventUIParam]
  }
}

