package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContainer extends js.Object {
  var container: js.UndefOr[AnonAlign] = js.undefined
  var text: js.UndefOr[AnonMargin] = js.undefined
}

object AnonContainer {
  @scala.inline
  def apply(container: AnonAlign = null, text: AnonMargin = null): AnonContainer = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContainer]
  }
}

