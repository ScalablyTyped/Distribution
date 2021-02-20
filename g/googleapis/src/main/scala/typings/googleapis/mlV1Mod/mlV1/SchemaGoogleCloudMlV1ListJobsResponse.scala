package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for the ListJobs method.
  */
@js.native
trait SchemaGoogleCloudMlV1ListJobsResponse extends StObject {
  
  /**
    * The list of jobs.
    */
  var jobs: js.UndefOr[js.Array[SchemaGoogleCloudMlV1Job]] = js.native
  
  /**
    * Optional. Pass this token as the `page_token` field of the request for a
    * subsequent call.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudMlV1ListJobsResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1ListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1ListJobsResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1ListJobsResponseMutableBuilder[Self <: SchemaGoogleCloudMlV1ListJobsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobs(value: js.Array[SchemaGoogleCloudMlV1Job]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobsUndefined: Self = StObject.set(x, "jobs", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: SchemaGoogleCloudMlV1Job*): Self = StObject.set(x, "jobs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
