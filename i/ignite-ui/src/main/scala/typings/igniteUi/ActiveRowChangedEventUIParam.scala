package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveRowChangedEventUIParam extends js.Object {
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
  /**
    * Gets a reference to the row object.
    */
  var row: js.UndefOr[js.Any] = js.undefined
}

object ActiveRowChangedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null, row: js.Any = null): ActiveRowChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveRowChangedEventUIParam]
  }
}

