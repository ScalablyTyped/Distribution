package typings.luminoWidgets.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@lumino/widgets.@lumino/widgets/types/gridlayout.GridLayout.ICellConfig> */
@js.native
trait PartialICellConfig extends js.Object {
  
  var column: js.UndefOr[Double] = js.native
  
  var columnSpan: js.UndefOr[Double] = js.native
  
  var row: js.UndefOr[Double] = js.native
  
  var rowSpan: js.UndefOr[Double] = js.native
}
object PartialICellConfig {
  
  @scala.inline
  def apply(): PartialICellConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialICellConfig]
  }
  
  @scala.inline
  implicit class PartialICellConfigOps[Self <: PartialICellConfig] (val x: Self) extends AnyVal {
    
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
    def deleteColumn: Self = this.set("column", js.undefined)
    
    @scala.inline
    def setColumnSpan(value: Double): Self = this.set("columnSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnSpan: Self = this.set("columnSpan", js.undefined)
    
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRow: Self = this.set("row", js.undefined)
    
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowSpan: Self = this.set("rowSpan", js.undefined)
  }
}
