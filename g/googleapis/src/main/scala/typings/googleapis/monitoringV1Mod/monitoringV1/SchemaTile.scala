package typings.googleapis.monitoringV1Mod.monitoringV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTile extends StObject {
  
  /**
    * The height of the tile, measured in grid blocks. Tiles must have a minimum height of 1.
    */
  var height: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The informational widget contained in the tile. For example an XyChart.
    */
  var widget: js.UndefOr[SchemaWidget] = js.undefined
  
  /**
    * The width of the tile, measured in grid blocks. Tiles must have a minimum width of 1.
    */
  var width: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The zero-indexed position of the tile in grid blocks relative to the left edge of the grid. Tiles must be contained within the specified number of columns. x_pos cannot be negative.
    */
  var xPos: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The zero-indexed position of the tile in grid blocks relative to the top edge of the grid. y_pos cannot be negative.
    */
  var yPos: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTile {
  
  inline def apply(): SchemaTile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTile]
  }
  
  extension [Self <: SchemaTile](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightNull: Self = StObject.set(x, "height", null)
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidget(value: SchemaWidget): Self = StObject.set(x, "widget", value.asInstanceOf[js.Any])
    
    inline def setWidgetUndefined: Self = StObject.set(x, "widget", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthNull: Self = StObject.set(x, "width", null)
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setXPos(value: Double): Self = StObject.set(x, "xPos", value.asInstanceOf[js.Any])
    
    inline def setXPosNull: Self = StObject.set(x, "xPos", null)
    
    inline def setXPosUndefined: Self = StObject.set(x, "xPos", js.undefined)
    
    inline def setYPos(value: Double): Self = StObject.set(x, "yPos", value.asInstanceOf[js.Any])
    
    inline def setYPosNull: Self = StObject.set(x, "yPos", null)
    
    inline def setYPosUndefined: Self = StObject.set(x, "yPos", js.undefined)
  }
}
