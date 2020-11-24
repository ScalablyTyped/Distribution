package typings.googleapis.jobsV2Mod.jobsV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Create job request.
  */
@js.native
trait SchemaCreateJobRequest extends js.Object {
  
  /**
    * Deprecated. Please use processing_options. This flag is ignored if
    * processing_options is set.  Optional.  If set to `true`, the service does
    * not attempt to resolve a more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.native
  
  /**
    * Required.  The Job to be created.
    */
  var job: js.UndefOr[SchemaJob] = js.native
  
  /**
    * Optional.  Options for job processing.
    */
  var processingOptions: js.UndefOr[SchemaJobProcessingOptions] = js.native
}
object SchemaCreateJobRequest {
  
  @scala.inline
  def apply(): SchemaCreateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateJobRequest]
  }
  
  @scala.inline
  implicit class SchemaCreateJobRequestOps[Self <: SchemaCreateJobRequest] (val x: Self) extends AnyVal {
    
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
    def setDisableStreetAddressResolution(value: Boolean): Self = this.set("disableStreetAddressResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableStreetAddressResolution: Self = this.set("disableStreetAddressResolution", js.undefined)
    
    @scala.inline
    def setJob(value: SchemaJob): Self = this.set("job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJob: Self = this.set("job", js.undefined)
    
    @scala.inline
    def setProcessingOptions(value: SchemaJobProcessingOptions): Self = this.set("processingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingOptions: Self = this.set("processingOptions", js.undefined)
  }
}
