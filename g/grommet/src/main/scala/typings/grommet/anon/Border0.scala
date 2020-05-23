package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border0 extends js.Object {
  var border: js.UndefOr[`0`] = js.undefined
}

object Border0 {
  @scala.inline
  def apply(border: `0` = null): Border0 = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border0]
  }
}

