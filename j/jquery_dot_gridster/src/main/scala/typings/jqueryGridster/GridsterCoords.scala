package typings.jqueryGridster

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridsterCoords extends js.Object {
  
  var col: Double = js.native
  
  var row: Double = js.native
  
  var size_x: Double = js.native
  
  var size_y: Double = js.native
}
object GridsterCoords {
  
  @scala.inline
  def apply(col: Double, row: Double, size_x: Double, size_y: Double): GridsterCoords = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], size_x = size_x.asInstanceOf[js.Any], size_y = size_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridsterCoords]
  }
  
  @scala.inline
  implicit class GridsterCoordsOps[Self <: GridsterCoords] (val x: Self) extends AnyVal {
    
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
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize_x(value: Double): Self = this.set("size_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize_y(value: Double): Self = this.set("size_y", value.asInstanceOf[js.Any])
  }
}
