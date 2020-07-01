package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<materialize-css.M.Carousel, 'set'> */
trait PickCarouselset extends js.Object {
  var set: js.UndefOr[js.Any] = js.undefined
}

object PickCarouselset {
  @scala.inline
  def apply(set: js.Any = null): PickCarouselset = {
    val __obj = js.Dynamic.literal()
    if (set != null) __obj.updateDynamic("set")(set.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickCarouselset]
  }
}

