package typings.googleapis.storagetransferV1Mod.storagetransferV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response from ListTransferJobs.
  */
@js.native
trait SchemaListTransferJobsResponse extends StObject {
  
  /**
    * The list next page token.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /**
    * A list of transfer jobs.
    */
  var transferJobs: js.UndefOr[js.Array[SchemaTransferJob]] = js.native
}
object SchemaListTransferJobsResponse {
  
  @scala.inline
  def apply(): SchemaListTransferJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListTransferJobsResponse]
  }
  
  @scala.inline
  implicit class SchemaListTransferJobsResponseMutableBuilder[Self <: SchemaListTransferJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTransferJobs(value: js.Array[SchemaTransferJob]): Self = StObject.set(x, "transferJobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferJobsUndefined: Self = StObject.set(x, "transferJobs", js.undefined)
    
    @scala.inline
    def setTransferJobsVarargs(value: SchemaTransferJob*): Self = StObject.set(x, "transferJobs", js.Array(value :_*))
  }
}
