package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Carousel, 'destroy'> */
trait PickCarouseldestroy extends js.Object {
  var destroy: js.UndefOr[js.Any] = js.undefined
}

object PickCarouseldestroy {
  @scala.inline
  def apply(destroy: js.Any = null): PickCarouseldestroy = {
    val __obj = js.Dynamic.literal()
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCarouseldestroy]
  }
}

