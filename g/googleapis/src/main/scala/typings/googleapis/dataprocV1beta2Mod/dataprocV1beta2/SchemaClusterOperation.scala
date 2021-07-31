package typings.googleapis.dataprocV1beta2Mod.dataprocV1beta2

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
  
  @scala.inline
  def apply(): SchemaClusterOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaClusterOperation]
  }
  
  @scala.inline
  implicit class SchemaClusterOperationMutableBuilder[Self <: SchemaClusterOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDoneUndefined: Self = StObject.set(x, "done", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
  }
}
