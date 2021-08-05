package typings.googleapis.dataprocV1Mod.dataprocV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The cluster operation triggered by a workflow.
  */
trait SchemaClusterOperation extends StObject {
  
  /**
    * Output only. Indicates the operation is done.
    */
  var done: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Output only. Error, if operation failed.
    */
  var error: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The id of the cluster operation.
    */
  var operationId: js.UndefOr[String] = js.undefined
}
object SchemaClusterOperation {
  
  inline def apply(): SchemaClusterOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterOperation]
  }
  
  extension [Self <: SchemaClusterOperation](x: Self) {
    
    inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
