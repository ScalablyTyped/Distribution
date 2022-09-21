package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTriangleStrip extends StObject {
  
  /**
    * Index into the vertex_offset array representing the next vertex in the triangle strip.
    */
  var vertexIndices: js.UndefOr[js.Array[Double] | Null] = js.undefined
}
object SchemaTriangleStrip {
  
  inline def apply(): SchemaTriangleStrip = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTriangleStrip]
  }
  
  extension [Self <: SchemaTriangleStrip](x: Self) {
    
    inline def setVertexIndices(value: js.Array[Double]): Self = StObject.set(x, "vertexIndices", value.asInstanceOf[js.Any])
    
    inline def setVertexIndicesNull: Self = StObject.set(x, "vertexIndices", null)
    
    inline def setVertexIndicesUndefined: Self = StObject.set(x, "vertexIndices", js.undefined)
    
    inline def setVertexIndicesVarargs(value: Double*): Self = StObject.set(x, "vertexIndices", js.Array(value*))
  }
}
