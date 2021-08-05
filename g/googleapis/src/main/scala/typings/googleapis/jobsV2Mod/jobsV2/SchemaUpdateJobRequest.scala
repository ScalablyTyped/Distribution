package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Input only.  Update job request.
  */
trait SchemaUpdateJobRequest extends StObject {
  
  /**
    * Deprecated. Please use processing_options. This flag is ignored if
    * processing_options is set.  Optional.  If set to `true`, the service does
    * not attempt resolve a more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Required.  The Job to be updated.
    */
  var job: js.UndefOr[SchemaJob] = js.undefined
  
  /**
    * Optional.  Options for job processing.
    * UpdateJobRequest.disable_street_address_resolution is ignored if this
    * flag is set.
    */
  var processingOptions: js.UndefOr[SchemaJobProcessingOptions] = js.undefined
  
  /**
    * Optional but strongly recommended to be provided for the best service
    * experience.  If update_job_fields is provided, only the specified fields
    * in job are updated. Otherwise all the fields are updated.  A field mask
    * to restrict the fields that are updated. Valid values are:  * jobTitle *
    * employmentTypes * description * applicationUrls * applicationEmailList *
    * applicationInstruction * responsibilities * qualifications *
    * educationLevels * level * department * startDate * endDate *
    * compensationInfo * incentives * languageCode * benefits * expireTime *
    * customAttributes * visibility * publishDate * promotionValue * locations
    * * region * expiryDate (deprecated) * filterableCustomFields (deprecated)
    * * unindexedCustomFields (deprecated)
    */
  var updateJobFields: js.UndefOr[String] = js.undefined
}
object SchemaUpdateJobRequest {
  
  inline def apply(): SchemaUpdateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaUpdateJobRequest]
  }
  
  extension [Self <: SchemaUpdateJobRequest](x: Self) {
    
    inline def setDisableStreetAddressResolution(value: Boolean): Self = StObject.set(x, "disableStreetAddressResolution", value.asInstanceOf[js.Any])
    
    inline def setDisableStreetAddressResolutionUndefined: Self = StObject.set(x, "disableStreetAddressResolution", js.undefined)
    
    inline def setJob(value: SchemaJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    inline def setProcessingOptions(value: SchemaJobProcessingOptions): Self = StObject.set(x, "processingOptions", value.asInstanceOf[js.Any])
    
    inline def setProcessingOptionsUndefined: Self = StObject.set(x, "processingOptions", js.undefined)
    
    inline def setUpdateJobFields(value: String): Self = StObject.set(x, "updateJobFields", value.asInstanceOf[js.Any])
    
    inline def setUpdateJobFieldsUndefined: Self = StObject.set(x, "updateJobFields", js.undefined)
  }
}
