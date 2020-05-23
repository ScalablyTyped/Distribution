package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectedItemsChangedEventUIParam extends js.Object {
  /**
    * Used to get a reference to the current selected data items.
    */
  var newItems: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to get a reference to the previous selected data items.
    */
  var oldItems: js.UndefOr[js.Any] = js.undefined
}

object SelectedItemsChangedEventUIParam {
  @scala.inline
  def apply(newItems: js.Any = null, oldItems: js.Any = null): SelectedItemsChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (newItems != null) __obj.updateDynamic("newItems")(newItems.asInstanceOf[js.Any])
    if (oldItems != null) __obj.updateDynamic("oldItems")(oldItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectedItemsChangedEventUIParam]
  }
}

