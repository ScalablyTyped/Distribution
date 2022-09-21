package typings.googleapis.videointelligenceV1p1beta1Mod.videointelligenceV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1NormalizedBoundingPoly extends StObject {
  
  /**
    * Normalized vertices of the bounding polygon.
    */
  var vertices: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1NormalizedVertex]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1NormalizedBoundingPoly {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1NormalizedBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1NormalizedBoundingPoly]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1NormalizedBoundingPoly](x: Self) {
    
    inline def setVertices(value: js.Array[SchemaGoogleCloudVideointelligenceV1NormalizedVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: SchemaGoogleCloudVideointelligenceV1NormalizedVertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
