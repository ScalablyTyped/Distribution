package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Down extends js.Object {
  var down: js.UndefOr[js.Any] = js.undefined
}

object Anon_Down {
  @scala.inline
  def apply(down: js.Any = null): Anon_Down = {
    val __obj = js.Dynamic.literal()
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Down]
  }
}

