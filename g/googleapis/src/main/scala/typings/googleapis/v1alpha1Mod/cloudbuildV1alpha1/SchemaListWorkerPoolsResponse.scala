package typings.googleapis.v1alpha1Mod.cloudbuildV1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response containing existing `WorkerPools`.
  */
trait SchemaListWorkerPoolsResponse extends StObject {
  
  /**
    * `WorkerPools` for the project.
    */
  var workerPools: js.UndefOr[js.Array[SchemaWorkerPool]] = js.undefined
}
object SchemaListWorkerPoolsResponse {
  
  @scala.inline
  def apply(): SchemaListWorkerPoolsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaListWorkerPoolsResponse]
  }
  
  @scala.inline
  implicit class SchemaListWorkerPoolsResponseMutableBuilder[Self <: SchemaListWorkerPoolsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWorkerPools(value: js.Array[SchemaWorkerPool]): Self = StObject.set(x, "workerPools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkerPoolsUndefined: Self = StObject.set(x, "workerPools", js.undefined)
    
    @scala.inline
    def setWorkerPoolsVarargs(value: SchemaWorkerPool*): Self = StObject.set(x, "workerPools", js.Array(value :_*))
  }
}
