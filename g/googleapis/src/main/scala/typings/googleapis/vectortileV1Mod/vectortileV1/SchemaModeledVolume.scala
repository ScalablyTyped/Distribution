package typings.googleapis.vectortileV1Mod.vectortileV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaModeledVolume extends StObject {
  
  /**
    * The triangle strips present in this mesh.
    */
  var strips: js.UndefOr[js.Array[SchemaTriangleStrip]] = js.undefined
  
  /**
    * The vertices present in the mesh defining the modeled volume.
    */
  var vertexOffsets: js.UndefOr[SchemaVertex3DList] = js.undefined
}
object SchemaModeledVolume {
  
  inline def apply(): SchemaModeledVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaModeledVolume]
  }
  
  extension [Self <: SchemaModeledVolume](x: Self) {
    
    inline def setStrips(value: js.Array[SchemaTriangleStrip]): Self = StObject.set(x, "strips", value.asInstanceOf[js.Any])
    
    inline def setStripsUndefined: Self = StObject.set(x, "strips", js.undefined)
    
    inline def setStripsVarargs(value: SchemaTriangleStrip*): Self = StObject.set(x, "strips", js.Array(value*))
    
    inline def setVertexOffsets(value: SchemaVertex3DList): Self = StObject.set(x, "vertexOffsets", value.asInstanceOf[js.Any])
    
    inline def setVertexOffsetsUndefined: Self = StObject.set(x, "vertexOffsets", js.undefined)
  }
}
