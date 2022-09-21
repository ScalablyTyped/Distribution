package typings.googleapis.polyV1Mod.polyV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaFormatComplexity extends StObject {
  
  /**
    * A non-negative integer that represents the level of detail (LOD) of this format relative to other formats of the same asset with the same format_type. This hint allows you to sort formats from the most-detailed (0) to least-detailed (integers greater than 0).
    */
  var lodHint: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The estimated number of triangles.
    */
  var triangleCount: js.UndefOr[String | Null] = js.undefined
}
object SchemaFormatComplexity {
  
  inline def apply(): SchemaFormatComplexity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFormatComplexity]
  }
  
  extension [Self <: SchemaFormatComplexity](x: Self) {
    
    inline def setLodHint(value: Double): Self = StObject.set(x, "lodHint", value.asInstanceOf[js.Any])
    
    inline def setLodHintNull: Self = StObject.set(x, "lodHint", null)
    
    inline def setLodHintUndefined: Self = StObject.set(x, "lodHint", js.undefined)
    
    inline def setTriangleCount(value: String): Self = StObject.set(x, "triangleCount", value.asInstanceOf[js.Any])
    
    inline def setTriangleCountNull: Self = StObject.set(x, "triangleCount", null)
    
    inline def setTriangleCountUndefined: Self = StObject.set(x, "triangleCount", js.undefined)
  }
}
