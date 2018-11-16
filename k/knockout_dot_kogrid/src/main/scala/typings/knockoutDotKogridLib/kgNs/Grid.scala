package typings
package knockoutDotKogridLib.kgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Grid[EntityType] extends js.Object {
  @JSName("$$selectionPhase")
  var $$selectionPhase: scala.Boolean
  var config: GridOptions[EntityType]
  var rowFactory: RowFactory[EntityType]
  var selectionService: SelectionService[EntityType]
  def configureColumnWidths(): scala.Unit
}

