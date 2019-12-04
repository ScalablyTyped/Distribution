package typings.ionic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Loaded extends js.Object {
  var progress: js.UndefOr[js.Function2[/* loaded */ Double, /* total */ Double, Unit]] = js.undefined
}

object Anon_Loaded {
  @scala.inline
  def apply(progress: (/* loaded */ Double, /* total */ Double) => Unit = null): Anon_Loaded = {
    val __obj = js.Dynamic.literal()
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction2(progress))
    __obj.asInstanceOf[Anon_Loaded]
  }
}

