package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeferUpdateChangedEventUIParam extends js.Object {
  /**
    * Gets the defer update value.
    */
  var deferUpdate: js.UndefOr[Boolean] = js.undefined
  /**
    * Gets a reference to the data selector.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object DeferUpdateChangedEventUIParam {
  @scala.inline
  def apply(deferUpdate: js.UndefOr[Boolean] = js.undefined, owner: js.Any = null): DeferUpdateChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deferUpdate)) __obj.updateDynamic("deferUpdate")(deferUpdate.get.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferUpdateChangedEventUIParam]
  }
}

