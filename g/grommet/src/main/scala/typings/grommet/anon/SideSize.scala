package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SideSize extends js.Object {
  var side: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
}

object SideSize {
  @scala.inline
  def apply(side: String = null, size: String = null): SideSize = {
    val __obj = js.Dynamic.literal()
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[SideSize]
  }
}

