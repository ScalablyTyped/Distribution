package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliceClickedEventUIParam extends js.Object {
  /**
    * Used to obtain index of clicked slice.
    */
  var index: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to obtain reference to clicked slice item.
    */
  var item: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to obtain reference to igFunnelChart.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to check if slice became selected.
    */
  var selected: js.UndefOr[js.Any] = js.undefined
}

object SliceClickedEventUIParam {
  @scala.inline
  def apply(index: js.Any = null, item: js.Any = null, owner: js.Any = null, selected: js.Any = null): SliceClickedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliceClickedEventUIParam]
  }
}

