package typings.maximMazurokGapiClientComposer.gapi.client.composer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationMetadata extends StObject {
  
  /** Output only. The time the operation was submitted to the server. */
  var createTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The time when the operation terminated, regardless of its success. This field is unset if the operation is still ongoing. */
  var endTime: js.UndefOr[String] = js.undefined
  
  /** Output only. The type of operation being performed. */
  var operationType: js.UndefOr[String] = js.undefined
  
  /** Output only. The resource being operated on, as a [relative resource name]( /apis/design/resource_names#relative_resource_name). */
  var resource: js.UndefOr[String] = js.undefined
  
  /** Output only. The UUID of the resource being operated on. */
  var resourceUuid: js.UndefOr[String] = js.undefined
  
  /** Output only. The current operation state. */
  var state: js.UndefOr[String] = js.undefined
}
object OperationMetadata {
  
  inline def apply(): OperationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OperationMetadata] (val x: Self) extends AnyVal {
    
    inline def setCreateTime(value: String): Self = StObject.set(x, "createTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "createTime", js.undefined)
    
    inline def setEndTime(value: String): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setOperationType(value: String): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setResourceUuid(value: String): Self = StObject.set(x, "resourceUuid", value.asInstanceOf[js.Any])
    
    inline def setResourceUuidUndefined: Self = StObject.set(x, "resourceUuid", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
