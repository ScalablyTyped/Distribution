package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Carousel, 'next'> */
trait PickCarouselnext extends js.Object {
  var next: js.UndefOr[js.Any] = js.undefined
}

object PickCarouselnext {
  @scala.inline
  def apply(next: js.Any = null): PickCarouselnext = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCarouselnext]
  }
}

