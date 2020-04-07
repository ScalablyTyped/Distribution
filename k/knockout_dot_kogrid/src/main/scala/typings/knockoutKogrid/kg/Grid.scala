package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grid[EntityType] extends js.Object {
  @JSName("$$selectionPhase")
  var DollarDollarselectionPhase: Boolean
  var config: GridOptions[EntityType]
  var rowFactory: RowFactory[EntityType]
  var selectionService: SelectionService[EntityType]
  def configureColumnWidths(): Unit
}

object Grid {
  @scala.inline
  def apply[EntityType](
    DollarDollarselectionPhase: Boolean,
    config: GridOptions[EntityType],
    configureColumnWidths: () => Unit,
    rowFactory: RowFactory[EntityType],
    selectionService: SelectionService[EntityType]
  ): Grid[EntityType] = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], configureColumnWidths = js.Any.fromFunction0(configureColumnWidths), rowFactory = rowFactory.asInstanceOf[js.Any], selectionService = selectionService.asInstanceOf[js.Any])
    __obj.updateDynamic("$$selectionPhase")(DollarDollarselectionPhase.asInstanceOf[js.Any])
    __obj.asInstanceOf[Grid[EntityType]]
  }
}

