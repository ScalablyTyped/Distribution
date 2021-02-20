package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing findings.
  */
@js.native
trait SchemaListFindingsResponse extends StObject {
  
  /**
    * Findings matching the list request.
    */
  var listFindingsResults: js.UndefOr[js.Array[SchemaListFindingsResult]] = js.native
  
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
    * The total number of findings matching the query.
    */
  var totalSize: js.UndefOr[Double] = js.native
}
object SchemaListFindingsResponse {
  
  @scala.inline
  def apply(): SchemaListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFindingsResponse]
  }
  
  @scala.inline
  implicit class SchemaListFindingsResponseMutableBuilder[Self <: SchemaListFindingsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setListFindingsResults(value: js.Array[SchemaListFindingsResult]): Self = StObject.set(x, "listFindingsResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListFindingsResultsUndefined: Self = StObject.set(x, "listFindingsResults", js.undefined)
    
    @scala.inline
    def setListFindingsResultsVarargs(value: SchemaListFindingsResult*): Self = StObject.set(x, "listFindingsResults", js.Array(value :_*))
    
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
