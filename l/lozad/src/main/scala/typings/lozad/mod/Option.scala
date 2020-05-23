package typings.lozad.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Option extends js.Object {
  var load: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.undefined
  var loaded: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.undefined
  var rootMargin: js.UndefOr[String] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
}

object Option {
  @scala.inline
  def apply(
    load: /* element */ Element => Unit = null,
    loaded: /* element */ Element => Unit = null,
    rootMargin: String = null,
    threshold: js.UndefOr[Double] = js.undefined
  ): Option = {
    val __obj = js.Dynamic.literal()
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (loaded != null) __obj.updateDynamic("loaded")(js.Any.fromFunction1(loaded))
    if (rootMargin != null) __obj.updateDynamic("rootMargin")(rootMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Option]
  }
}

