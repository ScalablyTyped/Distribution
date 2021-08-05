package typings.googleapis.healthcareV1alphaMod.healthcareV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bounding polygon for the detected image annotation.
  */
trait SchemaBoundingPoly extends StObject {
  
  var label: js.UndefOr[String] = js.undefined
  
  var vertices: js.UndefOr[js.Array[SchemaVertex]] = js.undefined
}
object SchemaBoundingPoly {
  
  inline def apply(): SchemaBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBoundingPoly]
  }
  
  extension [Self <: SchemaBoundingPoly](x: Self) {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setVertices(value: js.Array[SchemaVertex]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
    
    inline def setVerticesUndefined: Self = StObject.set(x, "vertices", js.undefined)
    
    inline def setVerticesVarargs(value: SchemaVertex*): Self = StObject.set(x, "vertices", js.Array(value :_*))
  }
}
