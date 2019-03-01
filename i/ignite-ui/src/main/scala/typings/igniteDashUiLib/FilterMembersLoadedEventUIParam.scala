package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterMembersLoadedEventUIParam extends js.Object {
  /**
  	 * A collection with the newly loaded filter members.
  	 */
  var filterMembers: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets the parent node or the igTree instance in the initial load.
  	 */
  var parent: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * A collection with the root filter members .
  	 */
  var rootFilterMembers: js.UndefOr[js.Array[_]] = js.undefined
}

object FilterMembersLoadedEventUIParam {
  @scala.inline
  def apply(
    filterMembers: js.Array[_] = null,
    parent: java.lang.String = null,
    rootFilterMembers: js.Array[_] = null
  ): FilterMembersLoadedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (filterMembers != null) __obj.updateDynamic("filterMembers")(filterMembers)
    if (parent != null) __obj.updateDynamic("parent")(parent)
    if (rootFilterMembers != null) __obj.updateDynamic("rootFilterMembers")(rootFilterMembers)
    __obj.asInstanceOf[FilterMembersLoadedEventUIParam]
  }
}

