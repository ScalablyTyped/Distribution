package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Carousel, 'prev'> */
trait PickCarouselprev extends js.Object {
  var prev: js.UndefOr[js.Any] = js.undefined
}

object PickCarouselprev {
  @scala.inline
  def apply(prev: js.Any = null): PickCarouselprev = {
    val __obj = js.Dynamic.literal()
    if (prev != null) __obj.updateDynamic("prev")(prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCarouselprev]
  }
}

