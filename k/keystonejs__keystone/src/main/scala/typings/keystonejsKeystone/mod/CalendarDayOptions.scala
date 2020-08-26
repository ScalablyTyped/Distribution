package typings.keystonejsKeystone.mod

import typings.keystonejsFields.mod.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.keystonejsKeystone.mod.AllFieldsOptions because Already inherited */ @js.native
trait CalendarDayOptions extends BaseFieldOptions {
  var format: js.UndefOr[String] = js.native
  var yearPickerType: js.UndefOr[String] = js.native
  var yearRangeFrom: js.UndefOr[Double] = js.native
  var yearRangeTo: js.UndefOr[Double] = js.native
}

object CalendarDayOptions {
  @scala.inline
  def apply(`type`: FieldType): CalendarDayOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarDayOptions]
  }
  @scala.inline
  implicit class CalendarDayOptionsOps[Self <: CalendarDayOptions] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setYearPickerType(value: String): Self = this.set("yearPickerType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearPickerType: Self = this.set("yearPickerType", js.undefined)
    @scala.inline
    def setYearRangeFrom(value: Double): Self = this.set("yearRangeFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearRangeFrom: Self = this.set("yearRangeFrom", js.undefined)
    @scala.inline
    def setYearRangeTo(value: Double): Self = this.set("yearRangeTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYearRangeTo: Self = this.set("yearRangeTo", js.undefined)
  }
  
}

