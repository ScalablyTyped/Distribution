package typings.materializeCss

import typings.materializeCss.M.Carousel
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.CarouselOptions> */
trait PartialCarouselOptionsDist extends js.Object {
  var dist: js.UndefOr[Double] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var indicators: js.UndefOr[Boolean] = js.undefined
  var noWrap: js.UndefOr[Boolean] = js.undefined
  var numVisible: js.UndefOr[Double] = js.undefined
  var onCycleTo: js.UndefOr[
    js.ThisFunction2[/* this */ Carousel, /* current */ Element, /* dragged */ Boolean, Unit]
  ] = js.undefined
  var padding: js.UndefOr[Double] = js.undefined
  var shift: js.UndefOr[Double] = js.undefined
}

object PartialCarouselOptionsDist {
  @scala.inline
  def apply(
    dist: Int | Double = null,
    duration: Int | Double = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    indicators: js.UndefOr[Boolean] = js.undefined,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    numVisible: Int | Double = null,
    onCycleTo: js.ThisFunction2[/* this */ Carousel, /* current */ Element, /* dragged */ Boolean, Unit] = null,
    padding: Int | Double = null,
    shift: Int | Double = null
  ): PartialCarouselOptionsDist = {
    val __obj = js.Dynamic.literal()
    if (dist != null) __obj.updateDynamic("dist")(dist.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(indicators)) __obj.updateDynamic("indicators")(indicators.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap.asInstanceOf[js.Any])
    if (numVisible != null) __obj.updateDynamic("numVisible")(numVisible.asInstanceOf[js.Any])
    if (onCycleTo != null) __obj.updateDynamic("onCycleTo")(onCycleTo.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (shift != null) __obj.updateDynamic("shift")(shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCarouselOptionsDist]
  }
}

