package typings.googleapis.docsV1Mod.docsV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCropProperties extends StObject {
  
  /**
    * The clockwise rotation angle of the crop rectangle around its center, in radians. Rotation is applied after the offsets.
    */
  var angle: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The offset specifies how far inwards the bottom edge of the crop rectangle is from the bottom edge of the original content as a fraction of the original content's height.
    */
  var offsetBottom: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The offset specifies how far inwards the left edge of the crop rectangle is from the left edge of the original content as a fraction of the original content's width.
    */
  var offsetLeft: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The offset specifies how far inwards the right edge of the crop rectangle is from the right edge of the original content as a fraction of the original content's width.
    */
  var offsetRight: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The offset specifies how far inwards the top edge of the crop rectangle is from the top edge of the original content as a fraction of the original content's height.
    */
  var offsetTop: js.UndefOr[Double | Null] = js.undefined
}
object SchemaCropProperties {
  
  inline def apply(): SchemaCropProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCropProperties]
  }
  
  extension [Self <: SchemaCropProperties](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngleNull: Self = StObject.set(x, "angle", null)
    
    inline def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
    
    inline def setOffsetBottom(value: Double): Self = StObject.set(x, "offsetBottom", value.asInstanceOf[js.Any])
    
    inline def setOffsetBottomNull: Self = StObject.set(x, "offsetBottom", null)
    
    inline def setOffsetBottomUndefined: Self = StObject.set(x, "offsetBottom", js.undefined)
    
    inline def setOffsetLeft(value: Double): Self = StObject.set(x, "offsetLeft", value.asInstanceOf[js.Any])
    
    inline def setOffsetLeftNull: Self = StObject.set(x, "offsetLeft", null)
    
    inline def setOffsetLeftUndefined: Self = StObject.set(x, "offsetLeft", js.undefined)
    
    inline def setOffsetRight(value: Double): Self = StObject.set(x, "offsetRight", value.asInstanceOf[js.Any])
    
    inline def setOffsetRightNull: Self = StObject.set(x, "offsetRight", null)
    
    inline def setOffsetRightUndefined: Self = StObject.set(x, "offsetRight", js.undefined)
    
    inline def setOffsetTop(value: Double): Self = StObject.set(x, "offsetTop", value.asInstanceOf[js.Any])
    
    inline def setOffsetTopNull: Self = StObject.set(x, "offsetTop", null)
    
    inline def setOffsetTopUndefined: Self = StObject.set(x, "offsetTop", js.undefined)
  }
}
