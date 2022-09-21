package typings.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerrainMesh extends StObject {
  
  var indexBuffer: IndexBuffer
  
  var segments: SegmentVector
  
  var vertexBuffer: VertexBuffer
}
object TerrainMesh {
  
  inline def apply(indexBuffer: IndexBuffer, segments: SegmentVector, vertexBuffer: VertexBuffer): TerrainMesh = {
    val __obj = js.Dynamic.literal(indexBuffer = indexBuffer.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], vertexBuffer = vertexBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerrainMesh]
  }
  
  extension [Self <: TerrainMesh](x: Self) {
    
    inline def setIndexBuffer(value: IndexBuffer): Self = StObject.set(x, "indexBuffer", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: SegmentVector): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setVertexBuffer(value: VertexBuffer): Self = StObject.set(x, "vertexBuffer", value.asInstanceOf[js.Any])
  }
}
