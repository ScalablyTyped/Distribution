package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBoundingPoly extends StObject {
  
  /**
    * The bounding polygon normalized vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[SchemaNormalizedVertex]] = js.undefined
  
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[SchemaVertex]] = js.undefined
}
object SchemaBoundingPoly {
  
  inline def apply(): SchemaBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBoundingPoly]
  }
  
  extension [Self <: SchemaBoundingPoly](x: Self) {
    
    inline def setNormalizedVertices(value: js.Array[SchemaNormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    inline def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    inline def setNormalizedVerticesVarargs(value: SchemaNormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value*))
    
    inline def setVertices(value: js.Array[SchemaVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: SchemaVertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
