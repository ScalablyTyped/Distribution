package typings.ionic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Progress extends js.Object {
  var progress: js.UndefOr[js.Function2[/* loaded */ Double, /* total */ Double, Unit]] = js.undefined
}

object Progress {
  @scala.inline
  def apply(progress: (/* loaded */ Double, /* total */ Double) => Unit = null): Progress = {
    val __obj = js.Dynamic.literal()
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction2(progress))
    __obj.asInstanceOf[Progress]
  }
}

