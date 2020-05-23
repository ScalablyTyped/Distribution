package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZIndex extends js.Object {
  var zIndex: js.UndefOr[String] = js.undefined
}

object ZIndex {
  @scala.inline
  def apply(zIndex: String = null): ZIndex = {
    val __obj = js.Dynamic.literal()
    if (zIndex != null) __obj.updateDynamic("zIndex")(zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZIndex]
  }
}

