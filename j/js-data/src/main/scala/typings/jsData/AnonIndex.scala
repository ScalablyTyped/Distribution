package typings.jsData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIndex extends js.Object {
  var index: js.UndefOr[String] = js.undefined
}

object AnonIndex {
  @scala.inline
  def apply(index: String = null): AnonIndex = {
    val __obj = js.Dynamic.literal()
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIndex]
  }
}

