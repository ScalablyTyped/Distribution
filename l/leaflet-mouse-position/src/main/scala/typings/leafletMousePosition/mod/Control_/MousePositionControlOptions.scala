package typings.leafletMousePosition.mod.Control_

import typings.leaflet.mod.ControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousePositionControlOptions extends ControlOptions {
  var emptyString: js.UndefOr[String] = js.native
  var formatter: js.UndefOr[js.Function2[/* lng */ Double, /* lat */ Double, String]] = js.native
  var latFormatter: js.UndefOr[js.Function1[/* lat */ Double, String]] = js.native
  var lngFirst: js.UndefOr[Boolean] = js.native
  var lngFormatter: js.UndefOr[js.Function1[/* lng */ Double, String]] = js.native
  var numDigits: js.UndefOr[Double] = js.native
  var prefix: js.UndefOr[String] = js.native
  var separator: js.UndefOr[String] = js.native
  var wrapLng: js.UndefOr[Boolean] = js.native
}

object MousePositionControlOptions {
  @scala.inline
  def apply(): MousePositionControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MousePositionControlOptions]
  }
  @scala.inline
  implicit class MousePositionControlOptionsOps[Self <: MousePositionControlOptions] (val x: Self) extends AnyVal {
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
    def setEmptyString(value: String): Self = this.set("emptyString", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmptyString: Self = this.set("emptyString", js.undefined)
    @scala.inline
    def setFormatter(value: (/* lng */ Double, /* lat */ Double) => String): Self = this.set("formatter", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setLatFormatter(value: /* lat */ Double => String): Self = this.set("latFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLatFormatter: Self = this.set("latFormatter", js.undefined)
    @scala.inline
    def setLngFirst(value: Boolean): Self = this.set("lngFirst", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLngFirst: Self = this.set("lngFirst", js.undefined)
    @scala.inline
    def setLngFormatter(value: /* lng */ Double => String): Self = this.set("lngFormatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLngFormatter: Self = this.set("lngFormatter", js.undefined)
    @scala.inline
    def setNumDigits(value: Double): Self = this.set("numDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumDigits: Self = this.set("numDigits", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
    @scala.inline
    def setWrapLng(value: Boolean): Self = this.set("wrapLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapLng: Self = this.set("wrapLng", js.undefined)
  }
  
}

