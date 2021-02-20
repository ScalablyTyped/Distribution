package typings.googleapis.redisV1beta1Mod.redisV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the metadata of the long-running operation.
  */
@js.native
trait SchemaGoogleCloudCommonOperationMetadata extends StObject {
  
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
object SchemaGoogleCloudCommonOperationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleCloudCommonOperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudCommonOperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudCommonOperationMetadataMutableBuilder[Self <: SchemaGoogleCloudCommonOperationMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setCancelRequested(value: Boolean): Self = StObject.set(x, "cancelRequested", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelRequestedUndefined: Self = StObject.set(x, "cancelRequested", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    @scala.inline
    def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStatusDetail(value: String): Self = StObject.set(x, "statusDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetailUndefined: Self = StObject.set(x, "statusDetail", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
  }
}
