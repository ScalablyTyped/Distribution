package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilterSettings extends ISettings {
  var CapturedFilter: js.Array[FilterClause] = js.native
  var DefaultFilters: js.Array[FilterClause] = js.native
  var Filters: js.Array[FilterClause] = js.native
  def fullReset(): Unit = js.native
  def loadFromJson(filterSettings: js.Any): Unit = js.native
}

object FilterSettings {
  @scala.inline
  def apply(
    CapturedFilter: js.Array[FilterClause],
    DefaultFilters: js.Array[FilterClause],
    Filters: js.Array[FilterClause],
    fullReset: () => Unit,
    isSet: () => Boolean,
    loadFromJson: js.Any => Unit,
    reset: () => Unit
  ): FilterSettings = {
    val __obj = js.Dynamic.literal(CapturedFilter = CapturedFilter.asInstanceOf[js.Any], DefaultFilters = DefaultFilters.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], fullReset = js.Any.fromFunction0(fullReset), isSet = js.Any.fromFunction0(isSet), loadFromJson = js.Any.fromFunction1(loadFromJson), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[FilterSettings]
  }
  @scala.inline
  implicit class FilterSettingsOps[Self <: FilterSettings] (val x: Self) extends AnyVal {
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
    def setCapturedFilterVarargs(value: FilterClause*): Self = this.set("CapturedFilter", js.Array(value :_*))
    @scala.inline
    def setCapturedFilter(value: js.Array[FilterClause]): Self = this.set("CapturedFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultFiltersVarargs(value: FilterClause*): Self = this.set("DefaultFilters", js.Array(value :_*))
    @scala.inline
    def setDefaultFilters(value: js.Array[FilterClause]): Self = this.set("DefaultFilters", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: FilterClause*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: js.Array[FilterClause]): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def setFullReset(value: () => Unit): Self = this.set("fullReset", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadFromJson(value: js.Any => Unit): Self = this.set("loadFromJson", js.Any.fromFunction1(value))
  }
  
}

