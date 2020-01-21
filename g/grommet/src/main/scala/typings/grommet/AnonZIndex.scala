package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonZIndex extends js.Object {
  var zIndex: js.UndefOr[String] = js.undefined
}

object AnonZIndex {
  @scala.inline
  def apply(zIndex: String = null): AnonZIndex = {
    val __obj = js.Dynamic.literal()
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonZIndex]
  }
}

