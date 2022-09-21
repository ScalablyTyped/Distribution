package typings.googleapis.documentaiV1beta2Mod.documentaiV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1beta2BoundingPoly extends StObject {
  
  /**
    * The bounding polygon normalized vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta2NormalizedVertex]] = js.undefined
  
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1beta2Vertex]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1beta2BoundingPoly {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1beta2BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1beta2BoundingPoly]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1beta2BoundingPoly](x: Self) {
    
    inline def setNormalizedVertices(value: js.Array[SchemaGoogleCloudDocumentaiV1beta2NormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    inline def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    inline def setNormalizedVerticesVarargs(value: SchemaGoogleCloudDocumentaiV1beta2NormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value*))
    
    inline def setVertices(value: js.Array[SchemaGoogleCloudDocumentaiV1beta2Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: SchemaGoogleCloudDocumentaiV1beta2Vertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
