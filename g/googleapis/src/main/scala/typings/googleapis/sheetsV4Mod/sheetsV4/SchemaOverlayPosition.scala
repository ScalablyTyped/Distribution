package typings.googleapis.sheetsV4Mod.sheetsV4

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaOverlayPosition extends StObject {
  
  /**
    * The cell the object is anchored to.
    */
  var anchorCell: js.UndefOr[SchemaGridCoordinate] = js.undefined
  
  /**
    * The height of the object, in pixels. Defaults to 371.
    */
  var heightPixels: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The horizontal offset, in pixels, that the object is offset from the anchor cell.
    */
  var offsetXPixels: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The vertical offset, in pixels, that the object is offset from the anchor cell.
    */
  var offsetYPixels: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The width of the object, in pixels. Defaults to 600.
    */
  var widthPixels: js.UndefOr[Double | Null] = js.undefined
}
object SchemaOverlayPosition {
  
  inline def apply(): SchemaOverlayPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOverlayPosition]
  }
  
  extension [Self <: SchemaOverlayPosition](x: Self) {
    
    inline def setAnchorCell(value: SchemaGridCoordinate): Self = StObject.set(x, "anchorCell", value.asInstanceOf[js.Any])
    
    inline def setAnchorCellUndefined: Self = StObject.set(x, "anchorCell", js.undefined)
    
    inline def setHeightPixels(value: Double): Self = StObject.set(x, "heightPixels", value.asInstanceOf[js.Any])
    
    inline def setHeightPixelsNull: Self = StObject.set(x, "heightPixels", null)
    
    inline def setHeightPixelsUndefined: Self = StObject.set(x, "heightPixels", js.undefined)
    
    inline def setOffsetXPixels(value: Double): Self = StObject.set(x, "offsetXPixels", value.asInstanceOf[js.Any])
    
    inline def setOffsetXPixelsNull: Self = StObject.set(x, "offsetXPixels", null)
    
    inline def setOffsetXPixelsUndefined: Self = StObject.set(x, "offsetXPixels", js.undefined)
    
    inline def setOffsetYPixels(value: Double): Self = StObject.set(x, "offsetYPixels", value.asInstanceOf[js.Any])
    
    inline def setOffsetYPixelsNull: Self = StObject.set(x, "offsetYPixels", null)
    
    inline def setOffsetYPixelsUndefined: Self = StObject.set(x, "offsetYPixels", js.undefined)
    
    inline def setWidthPixels(value: Double): Self = StObject.set(x, "widthPixels", value.asInstanceOf[js.Any])
    
    inline def setWidthPixelsNull: Self = StObject.set(x, "widthPixels", null)
    
    inline def setWidthPixelsUndefined: Self = StObject.set(x, "widthPixels", js.undefined)
  }
}
