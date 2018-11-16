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

