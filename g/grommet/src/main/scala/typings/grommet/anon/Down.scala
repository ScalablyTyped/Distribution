package typings.grommet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Down extends js.Object {
  var down: js.UndefOr[js.Any] = js.undefined
}

object Down {
  @scala.inline
  def apply(down: js.Any = null): Down = {
    val __obj = js.Dynamic.literal()
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    __obj.asInstanceOf[Down]
  }
}

