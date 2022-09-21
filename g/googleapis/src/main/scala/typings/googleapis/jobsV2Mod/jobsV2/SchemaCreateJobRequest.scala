package typings.googleapis.jobsV2Mod.jobsV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCreateJobRequest extends StObject {
  
  /**
    * Deprecated. Please use processing_options. This flag is ignored if processing_options is set. Optional. If set to `true`, the service does not attempt to resolve a more precise address for the job.
    */
  var disableStreetAddressResolution: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Required. The Job to be created.
    */
  var job: js.UndefOr[SchemaJob] = js.undefined
  
  /**
    * Optional. Options for job processing.
    */
  var processingOptions: js.UndefOr[SchemaJobProcessingOptions] = js.undefined
}
object SchemaCreateJobRequest {
  
  inline def apply(): SchemaCreateJobRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCreateJobRequest]
  }
  
  extension [Self <: SchemaCreateJobRequest](x: Self) {
    
    inline def setDisableStreetAddressResolution(value: Boolean): Self = StObject.set(x, "disableStreetAddressResolution", value.asInstanceOf[js.Any])
    
    inline def setDisableStreetAddressResolutionNull: Self = StObject.set(x, "disableStreetAddressResolution", null)
    
    inline def setDisableStreetAddressResolutionUndefined: Self = StObject.set(x, "disableStreetAddressResolution", js.undefined)
    
    inline def setJob(value: SchemaJob): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    inline def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
    
    inline def setProcessingOptions(value: SchemaJobProcessingOptions): Self = StObject.set(x, "processingOptions", value.asInstanceOf[js.Any])
    
    inline def setProcessingOptionsUndefined: Self = StObject.set(x, "processingOptions", js.undefined)
  }
}
