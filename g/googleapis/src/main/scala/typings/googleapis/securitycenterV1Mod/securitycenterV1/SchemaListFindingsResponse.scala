package typings.googleapis.securitycenterV1Mod.securitycenterV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaListFindingsResponse extends StObject {
  
  /**
    * Findings matching the list request.
    */
  var listFindingsResults: js.UndefOr[js.Array[SchemaListFindingsResult]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more results.
    */
  var nextPageToken: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Time used for executing the list request.
    */
  var readTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The total number of findings matching the query.
    */
  var totalSize: js.UndefOr[Double | Null] = js.undefined
}
object SchemaListFindingsResponse {
  
  inline def apply(): SchemaListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFindingsResponse]
  }
  
  extension [Self <: SchemaListFindingsResponse](x: Self) {
    
    inline def setListFindingsResults(value: js.Array[SchemaListFindingsResult]): Self = StObject.set(x, "listFindingsResults", value.asInstanceOf[js.Any])
    
    inline def setListFindingsResultsUndefined: Self = StObject.set(x, "listFindingsResults", js.undefined)
    
    inline def setListFindingsResultsVarargs(value: SchemaListFindingsResult*): Self = StObject.set(x, "listFindingsResults", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenNull: Self = StObject.set(x, "nextPageToken", null)
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeNull: Self = StObject.set(x, "readTime", null)
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeNull: Self = StObject.set(x, "totalSize", null)
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
