package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollapsingEventUIParam extends js.Object {
  /**
  	 * Used to get a reference the igSplitButton.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object CollapsingEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): CollapsingEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollapsingEventUIParam]
  }
}

