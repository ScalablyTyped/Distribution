package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BorderSideSize extends js.Object {
  var border: js.UndefOr[SideSize] = js.undefined
}

object BorderSideSize {
  @scala.inline
  def apply(border: SideSize = null): BorderSideSize = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[BorderSideSize]
  }
}

