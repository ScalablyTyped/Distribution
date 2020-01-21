package typings.igniteUi

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
  var parent: js.UndefOr[String] = js.undefined
  /**
  	 * A collection with the root filter members .
  	 */
  var rootFilterMembers: js.UndefOr[js.Array[_]] = js.undefined
}

object FilterMembersLoadedEventUIParam {
  @scala.inline
  def apply(filterMembers: js.Array[_] = null, parent: String = null, rootFilterMembers: js.Array[_] = null): FilterMembersLoadedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (filterMembers != null) __obj.updateDynamic("filterMembers")(filterMembers.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (rootFilterMembers != null) __obj.updateDynamic("rootFilterMembers")(rootFilterMembers.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterMembersLoadedEventUIParam]
  }
}

