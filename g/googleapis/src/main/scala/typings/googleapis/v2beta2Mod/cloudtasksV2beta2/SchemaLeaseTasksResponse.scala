package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaLeaseTasksResponse extends StObject {
  
  /**
    * The leased tasks.
    */
  var tasks: js.UndefOr[js.Array[SchemaTask]] = js.undefined
}
object SchemaLeaseTasksResponse {
  
  inline def apply(): SchemaLeaseTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseTasksResponse]
  }
  
  extension [Self <: SchemaLeaseTasksResponse](x: Self) {
    
    inline def setTasks(value: js.Array[SchemaTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    inline def setTasksVarargs(value: SchemaTask*): Self = StObject.set(x, "tasks", js.Array(value*))
  }
}
