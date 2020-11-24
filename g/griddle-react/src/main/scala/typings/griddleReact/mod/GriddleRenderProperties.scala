package typings.griddleReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GriddleRenderProperties extends js.Object {
  
  var columnProperties: js.UndefOr[PropertyBag[ColumnRenderProperties]] = js.native
  
  var rowProperties: js.UndefOr[RowRenderProperties] = js.native
}
object GriddleRenderProperties {
  
  @scala.inline
  def apply(): GriddleRenderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GriddleRenderProperties]
  }
  
  @scala.inline
  implicit class GriddleRenderPropertiesOps[Self <: GriddleRenderProperties] (val x: Self) extends AnyVal {
    
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
    def setColumnProperties(value: PropertyBag[ColumnRenderProperties]): Self = this.set("columnProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnProperties: Self = this.set("columnProperties", js.undefined)
    
    @scala.inline
    def setRowProperties(value: RowRenderProperties): Self = this.set("rowProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowProperties: Self = this.set("rowProperties", js.undefined)
  }
}
