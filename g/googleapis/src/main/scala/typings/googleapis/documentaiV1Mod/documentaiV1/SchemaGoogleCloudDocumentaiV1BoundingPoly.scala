package typings.googleapis.documentaiV1Mod.documentaiV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudDocumentaiV1BoundingPoly extends StObject {
  
  /**
    * The bounding polygon normalized vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1NormalizedVertex]] = js.undefined
  
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[SchemaGoogleCloudDocumentaiV1Vertex]] = js.undefined
}
object SchemaGoogleCloudDocumentaiV1BoundingPoly {
  
  inline def apply(): SchemaGoogleCloudDocumentaiV1BoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudDocumentaiV1BoundingPoly]
  }
  
  extension [Self <: SchemaGoogleCloudDocumentaiV1BoundingPoly](x: Self) {
    
    inline def setNormalizedVertices(value: js.Array[SchemaGoogleCloudDocumentaiV1NormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    inline def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    inline def setNormalizedVerticesVarargs(value: SchemaGoogleCloudDocumentaiV1NormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value*))
    
    inline def setVertices(value: js.Array[SchemaGoogleCloudDocumentaiV1Vertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: SchemaGoogleCloudDocumentaiV1Vertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
