package typings
package igniteDashUiLib

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

