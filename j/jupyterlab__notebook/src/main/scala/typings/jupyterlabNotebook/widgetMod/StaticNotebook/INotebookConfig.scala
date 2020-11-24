package typings.jupyterlabNotebook.widgetMod.StaticNotebook

import typings.jupyterlabNbformat.mod.CellType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A config object for the notebook widget
  */
@js.native
trait INotebookConfig extends js.Object {
  
  /**
    * The default type for new notebook cells.
    */
  var defaultCell: CellType = js.native
  
  /**
    * Should timing be recorded in metadata
    */
  var recordTiming: Boolean = js.native
  
  /**
    * Enable scrolling past the last cell
    */
  var scrollPastEnd: Boolean = js.native
}
object INotebookConfig {
  
  @scala.inline
  def apply(defaultCell: CellType, recordTiming: Boolean, scrollPastEnd: Boolean): INotebookConfig = {
    val __obj = js.Dynamic.literal(defaultCell = defaultCell.asInstanceOf[js.Any], recordTiming = recordTiming.asInstanceOf[js.Any], scrollPastEnd = scrollPastEnd.asInstanceOf[js.Any])
    __obj.asInstanceOf[INotebookConfig]
  }
  
  @scala.inline
  implicit class INotebookConfigOps[Self <: INotebookConfig] (val x: Self) extends AnyVal {
    
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
    def setDefaultCell(value: CellType): Self = this.set("defaultCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordTiming(value: Boolean): Self = this.set("recordTiming", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollPastEnd(value: Boolean): Self = this.set("scrollPastEnd", value.asInstanceOf[js.Any])
  }
}
