package typings.igniteUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeEndedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the splitter instance.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ResizeEndedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): ResizeEndedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeEndedEventUIParam]
  }
}

