package typings.handsontable.mod.Handsontable.ganttChart

import typings.handsontable.handsontableStrings.monday
import typings.handsontable.handsontableStrings.sunday
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Settings extends js.Object {
  var allowSplitWeeks: js.UndefOr[Boolean] = js.native
  var dataSource: HandsontableBindingInformation | js.Array[DataObject] = js.native
  var firstWeekDay: monday | sunday = js.native
  var hideDaysAfterFullWeeks: js.UndefOr[Boolean] = js.native
  var hideDaysBeforeFullWeeks: js.UndefOr[Boolean] = js.native
  var startYear: Double = js.native
  var weekHeaderGenerator: js.UndefOr[js.Function2[/* start */ Double, /* end */ Double, String]] = js.native
}

object Settings {
  @scala.inline
  def apply(
    dataSource: HandsontableBindingInformation | js.Array[DataObject],
    firstWeekDay: monday | sunday,
    startYear: Double
  ): Settings = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], firstWeekDay = firstWeekDay.asInstanceOf[js.Any], startYear = startYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
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
    def setDataSourceVarargs(value: DataObject*): Self = this.set("dataSource", js.Array(value :_*))
    @scala.inline
    def setDataSource(value: HandsontableBindingInformation | js.Array[DataObject]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirstWeekDay(value: monday | sunday): Self = this.set("firstWeekDay", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartYear(value: Double): Self = this.set("startYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowSplitWeeks(value: Boolean): Self = this.set("allowSplitWeeks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSplitWeeks: Self = this.set("allowSplitWeeks", js.undefined)
    @scala.inline
    def setHideDaysAfterFullWeeks(value: Boolean): Self = this.set("hideDaysAfterFullWeeks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDaysAfterFullWeeks: Self = this.set("hideDaysAfterFullWeeks", js.undefined)
    @scala.inline
    def setHideDaysBeforeFullWeeks(value: Boolean): Self = this.set("hideDaysBeforeFullWeeks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDaysBeforeFullWeeks: Self = this.set("hideDaysBeforeFullWeeks", js.undefined)
    @scala.inline
    def setWeekHeaderGenerator(value: (/* start */ Double, /* end */ Double) => String): Self = this.set("weekHeaderGenerator", js.Any.fromFunction2(value))
    @scala.inline
    def deleteWeekHeaderGenerator: Self = this.set("weekHeaderGenerator", js.undefined)
  }
  
}

