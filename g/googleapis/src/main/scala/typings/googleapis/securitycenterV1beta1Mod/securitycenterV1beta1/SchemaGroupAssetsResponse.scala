package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for grouping by assets.
  */
trait SchemaGroupAssetsResponse extends StObject {
  
  /**
    * Group results. There exists an element for each existing unique
    * combination of property/values. The element contains a count for the
    * number of times those specific property/values appear.
    */
  var groupByResults: js.UndefOr[js.Array[SchemaGroupResult]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Time used for executing the groupBy request.
    */
  var readTime: js.UndefOr[String] = js.undefined
}
object SchemaGroupAssetsResponse {
  
  @scala.inline
  def apply(): SchemaGroupAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGroupAssetsResponse]
  }
  
  @scala.inline
  implicit class SchemaGroupAssetsResponseMutableBuilder[Self <: SchemaGroupAssetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupByResults(value: js.Array[SchemaGroupResult]): Self = StObject.set(x, "groupByResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupByResultsUndefined: Self = StObject.set(x, "groupByResults", js.undefined)
    
    @scala.inline
    def setGroupByResultsVarargs(value: SchemaGroupResult*): Self = StObject.set(x, "groupByResults", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
  }
}
