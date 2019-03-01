package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgTreeSelectionChangedEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the newly added nodes to the selection.
  	 */
  var newNodes: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Gets a reference to the tree.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to currently selected nodes.
  	 */
  var selectedNodes: js.UndefOr[js.Array[_]] = js.undefined
}

object IgTreeSelectionChangedEventUIParam {
  @scala.inline
  def apply(newNodes: js.Array[_] = null, owner: js.Any = null, selectedNodes: js.Array[_] = null): IgTreeSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (newNodes != null) __obj.updateDynamic("newNodes")(newNodes)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (selectedNodes != null) __obj.updateDynamic("selectedNodes")(selectedNodes)
    __obj.asInstanceOf[IgTreeSelectionChangedEventUIParam]
  }
}

