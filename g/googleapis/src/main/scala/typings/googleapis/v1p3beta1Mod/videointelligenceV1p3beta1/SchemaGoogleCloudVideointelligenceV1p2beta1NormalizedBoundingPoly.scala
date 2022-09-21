package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingPoly extends StObject {
  
  /**
    * Normalized vertices of the bounding polygon.
    */
  var vertices: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedVertex]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingPoly {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingPoly]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedBoundingPoly](x: Self) {
    
    inline def setVertices(value: js.Array[SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: SchemaGoogleCloudVideointelligenceV1p2beta1NormalizedVertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
