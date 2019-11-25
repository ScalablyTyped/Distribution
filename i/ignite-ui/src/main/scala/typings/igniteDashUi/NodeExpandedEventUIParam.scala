package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeExpandedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the expanded node object.
  	 */
  var node: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the tree.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object NodeExpandedEventUIParam {
  @scala.inline
  def apply(node: js.Any = null, owner: js.Any = null): NodeExpandedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (node != null) __obj.updateDynamic("node")(node.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeExpandedEventUIParam]
  }
}

