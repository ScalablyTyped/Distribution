package typings.googleapis.servicebrokerV1alpha1Mod.servicebrokerV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response for the `DeleteBinding()` method.
  */
trait SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse extends StObject {
  
  /**
    * Used to communicate description of the response. Usually for non-standard
    * error codes.
    * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * If broker executes operation asynchronously, this is the operation ID
    * that can be polled to check the completion status of said operation.
    */
  var operation: js.UndefOr[String] = js.undefined
}
object SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse {
  
  @scala.inline
  def apply(): SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse]
  }
  
  @scala.inline
  implicit class SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponseMutableBuilder[Self <: SchemaGoogleCloudServicebrokerV1alpha1DeleteBindingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setOperation(value: String): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
  }
}
