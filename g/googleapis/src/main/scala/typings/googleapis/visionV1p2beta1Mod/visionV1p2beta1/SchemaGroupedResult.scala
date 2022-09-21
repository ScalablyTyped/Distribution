package typings.googleapis.visionV1p2beta1Mod.visionV1p2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGroupedResult extends StObject {
  
  /**
    * The bounding polygon around the product detected in the query image.
    */
  var boundingPoly: js.UndefOr[SchemaBoundingPoly] = js.undefined
  
  /**
    * List of generic predictions for the object in the bounding box.
    */
  var objectAnnotations: js.UndefOr[js.Array[SchemaObjectAnnotation]] = js.undefined
  
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[SchemaResult]] = js.undefined
}
object SchemaGroupedResult {
  
  inline def apply(): SchemaGroupedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupedResult]
  }
  
  extension [Self <: SchemaGroupedResult](x: Self) {
    
    inline def setBoundingPoly(value: SchemaBoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    inline def setObjectAnnotations(value: js.Array[SchemaObjectAnnotation]): Self = StObject.set(x, "objectAnnotations", value.asInstanceOf[js.Any])
    
    inline def setObjectAnnotationsUndefined: Self = StObject.set(x, "objectAnnotations", js.undefined)
    
    inline def setObjectAnnotationsVarargs(value: SchemaObjectAnnotation*): Self = StObject.set(x, "objectAnnotations", js.Array(value*))
    
    inline def setResults(value: js.Array[SchemaResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
