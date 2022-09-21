package typings.googleapis.tasksV1Mod.tasksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTasksMove
  extends StObject
     with StandardParameters {
  
  /**
    * New parent task identifier. If the task is moved to the top level, this parameter is omitted. Optional.
    */
  var parent: js.UndefOr[String] = js.undefined
  
  /**
    * New previous sibling task identifier. If the task is moved to the first position among its siblings, this parameter is omitted. Optional.
    */
  var previous: js.UndefOr[String] = js.undefined
  
  /**
    * Task identifier.
    */
  var task: js.UndefOr[String] = js.undefined
  
  /**
    * Task list identifier.
    */
  var tasklist: js.UndefOr[String] = js.undefined
}
object ParamsResourceTasksMove {
  
  inline def apply(): ParamsResourceTasksMove = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTasksMove]
  }
  
  extension [Self <: ParamsResourceTasksMove](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPrevious(value: String): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
    
    inline def setTasklist(value: String): Self = StObject.set(x, "tasklist", value.asInstanceOf[js.Any])
    
    inline def setTasklistUndefined: Self = StObject.set(x, "tasklist", js.undefined)
  }
}
