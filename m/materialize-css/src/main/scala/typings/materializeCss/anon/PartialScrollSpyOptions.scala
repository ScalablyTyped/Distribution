package typings.materializeCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.ScrollSpyOptions> */
trait PartialScrollSpyOptions extends js.Object {
  var activeClass: js.UndefOr[String] = js.undefined
  var getActiveElement: js.UndefOr[js.Function1[/* id */ String, String]] = js.undefined
  var scrollOffset: js.UndefOr[Double] = js.undefined
  var throttle: js.UndefOr[Double] = js.undefined
}

object PartialScrollSpyOptions {
  @scala.inline
  def apply(
    activeClass: String = null,
    getActiveElement: /* id */ String => String = null,
    scrollOffset: js.UndefOr[Double] = js.undefined,
    throttle: js.UndefOr[Double] = js.undefined
  ): PartialScrollSpyOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass.asInstanceOf[js.Any])
    if (getActiveElement != null) __obj.updateDynamic("getActiveElement")(js.Any.fromFunction1(getActiveElement))
    if (!js.isUndefined(scrollOffset)) __obj.updateDynamic("scrollOffset")(scrollOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(throttle)) __obj.updateDynamic("throttle")(throttle.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialScrollSpyOptions]
  }
}

