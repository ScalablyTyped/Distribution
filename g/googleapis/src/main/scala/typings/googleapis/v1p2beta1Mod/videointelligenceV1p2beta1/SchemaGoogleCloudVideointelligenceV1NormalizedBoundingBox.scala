package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1NormalizedBoundingBox extends StObject {
  
  /**
    * Bottom Y coordinate.
    */
  var bottom: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Left X coordinate.
    */
  var left: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Right X coordinate.
    */
  var right: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * Top Y coordinate.
    */
  var top: js.UndefOr[Double | Null] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1NormalizedBoundingBox {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1NormalizedBoundingBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1NormalizedBoundingBox]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1NormalizedBoundingBox](x: Self) {
    
    inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomNull: Self = StObject.set(x, "bottom", null)
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftNull: Self = StObject.set(x, "left", null)
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightNull: Self = StObject.set(x, "right", null)
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopNull: Self = StObject.set(x, "top", null)
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
