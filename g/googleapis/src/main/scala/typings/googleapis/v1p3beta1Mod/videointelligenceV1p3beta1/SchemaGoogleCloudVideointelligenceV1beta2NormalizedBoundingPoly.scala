package typings.googleapis.v1p3beta1Mod.videointelligenceV1p3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Normalized bounding polygon for text (that might not be aligned with axis).
  * Contains list of the corner points in clockwise order starting from
  * top-left corner. For example, for a rectangular bounding box: When the text
  * is horizontal it might look like:         0----1         |    | 3----2 When
  * it&#39;s clockwise rotated 180 degrees around the top-left corner it
  * becomes:         2----3         |    |         1----0  and the vertex order
  * will still be (0, 1, 2, 3). Note that values can be less than 0, or greater
  * than 1 due to trignometric calculations for location of the box.
  */
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
    
    inline def setVerticesVarargs(value: SchemaGoogleCloudVideointelligenceV1beta2NormalizedVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
