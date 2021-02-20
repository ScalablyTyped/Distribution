package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Deprecated. Use BatchDeleteJobsRequest instead.  Input only.  Delete job by
  * filter request.  The job typically becomes unsearchable within 10 seconds,
  * but it may take up to 5 minutes.
  */
@js.native
trait SchemaDeleteJobsByFilterRequest extends StObject {
  
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
  implicit class SchemaDeleteJobsByFilterRequestMutableBuilder[Self <: SchemaDeleteJobsByFilterRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableFastProcess(value: Boolean): Self = StObject.set(x, "disableFastProcess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableFastProcessUndefined: Self = StObject.set(x, "disableFastProcess", js.undefined)
    
    @scala.inline
    def setFilter(value: SchemaFilter): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
