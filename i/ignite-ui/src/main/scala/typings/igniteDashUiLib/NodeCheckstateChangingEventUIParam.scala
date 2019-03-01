package typings
package igniteDashUiLib

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
  var currentState: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the new state that is going to be applied to the checkbox.
  	 */
  var newState: js.UndefOr[java.lang.String] = js.undefined
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
    currentState: java.lang.String = null,
    newState: java.lang.String = null,
    node: js.Any = null,
    owner: js.Any = null
  ): NodeCheckstateChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (currentCheckedNodes != null) __obj.updateDynamic("currentCheckedNodes")(currentCheckedNodes)
    if (currentState != null) __obj.updateDynamic("currentState")(currentState)
    if (newState != null) __obj.updateDynamic("newState")(newState)
    if (node != null) __obj.updateDynamic("node")(node)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[NodeCheckstateChangingEventUIParam]
  }
}

