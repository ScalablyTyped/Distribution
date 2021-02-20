package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing assets.
  */
@js.native
trait SchemaListAssetsResponse extends StObject {
  
  /**
    * Assets matching the list request.
    */
  var listAssetsResults: js.UndefOr[js.Array[SchemaListAssetsResult]] = js.native
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * Time used for executing the list request.
    */
  var readTime: js.UndefOr[String] = js.native
  
  /**
    * The total number of assets matching the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}
object SchemaListAssetsResponse {
  
  @scala.inline
  def apply(): SchemaListAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListAssetsResponse]
  }
  
  @scala.inline
  implicit class SchemaListAssetsResponseMutableBuilder[Self <: SchemaListAssetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListAssetsResults(value: js.Array[SchemaListAssetsResult]): Self = StObject.set(x, "listAssetsResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListAssetsResultsUndefined: Self = StObject.set(x, "listAssetsResults", js.undefined)
    
    @scala.inline
    def setListAssetsResultsVarargs(value: SchemaListAssetsResult*): Self = StObject.set(x, "listAssetsResults", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    @scala.inline
    def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
