package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the metadata of the long-running operation.
  */
@js.native
trait SchemaGoogleCloudMlV1OperationMetadata extends js.Object {
  
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
  implicit class SchemaGoogleCloudMlV1OperationMetadataOps[Self <: SchemaGoogleCloudMlV1OperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setIsCancellationRequested(value: Boolean): Self = this.set("isCancellationRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsCancellationRequested: Self = this.set("isCancellationRequested", js.undefined)
    
    @scala.inline
    def setLabels(value: StringDictionary[String]): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setModelName(value: String): Self = this.set("modelName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModelName: Self = this.set("modelName", js.undefined)
    
    @scala.inline
    def setOperationType(value: String): Self = this.set("operationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationType: Self = this.set("operationType", js.undefined)
    
    @scala.inline
    def setProjectNumber(value: String): Self = this.set("projectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectNumber: Self = this.set("projectNumber", js.undefined)
    
    @scala.inline
    def setStartTime(value: String): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setVersion(value: SchemaGoogleCloudMlV1Version): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
