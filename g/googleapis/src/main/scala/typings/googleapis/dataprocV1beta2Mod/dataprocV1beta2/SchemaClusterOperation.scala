package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaClusterOperation extends StObject {
  
  /**
    * Output only. Indicates the operation is done.
    */
  var done: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Output only. Error, if operation failed.
    */
  var error: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Output only. The id of the cluster operation.
    */
  var operationId: js.UndefOr[String | Null] = js.undefined
}
object SchemaClusterOperation {
  
  inline def apply(): SchemaClusterOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterOperation]
  }
  
  extension [Self <: SchemaClusterOperation](x: Self) {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneNull: Self = StObject.set(x, "done", null)
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdNull: Self = StObject.set(x, "operationId", null)
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
