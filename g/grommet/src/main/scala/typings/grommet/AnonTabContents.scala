package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTabContents extends js.Object {
  var tabContents: js.UndefOr[String] = js.undefined
}

object AnonTabContents {
  @scala.inline
  def apply(tabContents: String = null): AnonTabContents = {
    val __obj = js.Dynamic.literal()
    if (tabContents != null) __obj.updateDynamic("tabContents")(tabContents.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTabContents]
  }
}

