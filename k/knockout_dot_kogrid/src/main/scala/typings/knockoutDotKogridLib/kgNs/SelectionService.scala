package typings
package knockoutDotKogridLib.kgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SelectionService[EntityType] extends js.Object {
  var lastClickedRow: Row[EntityType]
  var multi: scala.Boolean
  def setSelection(row: Row[EntityType], selected: scala.Boolean): scala.Unit
}

