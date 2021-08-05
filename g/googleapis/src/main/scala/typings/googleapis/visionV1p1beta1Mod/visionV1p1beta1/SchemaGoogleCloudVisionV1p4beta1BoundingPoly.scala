package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bounding polygon for the detected image annotation.
  */
trait SchemaGoogleCloudVisionV1p4beta1BoundingPoly extends StObject {
  
  /**
    * The bounding polygon normalized vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1NormalizedVertex]] = js.undefined
  
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1Vertex]] = js.undefined
}
object SchemaGoogleCloudVisionV1p4beta1BoundingPoly {
  
  inline def apply(): SchemaGoogleCloudVisionV1p4beta1BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1BoundingPoly]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p4beta1BoundingPoly](x: Self) {
    
    inline def setNormalizedVertices(value: js.Array[SchemaGoogleCloudVisionV1p4beta1NormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    inline def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    inline def setNormalizedVerticesVarargs(value: SchemaGoogleCloudVisionV1p4beta1NormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value :_*))
    
    inline def setVertices(value: js.Array[SchemaGoogleCloudVisionV1p4beta1Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: SchemaGoogleCloudVisionV1p4beta1Vertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
