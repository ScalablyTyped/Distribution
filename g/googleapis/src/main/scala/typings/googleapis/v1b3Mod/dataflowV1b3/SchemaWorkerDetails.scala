package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaWorkerDetails extends StObject {
  
  /**
    * Work items processed by this worker, sorted by time.
    */
  var workItems: js.UndefOr[js.Array[SchemaWorkItemDetails]] = js.undefined
  
  /**
    * Name of this worker
    */
  var workerName: js.UndefOr[String | Null] = js.undefined
}
object SchemaWorkerDetails {
  
  inline def apply(): SchemaWorkerDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWorkerDetails]
  }
  
  extension [Self <: SchemaWorkerDetails](x: Self) {
    
    inline def setWorkItems(value: js.Array[SchemaWorkItemDetails]): Self = StObject.set(x, "workItems", value.asInstanceOf[js.Any])
    
    inline def setWorkItemsUndefined: Self = StObject.set(x, "workItems", js.undefined)
    
    inline def setWorkItemsVarargs(value: SchemaWorkItemDetails*): Self = StObject.set(x, "workItems", js.Array(value*))
    
    inline def setWorkerName(value: String): Self = StObject.set(x, "workerName", value.asInstanceOf[js.Any])
    
    inline def setWorkerNameNull: Self = StObject.set(x, "workerName", null)
    
    inline def setWorkerNameUndefined: Self = StObject.set(x, "workerName", js.undefined)
  }
}
