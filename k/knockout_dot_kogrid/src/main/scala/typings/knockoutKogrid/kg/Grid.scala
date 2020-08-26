package typings.knockoutKogrid.kg

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Grid[EntityType] extends js.Object {
  @JSName("$$selectionPhase")
  var DollarDollarselectionPhase: Boolean = js.native
  var config: GridOptions[EntityType] = js.native
  var rowFactory: RowFactory[EntityType] = js.native
  var selectionService: SelectionService[EntityType] = js.native
  def configureColumnWidths(): Unit = js.native
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
  @scala.inline
  implicit class GridOps[Self <: Grid[_], EntityType] (val x: Self with Grid[EntityType]) extends AnyVal {
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
    def setDollarDollarselectionPhase(value: Boolean): Self = this.set("$$selectionPhase", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfig(value: GridOptions[EntityType]): Self = this.set("config", value.asInstanceOf[js.Any])
    @scala.inline
    def setConfigureColumnWidths(value: () => Unit): Self = this.set("configureColumnWidths", js.Any.fromFunction0(value))
    @scala.inline
    def setRowFactory(value: RowFactory[EntityType]): Self = this.set("rowFactory", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionService(value: SelectionService[EntityType]): Self = this.set("selectionService", value.asInstanceOf[js.Any])
  }
  
}

