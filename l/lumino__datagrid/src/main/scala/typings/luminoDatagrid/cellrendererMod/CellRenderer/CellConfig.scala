package typings.luminoDatagrid.cellrendererMod.CellRenderer

import typings.luminoDatagrid.datamodelMod.DataModel.CellRegion
import typings.luminoDatagrid.datamodelMod.DataModel.Metadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object which holds the configuration data for a cell.
  */
@js.native
trait CellConfig extends js.Object {
  
  /**
    * The column index of the cell.
    */
  val column: Double = js.native
  
  /**
    * The height of the cell rectangle, in viewport pixels.
    */
  val height: Double = js.native
  
  /**
    * The metadata for the cell.
    */
  val metadata: Metadata = js.native
  
  /**
    * The region for the cell.
    */
  val region: CellRegion = js.native
  
  /**
    * The row index of the cell.
    */
  val row: Double = js.native
  
  /**
    * The value for the cell.
    */
  val value: js.Any = js.native
  
  /**
    * The width of the cell rectangle, in viewport pixels.
    */
  val width: Double = js.native
  
  /**
    * The X position of the cell rectangle, in viewport coordinates.
    */
  val x: Double = js.native
  
  /**
    * The Y position of the cell rectangle, in viewport coordinates.
    */
  val y: Double = js.native
}
object CellConfig {
  
  @scala.inline
  def apply(
    column: Double,
    height: Double,
    metadata: Metadata,
    region: CellRegion,
    row: Double,
    value: js.Any,
    width: Double,
    x: Double,
    y: Double
  ): CellConfig = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellConfig]
  }
  
  @scala.inline
  implicit class CellConfigOps[Self <: CellConfig] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: Metadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: CellRegion): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
