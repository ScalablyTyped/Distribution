package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResult extends StObject {
  
  /**
    * The bounding polygon around the product detected in the query image.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p1beta1BoundingPoly] = js.undefined
  
  /**
    * List of generic predictions for the object in the bounding box.
    */
  var objectAnnotations: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsObjectAnnotation]] = js.undefined
  
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult]] = js.undefined
}
object SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResult {
  
  inline def apply(): SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResult]
  }
  
  extension [Self <: SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsGroupedResult](x: Self) {
    
    inline def setBoundingPoly(value: SchemaGoogleCloudVisionV1p1beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    inline def setObjectAnnotations(value: js.Array[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsObjectAnnotation]): Self = StObject.set(x, "objectAnnotations", value.asInstanceOf[js.Any])
    
    inline def setObjectAnnotationsUndefined: Self = StObject.set(x, "objectAnnotations", js.undefined)
    
    inline def setObjectAnnotationsVarargs(value: SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsObjectAnnotation*): Self = StObject.set(x, "objectAnnotations", js.Array(value*))
    
    inline def setResults(value: js.Array[SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setResultsVarargs(value: SchemaGoogleCloudVisionV1p1beta1ProductSearchResultsResult*): Self = StObject.set(x, "results", js.Array(value*))
  }
}
