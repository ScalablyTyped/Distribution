package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedItemsChangingEventUIParam extends js.Object {
  /**
    * Used to stop the selected items from changing.
    */
  var cancel: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to get a reference to the newly selected data items.
    */
  var newItems: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to get a reference to the current selected data items.
    */
  var oldItems: js.UndefOr[js.Any] = js.undefined
}

object SelectedItemsChangingEventUIParam {
  @scala.inline
  def apply(cancel: js.Any = null, newItems: js.Any = null, oldItems: js.Any = null): SelectedItemsChangingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (newItems != null) __obj.updateDynamic("newItems")(newItems.asInstanceOf[js.Any])
    if (oldItems != null) __obj.updateDynamic("oldItems")(oldItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedItemsChangingEventUIParam]
  }
}

