package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodePopulatingEventUIParam extends js.Object {
  /**
  	 * Gets a reference to the bindings object for the level at which the populating node is located.
  	 */
  var binding: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the node data.
  	 */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets a reference to the jQuery element of the node whose children are being populated.
  	 */
  var element: js.UndefOr[String] = js.undefined
  /**
  	 * Gets the data-path attribute of the node being populated.
  	 */
  var path: js.UndefOr[String] = js.undefined
}

object NodePopulatingEventUIParam {
  @scala.inline
  def apply(binding: js.Any = null, data: js.Any = null, element: String = null, path: String = null): NodePopulatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (binding != null) __obj.updateDynamic("binding")(binding)
    if (data != null) __obj.updateDynamic("data")(data)
    if (element != null) __obj.updateDynamic("element")(element)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[NodePopulatingEventUIParam]
  }
}

