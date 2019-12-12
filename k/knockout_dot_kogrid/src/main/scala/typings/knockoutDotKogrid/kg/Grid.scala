package typings.knockoutDotKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid[EntityType] extends js.Object {
  @JSName("$$selectionPhase")
  var $$selectionPhase: Boolean = js.native
  var config: GridOptions[EntityType] = js.native
  var rowFactory: RowFactory[EntityType] = js.native
  var selectionService: SelectionService[EntityType] = js.native
  def configureColumnWidths(): Unit = js.native
}

