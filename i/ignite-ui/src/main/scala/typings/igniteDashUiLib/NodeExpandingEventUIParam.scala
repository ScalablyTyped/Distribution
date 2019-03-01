package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeExpandingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the node object about to expand.
  	 */
  var node: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the tree.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object NodeExpandingEventUIParam {
  @scala.inline
  def apply(node: js.Any = null, owner: js.Any = null): NodeExpandingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[NodeExpandingEventUIParam]
  }
}

