package typings.leafletEditable.mod.Map

import typings.leafletEditable.mod.EditOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptions extends js.Object {
  /**
    * Options to pass to L.Editable when instanciating.
    */
  var editOptions: js.UndefOr[EditOptions] = js.undefined
  /**
    * Whether to create a L.Editable instance at map init or not.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
}

object MapOptions {
  @scala.inline
  def apply(editOptions: EditOptions = null, editable: js.UndefOr[Boolean] = js.undefined): MapOptions = {
    val __obj = js.Dynamic.literal()
    if (editOptions != null) __obj.updateDynamic("editOptions")(editOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
}

