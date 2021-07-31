package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A 3D position in the image, used primarily for Face detection landmarks. A
  * valid Position must have both x and y coordinates. The position coordinates
  * are in the same scale as the original image.
  */
trait SchemaGoogleCloudVisionV1p3beta1Position extends StObject {
  
  /**
    * X coordinate.
    */
  var x: js.UndefOr[Double] = js.undefined
  
  /**
    * Y coordinate.
    */
  var y: js.UndefOr[Double] = js.undefined
  
  /**
    * Z coordinate (or depth).
    */
  var z: js.UndefOr[Double] = js.undefined
}
object SchemaGoogleCloudVisionV1p3beta1Position {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1Position = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1Position]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1PositionMutableBuilder[Self <: SchemaGoogleCloudVisionV1p3beta1Position] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    @scala.inline
    def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZUndefined: Self = StObject.set(x, "z", js.undefined)
  }
}
