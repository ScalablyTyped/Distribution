package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedItemChangingEventUIParam extends js.Object {
  /**
  	 * Used to stop the selected item from changing.
  	 */
  var cancel: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference to the newly selected data item.
  	 */
  var newItem: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to get a reference to the current selected data item.
  	 */
  var oldItem: js.UndefOr[js.Any] = js.undefined
}

object SelectedItemChangingEventUIParam {
  @scala.inline
  def apply(cancel: js.Any = null, newItem: js.Any = null, oldItem: js.Any = null): SelectedItemChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (newItem != null) __obj.updateDynamic("newItem")(newItem)
    if (oldItem != null) __obj.updateDynamic("oldItem")(oldItem)
    __obj.asInstanceOf[SelectedItemChangingEventUIParam]
  }
}

