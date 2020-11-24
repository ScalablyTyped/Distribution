package typings.igniteUi.Infragistics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridExcelExporter extends js.Object {
  
  /**
    * Exports the provided igGrid to Excel document.
    *
    * @param grid jQuery element of the igGrid.
    * @param userSettings Settings for exporting the grid.
    * @param userCallbacks Callbacks for the events.
    */
  def exportGrid(grid: js.Object, userSettings: js.Object, userCallbacks: js.Object): Unit = js.native
}
object GridExcelExporter {
  
  @scala.inline
  def apply(exportGrid: (js.Object, js.Object, js.Object) => Unit): GridExcelExporter = {
    val __obj = js.Dynamic.literal(exportGrid = js.Any.fromFunction3(exportGrid))
    __obj.asInstanceOf[GridExcelExporter]
  }
  
  @scala.inline
  implicit class GridExcelExporterOps[Self <: GridExcelExporter] (val x: Self) extends AnyVal {
    
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
    def setExportGrid(value: (js.Object, js.Object, js.Object) => Unit): Self = this.set("exportGrid", js.Any.fromFunction3(value))
  }
}
