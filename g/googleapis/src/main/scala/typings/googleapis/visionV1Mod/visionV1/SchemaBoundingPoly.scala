package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bounding polygon for the detected image annotation.
  */
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
  
  @scala.inline
  def apply(): SchemaBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBoundingPoly]
  }
  
  @scala.inline
  implicit class SchemaBoundingPolyMutableBuilder[Self <: SchemaBoundingPoly] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNormalizedVertices(value: js.Array[SchemaNormalizedVertex]): Self = StObject.set(x, "normalizedVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormalizedVerticesUndefined: Self = StObject.set(x, "normalizedVertices", js.undefined)
    
    @scala.inline
    def setNormalizedVerticesVarargs(value: SchemaNormalizedVertex*): Self = StObject.set(x, "normalizedVertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[SchemaVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: SchemaVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
