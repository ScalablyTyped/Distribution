package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnsCollectionModifiedEventUIParam extends js.Object {
  /**
    * Gets a reference to the grid.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ColumnsCollectionModifiedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): ColumnsCollectionModifiedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnsCollectionModifiedEventUIParam]
  }
}

