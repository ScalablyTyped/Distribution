package typings.googleapis.tpuV1Mod.tpuV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the metadata of the long-running operation.
  */
@js.native
trait SchemaOperationMetadata extends js.Object {
  
  /**
    * [Output only] API version used to start the operation.
    */
  var apiVersion: js.UndefOr[String] = js.native
  
  /**
    * [Output only] Identifies whether the user has requested cancellation of
    * the operation. Operations that have successfully been cancelled have
    * Operation.error value with a google.rpc.Status.code of 1, corresponding
    * to `Code.CANCELLED`.
    */
  var cancelRequested: js.UndefOr[Boolean] = js.native
  
  /**
    * [Output only] The time the operation was created.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * [Output only] The time the operation finished running.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * [Output only] Human-readable status of the operation, if any.
    */
  var statusDetail: js.UndefOr[String] = js.native
  
  /**
    * [Output only] Server-defined resource path for the target of the
    * operation.
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * [Output only] Name of the verb executed by the operation.
    */
  var verb: js.UndefOr[String] = js.native
}
object SchemaOperationMetadata {
  
  @scala.inline
  def apply(): SchemaOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaOperationMetadataOps[Self <: SchemaOperationMetadata] (val x: Self) extends AnyVal {
    
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
    def setApiVersion(value: String): Self = this.set("apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApiVersion: Self = this.set("apiVersion", js.undefined)
    
    @scala.inline
    def setCancelRequested(value: Boolean): Self = this.set("cancelRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancelRequested: Self = this.set("cancelRequested", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setStatusDetail(value: String): Self = this.set("statusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusDetail: Self = this.set("statusDetail", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setVerb(value: String): Self = this.set("verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerb: Self = this.set("verb", js.undefined)
  }
}
