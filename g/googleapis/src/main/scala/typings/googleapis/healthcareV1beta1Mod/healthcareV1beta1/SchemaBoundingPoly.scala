package typings.googleapis.healthcareV1beta1Mod.healthcareV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBoundingPoly extends StObject {
  
  /**
    * A description of this polygon.
    */
  var label: js.UndefOr[String | Null] = js.undefined
  
  /**
    * List of the vertices of this polygon.
    */
  var vertices: js.UndefOr[js.Array[SchemaVertex]] = js.undefined
}
object SchemaBoundingPoly {
  
  inline def apply(): SchemaBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBoundingPoly]
  }
  
  extension [Self <: SchemaBoundingPoly](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setVertices(value: js.Array[SchemaVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: SchemaVertex*): Self = StObject.set(x, "vertices", js.Array(value*))
  }
}
