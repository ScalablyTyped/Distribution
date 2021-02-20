package typings.googleapis.visionV1Mod.visionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Results for a product search request.
  */
@js.native
trait SchemaProductSearchResults extends StObject {
  
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
  var productGroupedResults: js.UndefOr[js.Array[SchemaGroupedResult]] = js.native
  
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[SchemaResult]] = js.native
}
object SchemaProductSearchResults {
  
  @scala.inline
  def apply(): SchemaProductSearchResults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaProductSearchResults]
  }
  
  @scala.inline
  implicit class SchemaProductSearchResultsMutableBuilder[Self <: SchemaProductSearchResults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexTime(value: String): Self = StObject.set(x, "indexTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexTimeUndefined: Self = StObject.set(x, "indexTime", js.undefined)
    
    @scala.inline
    def setProductGroupedResults(value: js.Array[SchemaGroupedResult]): Self = StObject.set(x, "productGroupedResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductGroupedResultsUndefined: Self = StObject.set(x, "productGroupedResults", js.undefined)
    
    @scala.inline
    def setProductGroupedResultsVarargs(value: SchemaGroupedResult*): Self = StObject.set(x, "productGroupedResults", js.Array(value :_*))
    
    @scala.inline
    def setResults(value: js.Array[SchemaResult]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setResultsVarargs(value: SchemaResult*): Self = StObject.set(x, "results", js.Array(value :_*))
  }
}
