package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border1 extends js.Object {
  var border: js.UndefOr[`1`] = js.undefined
}

object Border1 {
  @scala.inline
  def apply(border: `1` = null): Border1 = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border1]
  }
}

