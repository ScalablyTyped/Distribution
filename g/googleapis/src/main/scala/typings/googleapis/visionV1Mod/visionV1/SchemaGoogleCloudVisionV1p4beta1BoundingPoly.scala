package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bounding polygon for the detected image annotation.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1BoundingPoly extends StObject {
  
  /**
    * The bounding polygon normalized vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1NormalizedVertex]] = js.native
  
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1Vertex]] = js.native
}
object SchemaGoogleCloudVisionV1p4beta1BoundingPoly {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1BoundingPoly]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1BoundingPolyMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1BoundingPoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalizedVertices(value: js.Array[SchemaGoogleCloudVisionV1p4beta1NormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    @scala.inline
    def setNormalizedVerticesVarargs(value: SchemaGoogleCloudVisionV1p4beta1NormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[SchemaGoogleCloudVisionV1p4beta1Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: SchemaGoogleCloudVisionV1p4beta1Vertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
