package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from ListTransferJobs.
  */
trait SchemaListTransferJobsResponse extends StObject {
  
  /**
    * The list next page token.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of transfer jobs.
    */
  var transferJobs: js.UndefOr[js.Array[SchemaTransferJob]] = js.undefined
}
object SchemaListTransferJobsResponse {
  
  inline def apply(): SchemaListTransferJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTransferJobsResponse]
  }
  
  extension [Self <: SchemaListTransferJobsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTransferJobs(value: js.Array[SchemaTransferJob]): Self = StObject.set(x, "transferJobs", value.asInstanceOf[js.Any])
    
    inline def setTransferJobsUndefined: Self = StObject.set(x, "transferJobs", js.undefined)
    
    inline def setTransferJobsVarargs(value: SchemaTransferJob*): Self = StObject.set(x, "transferJobs", js.Array(value :_*))
  }
}
