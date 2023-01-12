package typings.maximMazurokGapiClientDataproc.gapi.client.dataproc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOperation extends StObject {
  
  /** Output only. Indicates the operation is done. */
  var done: js.UndefOr[Boolean] = js.undefined
  
  /** Output only. Error, if operation failed. */
  var error: js.UndefOr[String] = js.undefined
  
  /** Output only. The id of the cluster operation. */
  var operationId: js.UndefOr[String] = js.undefined
}
object ClusterOperation {
  
  inline def apply(): ClusterOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterOperation] (val x: Self) extends AnyVal {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
