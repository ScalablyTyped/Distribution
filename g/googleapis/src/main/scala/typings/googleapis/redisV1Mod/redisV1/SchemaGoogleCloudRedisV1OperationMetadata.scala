package typings.googleapis.redisV1Mod.redisV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the v1 metadata of the long-running operation.
  */
@js.native
trait SchemaGoogleCloudRedisV1OperationMetadata extends StObject {
  
  /**
    * API version.
    */
  var apiVersion: js.UndefOr[String] = js.native
  
  /**
    * Specifies if cancellation was requested for the operation.
    */
  var cancelRequested: js.UndefOr[Boolean] = js.native
  
  /**
    * Creation timestamp.
    */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * End timestamp.
    */
  var endTime: js.UndefOr[String] = js.native
  
  /**
    * Operation status details.
    */
  var statusDetail: js.UndefOr[String] = js.native
  
  /**
    * Operation target.
    */
  var target: js.UndefOr[String] = js.native
  
  /**
    * Operation verb.
    */
  var verb: js.UndefOr[String] = js.native
}
object SchemaGoogleCloudRedisV1OperationMetadata {
  
  @scala.inline
  def apply(): SchemaGoogleCloudRedisV1OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudRedisV1OperationMetadata]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudRedisV1OperationMetadataMutableBuilder[Self <: SchemaGoogleCloudRedisV1OperationMetadata] (val x: Self) extends AnyVal {
    
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
