package typings.googleapis.securitycenterV1beta1Mod.securitycenterV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for listing findings.
  */
trait SchemaListFindingsResponse extends StObject {
  
  /**
    * Findings matching the list request.
    */
  var findings: js.UndefOr[js.Array[SchemaFinding]] = js.undefined
  
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * Time used for executing the list request.
    */
  var readTime: js.UndefOr[String] = js.undefined
  
  /**
    * The total number of findings matching the query.
    */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object SchemaListFindingsResponse {
  
  inline def apply(): SchemaListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListFindingsResponse]
  }
  
  extension [Self <: SchemaListFindingsResponse](x: Self) {
    
    inline def setFindings(value: js.Array[SchemaFinding]): Self = StObject.set(x, "findings", value.asInstanceOf[js.Any])
    
    inline def setFindingsUndefined: Self = StObject.set(x, "findings", js.undefined)
    
    inline def setFindingsVarargs(value: SchemaFinding*): Self = StObject.set(x, "findings", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
