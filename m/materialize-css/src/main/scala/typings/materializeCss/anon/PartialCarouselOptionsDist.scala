package typings.materializeCss.anon

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
    dist: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    indicators: js.UndefOr[Boolean] = js.undefined,
    noWrap: js.UndefOr[Boolean] = js.undefined,
    numVisible: js.UndefOr[Double] = js.undefined,
    onCycleTo: js.ThisFunction2[/* this */ Carousel, /* current */ Element, /* dragged */ Boolean, Unit] = null,
    padding: js.UndefOr[Double] = js.undefined,
    shift: js.UndefOr[Double] = js.undefined
  ): PartialCarouselOptionsDist = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dist)) __obj.updateDynamic("dist")(dist.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indicators)) __obj.updateDynamic("indicators")(indicators.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noWrap)) __obj.updateDynamic("noWrap")(noWrap.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numVisible)) __obj.updateDynamic("numVisible")(numVisible.get.asInstanceOf[js.Any])
    if (onCycleTo != null) __obj.updateDynamic("onCycleTo")(onCycleTo.asInstanceOf[js.Any])
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shift)) __obj.updateDynamic("shift")(shift.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCarouselOptionsDist]
  }
}

