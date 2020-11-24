package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. Use BatchDeleteJobsRequest instead.  Input only.  Delete job by
  * filter request.  The job typically becomes unsearchable within 10 seconds,
  * but it may take up to 5 minutes.
  */
@js.native
trait SchemaDeleteJobsByFilterRequest extends js.Object {
  
  /**
    * Optional.  If set to true, this call waits for all processing steps to
    * complete before the job is cleaned up. Otherwise, the call returns while
    * some steps are still taking place asynchronously, hence faster.
    */
  var disableFastProcess: js.UndefOr[Boolean] = js.native
  
  /**
    * Required.  Restrictions on the scope of the delete request.
    */
  var filter: js.UndefOr[SchemaFilter] = js.native
}
object SchemaDeleteJobsByFilterRequest {
  
  @scala.inline
  def apply(): SchemaDeleteJobsByFilterRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeleteJobsByFilterRequest]
  }
  
  @scala.inline
  implicit class SchemaDeleteJobsByFilterRequestOps[Self <: SchemaDeleteJobsByFilterRequest] (val x: Self) extends AnyVal {
    
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
    def setDisableFastProcess(value: Boolean): Self = this.set("disableFastProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableFastProcess: Self = this.set("disableFastProcess", js.undefined)
    
    @scala.inline
    def setFilter(value: SchemaFilter): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
  }
}
