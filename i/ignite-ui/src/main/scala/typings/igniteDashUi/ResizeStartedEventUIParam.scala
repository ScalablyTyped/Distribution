package typings.igniteDashUi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeStartedEventUIParam extends js.Object {
  /**
  	 * Used to get a reference to the splitter instance.
  	 */
  var owner: js.UndefOr[js.Any] = js.undefined
}

object ResizeStartedEventUIParam {
  @scala.inline
  def apply(owner: js.Any = null): ResizeStartedEventUIParam = {
    val __obj = js.Dynamic.literal()
    if (owner != null) __obj.updateDynamic("owner")(owner)
    __obj.asInstanceOf[ResizeStartedEventUIParam]
  }
}

