package typings.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  var next: js.UndefOr[js.Any] = js.undefined
  var previous: js.UndefOr[js.Any] = js.undefined
}

object Anon_Next {
  @scala.inline
  def apply(next: js.Any = null, previous: js.Any = null): Anon_Next = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    __obj.asInstanceOf[Anon_Next]
  }
}

