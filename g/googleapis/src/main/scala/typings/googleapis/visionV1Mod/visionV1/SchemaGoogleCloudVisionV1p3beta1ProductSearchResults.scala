package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Results for a product search request.
  */
@js.native
trait SchemaGoogleCloudVisionV1p3beta1ProductSearchResults extends js.Object {
  
  /**
    * Timestamp of the index which provided these results. Changes made after
    * this time are not reflected in the current results.
    */
  var indexTime: js.UndefOr[String] = js.native
  
  /**
    * List of results grouped by products detected in the query image. Each
    * entry corresponds to one bounding polygon in the query image, and
    * contains the matching products specific to that region. There may be
    * duplicate product matches in the union of all the per-product results.
    */
  var productGroupedResults: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult]] = js.native
  
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsResult]] = js.native
}
object SchemaGoogleCloudVisionV1p3beta1ProductSearchResults {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p3beta1ProductSearchResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p3beta1ProductSearchResults]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsOps[Self <: SchemaGoogleCloudVisionV1p3beta1ProductSearchResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndexTime(value: String): Self = this.set("indexTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexTime: Self = this.set("indexTime", js.undefined)
    
    @scala.inline
    def setProductGroupedResultsVarargs(value: SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult*): Self = this.set("productGroupedResults", js.Array(value :_*))
    
    @scala.inline
    def setProductGroupedResults(value: js.Array[SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsGroupedResult]): Self = this.set("productGroupedResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductGroupedResults: Self = this.set("productGroupedResults", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsResult*): Self = this.set("results", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[SchemaGoogleCloudVisionV1p3beta1ProductSearchResultsResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
}
