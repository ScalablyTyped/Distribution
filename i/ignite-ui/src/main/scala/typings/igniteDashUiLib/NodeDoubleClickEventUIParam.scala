package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodeDoubleClickEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the bindings object for the level at which the double clicked node is located.
  	 */
  var binding: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the node data.
  	 */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the jQuery element of the double clicked node.
  	 */
  var element: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets the data-path attribute of the double clicked node.
  	 */
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object NodeDoubleClickEventUIParam {
  @scala.inline
  def apply(
    binding: js.Any = null,
    data: js.Any = null,
    element: java.lang.String = null,
    path: java.lang.String = null
  ): NodeDoubleClickEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (binding != null) __obj.updateDynamic("binding")(binding)
    if (data != null) __obj.updateDynamic("data")(data)
    if (element != null) __obj.updateDynamic("element")(element)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[NodeDoubleClickEventUIParam]
  }
}

