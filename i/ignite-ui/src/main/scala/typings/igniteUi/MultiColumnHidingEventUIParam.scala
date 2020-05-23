package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiColumnHidingEventUIParam extends js.Object {
  /**
    * Gets the array of the hidden column keys. Only when you click on Reset button in column chooser there is an array of column keys.
    */
  var columnKeys: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Gets a reference to the GridHiding widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object MultiColumnHidingEventUIParam {
  @scala.inline
  def apply(columnKeys: js.Array[_] = null, owner: js.Any = null): MultiColumnHidingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (columnKeys != null) __obj.updateDynamic("columnKeys")(columnKeys.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiColumnHidingEventUIParam]
  }
}

