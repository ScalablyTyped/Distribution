package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLoaded extends js.Object {
  var progress: js.UndefOr[js.Function2[/* loaded */ Double, /* total */ Double, Unit]] = js.undefined
}

object AnonLoaded {
  @scala.inline
  def apply(progress: (/* loaded */ Double, /* total */ Double) => Unit = null): AnonLoaded = {
    val __obj = js.Dynamic.literal()
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction2(progress))
    __obj.asInstanceOf[AnonLoaded]
  }
}

