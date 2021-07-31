package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Normalized bounding box. The normalized vertex coordinates are relative to
  * the original image. Range: [0, 1].
  */
trait SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox extends StObject {
  
  /**
    * Bottom Y coordinate.
    */
  var bottom: js.UndefOr[Double] = js.undefined
  
  /**
    * Left X coordinate.
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Right X coordinate.
    */
  var right: js.UndefOr[Double] = js.undefined
  
  /**
    * Top Y coordinate.
    */
  var top: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBoxMutableBuilder[Self <: SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
