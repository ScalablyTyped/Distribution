package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRegionProto extends StObject {
  
  /**
    * The height, in pixels. Always set.
    */
  var heightPx: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The left side of the rectangle, in pixels. Always set.
    */
  var leftPx: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The top of the rectangle, in pixels. Always set.
    */
  var topPx: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The width, in pixels. Always set.
    */
  var widthPx: js.UndefOr[Double | Null] = js.undefined
}
object SchemaRegionProto {
  
  inline def apply(): SchemaRegionProto = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRegionProto]
  }
  
  extension [Self <: SchemaRegionProto](x: Self) {
    
    inline def setHeightPx(value: Double): Self = StObject.set(x, "heightPx", value.asInstanceOf[js.Any])
    
    inline def setHeightPxNull: Self = StObject.set(x, "heightPx", null)
    
    inline def setHeightPxUndefined: Self = StObject.set(x, "heightPx", js.undefined)
    
    inline def setLeftPx(value: Double): Self = StObject.set(x, "leftPx", value.asInstanceOf[js.Any])
    
    inline def setLeftPxNull: Self = StObject.set(x, "leftPx", null)
    
    inline def setLeftPxUndefined: Self = StObject.set(x, "leftPx", js.undefined)
    
    inline def setTopPx(value: Double): Self = StObject.set(x, "topPx", value.asInstanceOf[js.Any])
    
    inline def setTopPxNull: Self = StObject.set(x, "topPx", null)
    
    inline def setTopPxUndefined: Self = StObject.set(x, "topPx", js.undefined)
    
    inline def setWidthPx(value: Double): Self = StObject.set(x, "widthPx", value.asInstanceOf[js.Any])
    
    inline def setWidthPxNull: Self = StObject.set(x, "widthPx", null)
    
    inline def setWidthPxUndefined: Self = StObject.set(x, "widthPx", js.undefined)
  }
}
