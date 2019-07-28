package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidatingEventUIParam extends js.Object {
  /**
  	 * Populated with options for the specific field in the collection or null.
  	 */
  var fieldOptions: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets reference to the igValidator widget.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets the current value in target.
  	 */
  var value: js.UndefOr[js.Any] = js.undefined
}

object ValidatingEventUIParam {
  @scala.inline
  def apply(fieldOptions: js.Any = null, owner: js.Any = null, value: js.Any = null): ValidatingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (fieldOptions != null) __obj.updateDynamic("fieldOptions")(fieldOptions)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ValidatingEventUIParam]
  }
}

