package typings.luminoWidgets.gridlayoutMod.GridLayout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object which holds the cell configuration for a widget.
  */
@js.native
trait ICellConfig extends js.Object {
  
  /**
    * The column index for the widget.
    */
  val column: Double = js.native
  
  /**
    * The column span for the widget.
    */
  val columnSpan: Double = js.native
  
  /**
    * The row index for the widget.
    */
  val row: Double = js.native
  
  /**
    * The row span for the widget.
    */
  val rowSpan: Double = js.native
}
object ICellConfig {
  
  @scala.inline
  def apply(column: Double, columnSpan: Double, row: Double, rowSpan: Double): ICellConfig = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnSpan = columnSpan.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICellConfig]
  }
  
  @scala.inline
  implicit class ICellConfigOps[Self <: ICellConfig] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnSpan(value: Double): Self = this.set("columnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
  }
}
