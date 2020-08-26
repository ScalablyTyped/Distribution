package typings.jqrangeslider

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQDateRangeSliderOptions extends JQRangeSliderOptions {
  var bounds: js.UndefOr[JQRangeSliderDateRange] = js.native
   // min and max values of the slider
  var defaultValues: js.UndefOr[JQRangeSliderDateRange] = js.native
   // values selected by default on construction
  var formatter: js.UndefOr[js.Function1[/* date */ Date, String]] = js.native
   // customize displayed label text
  var step: js.UndefOr[JQRangeSliderDateSteps] = js.native
}

object JQDateRangeSliderOptions {
  @scala.inline
  def apply(): JQDateRangeSliderOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JQDateRangeSliderOptions]
  }
  @scala.inline
  implicit class JQDateRangeSliderOptionsOps[Self <: JQDateRangeSliderOptions] (val x: Self) extends AnyVal {
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
    def setBounds(value: JQRangeSliderDateRange): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounds: Self = this.set("bounds", js.undefined)
    @scala.inline
    def setDefaultValues(value: JQRangeSliderDateRange): Self = this.set("defaultValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValues: Self = this.set("defaultValues", js.undefined)
    @scala.inline
    def setFormatter(value: /* date */ Date => String): Self = this.set("formatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setStep(value: JQRangeSliderDateSteps): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
  
}

