package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Request to set operation status. Should only be used by VMs created by the
  * Pipelines Service and not by end users.
  */
@js.native
trait SchemaSetOperationStatusRequest extends StObject {
  
  var errorCode: js.UndefOr[String] = js.native
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var operationId: js.UndefOr[String] = js.native
  
  var timestampEvents: js.UndefOr[js.Array[SchemaTimestampEvent]] = js.native
  
  var validationToken: js.UndefOr[String] = js.native
}
object SchemaSetOperationStatusRequest {
  
  @scala.inline
  def apply(): SchemaSetOperationStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSetOperationStatusRequest]
  }
  
  @scala.inline
  implicit class SchemaSetOperationStatusRequestMutableBuilder[Self <: SchemaSetOperationStatusRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    @scala.inline
    def setTimestampEvents(value: js.Array[SchemaTimestampEvent]): Self = StObject.set(x, "timestampEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampEventsUndefined: Self = StObject.set(x, "timestampEvents", js.undefined)
    
    @scala.inline
    def setTimestampEventsVarargs(value: SchemaTimestampEvent*): Self = StObject.set(x, "timestampEvents", js.Array(value :_*))
    
    @scala.inline
    def setValidationToken(value: String): Self = StObject.set(x, "validationToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationTokenUndefined: Self = StObject.set(x, "validationToken", js.undefined)
  }
}
