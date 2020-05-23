package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataChangedEventUIParam extends js.Object {
  /**
    * Used to obtain the new data.
    */
  var newData: js.UndefOr[js.Any] = js.undefined
  /**
    * Used to obtain reference to the barcode widget.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DataChangedEventUIParam {
  @scala.inline
  def apply(newData: js.Any = null, owner: js.Any = null): DataChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (newData != null) __obj.updateDynamic("newData")(newData.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataChangedEventUIParam]
  }
}

