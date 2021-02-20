package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A vertex represents a 2D point in the image. NOTE: the vertex coordinates
  * are in the same scale as the original image.
  */
@js.native
trait SchemaGoogleCloudVisionV1p1beta1Vertex extends StObject {
  
  /**
    * X coordinate.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * Y coordinate.
    */
  var y: js.UndefOr[Double] = js.native
}
object SchemaGoogleCloudVisionV1p1beta1Vertex {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p1beta1Vertex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1Vertex]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p1beta1VertexMutableBuilder[Self <: SchemaGoogleCloudVisionV1p1beta1Vertex] (val x: Self) extends AnyVal {
    
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
