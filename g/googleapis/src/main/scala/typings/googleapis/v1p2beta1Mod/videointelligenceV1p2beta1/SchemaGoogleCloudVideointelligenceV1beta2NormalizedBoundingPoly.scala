package typings.googleapis.v1p2beta1Mod.videointelligenceV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly extends StObject {
  
  /**
    * Normalized vertices of the bounding polygon.
    */
  var vertices: js.UndefOr[js.Array[SchemaGoogleCloudVideointelligenceV1beta2NormalizedVertex]] = js.undefined
}
object SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly {
  
  inline def apply(): SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly]
  }
  
  extension [Self <: SchemaGoogleCloudVideointelligenceV1beta2NormalizedBoundingPoly](x: Self) {
    
    inline def setVertices(value: js.Array[SchemaGoogleCloudVideointelligenceV1beta2NormalizedVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2NormalizedVertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
