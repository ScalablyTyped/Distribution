package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTileCoordinates extends StObject {
  
  /**
    * Required. The x coordinate.
    */
  var x: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The y coordinate.
    */
  var y: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Required. The Google Maps API zoom level.
    */
  var zoom: js.UndefOr[Double | Null] = js.undefined
}
object SchemaTileCoordinates {
  
  inline def apply(): SchemaTileCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTileCoordinates]
  }
  
  extension [Self <: SchemaTileCoordinates](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXNull: Self = StObject.set(x, "x", null)
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYNull: Self = StObject.set(x, "y", null)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    
    inline def setZoomNull: Self = StObject.set(x, "zoom", null)
    
    inline def setZoomUndefined: Self = StObject.set(x, "zoom", js.undefined)
  }
}
