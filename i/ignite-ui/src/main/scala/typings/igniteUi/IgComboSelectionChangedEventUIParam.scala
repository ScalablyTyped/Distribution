package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgComboSelectionChangedEventUIParam extends js.Object {
  /**
  	 * Used to obtain reference to array of new selected items. That can be null.
  	 */
  var items: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to array of old selected items. That can be null.
  	 */
  var oldItems: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Used to obtain reference to igCombo.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object IgComboSelectionChangedEventUIParam {
  @scala.inline
  def apply(items: js.Any = null, oldItems: js.Any = null, owner: js.Any = null): IgComboSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (oldItems != null) __obj.updateDynamic("oldItems")(oldItems.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgComboSelectionChangedEventUIParam]
  }
}

