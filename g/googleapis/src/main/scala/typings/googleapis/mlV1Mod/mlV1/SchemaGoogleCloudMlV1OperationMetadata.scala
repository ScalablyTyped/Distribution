package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the metadata of the long-running operation.
  */
@js.native
trait SchemaGoogleCloudMlV1OperationMetadata extends StObject {
  
  /**
    * The time the operation was submitted.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The time operation processing completed.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether a request to cancel this operation has been made.
    */
  var isCancellationRequested: js.UndefOr[Boolean] = js.native
  
  /**
    * The user labels, inherited from the model or the model version being
    * operated on.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Contains the name of the model associated with the operation.
    */
  var modelName: js.UndefOr[String] = js.native
  
  /**
    * The operation type.
    */
  var operationType: js.UndefOr[String] = js.native
  
  /**
    * Contains the project number associated with the operation.
    */
  var projectNumber: js.UndefOr[String] = js.native
  
  /**
    * The time operation processing started.
    */
  var startTime: js.UndefOr[String] = js.native
  
  /**
    * Contains the version associated with the operation.
    */
  var version: js.UndefOr[SchemaGoogleCloudMlV1Version] = js.native
}
object SchemaGoogleCloudMlV1OperationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleCloudMlV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudMlV1OperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudMlV1OperationMetadataMutableBuilder[Self <: SchemaGoogleCloudMlV1OperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setIsCancellationRequested(value: Boolean): Self = StObject.set(x, "isCancellationRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCancellationRequestedUndefined: Self = StObject.set(x, "isCancellationRequested", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    @scala.inline
    def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setVersion(value: SchemaGoogleCloudMlV1Version): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
