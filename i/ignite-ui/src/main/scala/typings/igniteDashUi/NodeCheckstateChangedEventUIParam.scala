package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCheckstateChangedEventUIParam extends js.Object {
  /**
  	 * Gets the collection of all checked nodes.
  	 */
  var newCheckedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets the collection of all partially checked nodes.
  	 */
  var newPartiallyCheckedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets the new state that is already applied to the checkbox.
  	 */
  var newState: js.UndefOr[String] = js.undefined
  /**
  	 * Gets a reference to the node object the checkbox of which is being interacted with.
  	 */
  var node: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the tree.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object NodeCheckstateChangedEventUIParam {
  @scala.inline
  def apply(
    newCheckedNodes: js.Array[_] = null,
    newPartiallyCheckedNodes: js.Array[_] = null,
    newState: String = null,
    node: js.Any = null,
    owner: js.Any = null
  ): NodeCheckstateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (newCheckedNodes != null) __obj.updateDynamic("newCheckedNodes")(newCheckedNodes)
    if (newPartiallyCheckedNodes != null) __obj.updateDynamic("newPartiallyCheckedNodes")(newPartiallyCheckedNodes)
    if (newState != null) __obj.updateDynamic("newState")(newState)
    if (node != null) __obj.updateDynamic("node")(node)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[NodeCheckstateChangedEventUIParam]
  }
}

