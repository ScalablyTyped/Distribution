package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A vertex represents a 2D point in the image. NOTE: the normalized vertex
  * coordinates are relative to the original image and range from 0 to 1.
  */
trait SchemaGoogleCloudVisionV1p3beta1NormalizedVertex extends StObject {
  
  /**
    * X coordinate.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * Y coordinate.
    */
  var y: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleCloudVisionV1p3beta1NormalizedVertex {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1NormalizedVertex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1NormalizedVertex]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1NormalizedVertexMutableBuilder[Self <: SchemaGoogleCloudVisionV1p3beta1NormalizedVertex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
