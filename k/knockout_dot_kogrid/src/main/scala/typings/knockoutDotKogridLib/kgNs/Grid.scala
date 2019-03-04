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

object Grid {
  @scala.inline
  def apply[EntityType](
    $$selectionPhase: scala.Boolean,
    config: GridOptions[EntityType],
    configureColumnWidths: js.Function0[scala.Unit],
    rowFactory: RowFactory[EntityType],
    selectionService: SelectionService[EntityType]
  ): Grid[EntityType] = {
    val __obj = js.Dynamic.literal($$selectionPhase = $$selectionPhase, config = config, configureColumnWidths = configureColumnWidths, rowFactory = rowFactory, selectionService = selectionService)
  
    __obj.asInstanceOf[Grid[EntityType]]
  }
}

