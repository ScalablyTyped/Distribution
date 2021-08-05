package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A vertex represents a 2D point in the image. NOTE: the normalized vertex
  * coordinates are relative to the original image and range from 0 to 1.
  */
trait SchemaGoogleCloudVideointelligenceV1beta2NormalizedVertex extends StObject {
  
  /**
    * X coordinate.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * Y coordinate.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2NormalizedVertex {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2NormalizedVertex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2NormalizedVertex]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2NormalizedVertex](x: Self) {
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
