package typings.materializeCss.anon

import typings.materializeCss.M.Carousel
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<materialize-css.M.CarouselOptions> */
@js.native
trait PartialCarouselOptionsDist extends js.Object {
  var dist: js.UndefOr[Double] = js.native
  var duration: js.UndefOr[Double] = js.native
  var fullWidth: js.UndefOr[Boolean] = js.native
  var indicators: js.UndefOr[Boolean] = js.native
  var noWrap: js.UndefOr[Boolean] = js.native
  var numVisible: js.UndefOr[Double] = js.native
  var onCycleTo: js.UndefOr[
    js.ThisFunction2[/* this */ Carousel, /* current */ Element, /* dragged */ Boolean, Unit]
  ] = js.native
  var padding: js.UndefOr[Double] = js.native
  var shift: js.UndefOr[Double] = js.native
}

object PartialCarouselOptionsDist {
  @scala.inline
  def apply(): PartialCarouselOptionsDist = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCarouselOptionsDist]
  }
  @scala.inline
  implicit class PartialCarouselOptionsDistOps[Self <: PartialCarouselOptionsDist] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDist(value: Double): Self = this.set("dist", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDist: Self = this.set("dist", js.undefined)
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    @scala.inline
    def setFullWidth(value: Boolean): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setIndicators(value: Boolean): Self = this.set("indicators", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicators: Self = this.set("indicators", js.undefined)
    @scala.inline
    def setNoWrap(value: Boolean): Self = this.set("noWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoWrap: Self = this.set("noWrap", js.undefined)
    @scala.inline
    def setNumVisible(value: Double): Self = this.set("numVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumVisible: Self = this.set("numVisible", js.undefined)
    @scala.inline
    def setOnCycleTo(value: js.ThisFunction2[/* this */ Carousel, /* current */ Element, /* dragged */ Boolean, Unit]): Self = this.set("onCycleTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnCycleTo: Self = this.set("onCycleTo", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setShift(value: Double): Self = this.set("shift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShift: Self = this.set("shift", js.undefined)
  }
  
}

