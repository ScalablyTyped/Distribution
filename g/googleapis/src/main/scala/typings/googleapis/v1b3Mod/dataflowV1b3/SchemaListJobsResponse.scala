package typings.googleapis.v1b3Mod.dataflowV1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response to a request to list Cloud Dataflow jobs.  This may be a partial
  * response, depending on the page size in the ListJobsRequest.
  */
@js.native
trait SchemaListJobsResponse extends js.Object {
  
  /**
    * Zero or more messages describing the [regional endpoints]
    * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
    * failed to respond.
    */
  var failedLocation: js.UndefOr[js.Array[SchemaFailedLocation]] = js.native
  
  /**
    * A subset of the requested job information.
    */
  var jobs: js.UndefOr[js.Array[SchemaJob]] = js.native
  
  /**
    * Set if there may be more results than fit in this response.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object SchemaListJobsResponse {
  
  @scala.inline
  def apply(): SchemaListJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListJobsResponse]
  }
  
  @scala.inline
  implicit class SchemaListJobsResponseOps[Self <: SchemaListJobsResponse] (val x: Self) extends AnyVal {
    
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
    def setFailedLocationVarargs(value: SchemaFailedLocation*): Self = this.set("failedLocation", js.Array(value :_*))
    
    @scala.inline
    def setFailedLocation(value: js.Array[SchemaFailedLocation]): Self = this.set("failedLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedLocation: Self = this.set("failedLocation", js.undefined)
    
    @scala.inline
    def setJobsVarargs(value: SchemaJob*): Self = this.set("jobs", js.Array(value :_*))
    
    @scala.inline
    def setJobs(value: js.Array[SchemaJob]): Self = this.set("jobs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJobs: Self = this.set("jobs", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
