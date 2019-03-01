package typings
package igniteDashUiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalDialogUngroupingColumnEventUIParam extends js.Object {
  /**
  	 * The key of the column to be grouped.
  	 */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Get a reference to the current layout object, if any.
  	 */
  var layout: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * Gets access the GroupBy widget object.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ModalDialogUngroupingColumnEventUIParam {
  @scala.inline
  def apply(key: java.lang.String = null, layout: java.lang.String = null, owner: js.Any = null): ModalDialogUngroupingColumnEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (key != null) __obj.updateDynamic("key")(key)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ModalDialogUngroupingColumnEventUIParam]
  }
}

