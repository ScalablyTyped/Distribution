package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBorderAnon0 extends js.Object {
  var border: js.UndefOr[Anon0] = js.undefined
}

object AnonBorderAnon0 {
  @scala.inline
  def apply(border: Anon0 = null): AnonBorderAnon0 = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBorderAnon0]
  }
}

