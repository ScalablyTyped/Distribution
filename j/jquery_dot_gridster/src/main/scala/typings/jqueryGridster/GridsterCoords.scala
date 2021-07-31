package typings.jqueryGridster

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridsterCoords extends StObject {
  
  var col: Double
  
  var row: Double
  
  var size_x: Double
  
  var size_y: Double
}
object GridsterCoords {
  
  @scala.inline
  def apply(col: Double, row: Double, size_x: Double, size_y: Double): GridsterCoords = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], size_x = size_x.asInstanceOf[js.Any], size_y = size_y.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridsterCoords]
  }
  
  @scala.inline
  implicit class GridsterCoordsMutableBuilder[Self <: GridsterCoords] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize_x(value: Double): Self = StObject.set(x, "size_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize_y(value: Double): Self = StObject.set(x, "size_y", value.asInstanceOf[js.Any])
  }
}
