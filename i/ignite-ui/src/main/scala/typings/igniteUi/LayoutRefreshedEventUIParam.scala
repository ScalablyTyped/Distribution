package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayoutRefreshedEventUIParam extends js.Object {
  /**
    * Used to get a reference to the splitter instance.
    */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object LayoutRefreshedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): LayoutRefreshedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutRefreshedEventUIParam]
  }
}

