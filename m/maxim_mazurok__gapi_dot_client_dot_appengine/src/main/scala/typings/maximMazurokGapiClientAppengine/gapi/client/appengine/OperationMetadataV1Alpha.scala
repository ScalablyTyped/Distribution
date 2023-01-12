package typings.maximMazurokGapiClientAppengine.gapi.client.appengine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationMetadataV1Alpha extends StObject {
  
  var createVersionMetadata: js.UndefOr[CreateVersionMetadataV1Alpha] = js.undefined
  
  /** Time that this operation completed.@OutputOnly */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Ephemeral message that may change every time the operation is polled. @OutputOnly */
  var ephemeralMessage: js.UndefOr[String] = js.undefined
  
  /** Time that this operation was created.@OutputOnly */
  var insertTime: js.UndefOr[String] = js.undefined
  
  /** API method that initiated this operation. Example: google.appengine.v1alpha.Versions.CreateVersion.@OutputOnly */
  var method: js.UndefOr[String] = js.undefined
  
  /** Name of the resource that this operation is acting on. Example: apps/myapp/services/default.@OutputOnly */
  var target: js.UndefOr[String] = js.undefined
  
  /** User who requested this operation.@OutputOnly */
  var user: js.UndefOr[String] = js.undefined
  
  /** Durable messages that persist on every operation poll. @OutputOnly */
  var warning: js.UndefOr[js.Array[String]] = js.undefined
}
object OperationMetadataV1Alpha {
  
  inline def apply(): OperationMetadataV1Alpha = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadataV1Alpha]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationMetadataV1Alpha] (val x: Self) extends AnyVal {
    
    inline def setCreateVersionMetadata(value: CreateVersionMetadataV1Alpha): Self = StObject.set(x, "createVersionMetadata", value.asInstanceOf[js.Any])
    
    inline def setCreateVersionMetadataUndefined: Self = StObject.set(x, "createVersionMetadata", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEphemeralMessage(value: String): Self = StObject.set(x, "ephemeralMessage", value.asInstanceOf[js.Any])
    
    inline def setEphemeralMessageUndefined: Self = StObject.set(x, "ephemeralMessage", js.undefined)
    
    inline def setInsertTime(value: String): Self = StObject.set(x, "insertTime", value.asInstanceOf[js.Any])
    
    inline def setInsertTimeUndefined: Self = StObject.set(x, "insertTime", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    
    inline def setWarning(value: js.Array[String]): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    
    inline def setWarningVarargs(value: String*): Self = StObject.set(x, "warning", js.Array(value*))
  }
}
