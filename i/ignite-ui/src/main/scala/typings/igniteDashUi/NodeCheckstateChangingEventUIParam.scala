package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeCheckstateChangingEventUIParam extends js.Object {
  /**
  	 * Gets the collection of all checked nodes before the new state is applied.
  	 */
  var currentCheckedNodes: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets the current state of the checkbox.
  	 */
  var currentState: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the new state that is going to be applied to the checkbox.
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

object NodeCheckstateChangingEventUIParam {
  @scala.inline
  def apply(
    currentCheckedNodes: js.Array[_] = null,
    currentState: String = null,
    newState: String = null,
    node: js.Any = null,
    owner: js.Any = null
  ): NodeCheckstateChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentCheckedNodes != null) __obj.updateDynamic("currentCheckedNodes")(currentCheckedNodes.asInstanceOf[js.Any])
    if (currentState != null) __obj.updateDynamic("currentState")(currentState.asInstanceOf[js.Any])
    if (newState != null) __obj.updateDynamic("newState")(newState.asInstanceOf[js.Any])
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeCheckstateChangingEventUIParam]
  }
}

