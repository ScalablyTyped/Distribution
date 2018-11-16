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

