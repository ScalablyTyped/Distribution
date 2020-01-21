package typings.jqueryContextmenu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHide extends js.Object {
  var hide: js.UndefOr[js.Function1[/* options */ js.Any, Boolean]] = js.undefined
  var show: js.UndefOr[js.Function1[/* options */ js.Any, Boolean]] = js.undefined
}

object AnonHide {
  @scala.inline
  def apply(hide: /* options */ js.Any => Boolean = null, show: /* options */ js.Any => Boolean = null): AnonHide = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(js.Any.fromFunction1(hide))
    if (show != null) __obj.updateDynamic("show")(js.Any.fromFunction1(show))
    __obj.asInstanceOf[AnonHide]
  }
}

