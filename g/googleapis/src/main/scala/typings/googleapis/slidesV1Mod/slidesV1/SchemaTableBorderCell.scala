package typings.googleapis.slidesV1Mod.slidesV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The properties of each border cell.
  */
@js.native
trait SchemaTableBorderCell extends js.Object {
  
  /**
    * The location of the border within the border table.
    */
  var location: js.UndefOr[SchemaTableCellLocation] = js.native
  
  /**
    * The border properties.
    */
  var tableBorderProperties: js.UndefOr[SchemaTableBorderProperties] = js.native
}
object SchemaTableBorderCell {
  
  @scala.inline
  def apply(): SchemaTableBorderCell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTableBorderCell]
  }
  
  @scala.inline
  implicit class SchemaTableBorderCellOps[Self <: SchemaTableBorderCell] (val x: Self) extends AnyVal {
    
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
    def setLocation(value: SchemaTableCellLocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setTableBorderProperties(value: SchemaTableBorderProperties): Self = this.set("tableBorderProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableBorderProperties: Self = this.set("tableBorderProperties", js.undefined)
  }
}
