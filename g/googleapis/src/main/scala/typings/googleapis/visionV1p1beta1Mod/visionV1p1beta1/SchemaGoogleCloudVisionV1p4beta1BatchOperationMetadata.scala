package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for the batch operations such as the current state.  This is
  * included in the `metadata` field of the `Operation` returned by the
  * `GetOperation` call of the `google::longrunning::Operations` service.
  */
@js.native
trait SchemaGoogleCloudVisionV1p4beta1BatchOperationMetadata extends StObject {
  
  /**
    * The time when the batch request is finished and
    * google.longrunning.Operation.done is set to true.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * The current state of the batch operation.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * The time when the batch request was submitted to the server.
    */
  var submitTime: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudVisionV1p4beta1BatchOperationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleCloudVisionV1p4beta1BatchOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p4beta1BatchOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudVisionV1p4beta1BatchOperationMetadataMutableBuilder[Self <: SchemaGoogleCloudVisionV1p4beta1BatchOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSubmitTime(value: String): Self = StObject.set(x, "submitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmitTimeUndefined: Self = StObject.set(x, "submitTime", js.undefined)
  }
}
