package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about the products similar to a single product in a query
  * image.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsGroupedResult extends StObject {
  
  /**
    * The bounding polygon around the product detected in the query image.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p4beta1BoundingPoly] = js.native
  
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsResult]] = js.native
}
object SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsGroupedResult {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsGroupedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsGroupedResult]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsGroupedResultMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsGroupedResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBoundingPoly(value: SchemaGoogleCloudVisionV1p4beta1BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    @scala.inline
    def setResults(value: js.Array[SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaGoogleCloudVisionV1p4beta1ProductSearchResultsResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
