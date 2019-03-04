package typings
package jodataLib.joNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterSettings extends ISettings {
  var CapturedFilter: js.Array[FilterClause]
  var DefaultFilters: js.Array[FilterClause]
  var Filters: js.Array[FilterClause]
  def fullReset(): scala.Unit
  def loadFromJson(filterSettings: js.Any): scala.Unit
}

object FilterSettings {
  @scala.inline
  def apply(
    CapturedFilter: js.Array[FilterClause],
    DefaultFilters: js.Array[FilterClause],
    Filters: js.Array[FilterClause],
    fullReset: js.Function0[scala.Unit],
    isSet: js.Function0[scala.Boolean],
    loadFromJson: js.Function1[js.Any, scala.Unit],
    reset: js.Function0[scala.Unit],
    toString: js.Function0[java.lang.String]
  ): FilterSettings = {
    val __obj = js.Dynamic.literal(CapturedFilter = CapturedFilter, DefaultFilters = DefaultFilters, Filters = Filters, fullReset = fullReset, isSet = isSet, loadFromJson = loadFromJson, reset = reset, toString = toString)
  
    __obj.asInstanceOf[FilterSettings]
  }
}

