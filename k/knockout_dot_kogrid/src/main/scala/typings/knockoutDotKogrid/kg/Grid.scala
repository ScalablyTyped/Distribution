package typings.knockoutDotKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grid[EntityType] extends js.Object {
  @JSName("$$selectionPhase")
  var $$selectionPhase: Boolean
  var config: GridOptions[EntityType]
  var rowFactory: RowFactory[EntityType]
  var selectionService: SelectionService[EntityType]
  def configureColumnWidths(): Unit
}

object Grid {
  @scala.inline
  def apply[EntityType](
    $$selectionPhase: Boolean,
    config: GridOptions[EntityType],
    configureColumnWidths: () => Unit,
    rowFactory: RowFactory[EntityType],
    selectionService: SelectionService[EntityType]
  ): Grid[EntityType] = {
    val __obj = js.Dynamic.literal($$selectionPhase = $$selectionPhase, config = config, configureColumnWidths = js.Any.fromFunction0(configureColumnWidths), rowFactory = rowFactory, selectionService = selectionService)
  
    __obj.asInstanceOf[Grid[EntityType]]
  }
}

