package typings.googleapis.v2beta2Mod.cloudtasksV2beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Response message for leasing tasks using LeaseTasks.
  */
@js.native
trait SchemaLeaseTasksResponse extends StObject {
  
  /**
    * The leased tasks.
    */
  var tasks: js.UndefOr[js.Array[SchemaTask]] = js.native
}
object SchemaLeaseTasksResponse {
  
  @scala.inline
  def apply(): SchemaLeaseTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLeaseTasksResponse]
  }
  
  @scala.inline
  implicit class SchemaLeaseTasksResponseMutableBuilder[Self <: SchemaLeaseTasksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTasks(value: js.Array[SchemaTask]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
    
    @scala.inline
    def setTasksVarargs(value: SchemaTask*): Self = StObject.set(x, "tasks", js.Array(value :_*))
  }
}
