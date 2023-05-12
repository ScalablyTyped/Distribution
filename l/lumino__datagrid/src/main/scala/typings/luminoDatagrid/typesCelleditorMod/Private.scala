package typings.luminoDatagrid.typesCelleditorMod

import typings.luminoDatagrid.typesDatagridMod.DataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A namespace for module-private functionality.
  */
object Private {
  
  /**
    * A type alias for cell properties.
    */
  trait ICellInfo extends StObject {
    
    var column: Double
    
    var data: Any
    
    var grid: DataGrid
    
    var height: Double
    
    var row: Double
    
    var width: Double
    
    var x: Double
    
    var y: Double
  }
  object ICellInfo {
    
    inline def apply(
      column: Double,
      data: Any,
      grid: DataGrid,
      height: Double,
      row: Double,
      width: Double,
      x: Double,
      y: Double
    ): ICellInfo = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[ICellInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICellInfo] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: DataGrid): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
