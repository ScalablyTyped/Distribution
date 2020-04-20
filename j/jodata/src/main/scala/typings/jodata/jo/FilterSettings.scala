package typings.jodata.jo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettings extends ISettings {
  var CapturedFilter: js.Array[FilterClause]
  var DefaultFilters: js.Array[FilterClause]
  var Filters: js.Array[FilterClause]
  def fullReset(): Unit
  def loadFromJson(filterSettings: js.Any): Unit
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
}

