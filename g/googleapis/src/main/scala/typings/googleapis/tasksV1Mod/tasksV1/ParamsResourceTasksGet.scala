package typings.googleapis.tasksV1Mod.tasksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTasksGet
  extends StObject
     with StandardParameters {
  
  /**
    * Task identifier.
    */
  var task: js.UndefOr[String] = js.undefined
  
  /**
    * Task list identifier.
    */
  var tasklist: js.UndefOr[String] = js.undefined
}
object ParamsResourceTasksGet {
  
  inline def apply(): ParamsResourceTasksGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTasksGet]
  }
  
  extension [Self <: ParamsResourceTasksGet](x: Self) {
    
    inline def setTask(value: String): Self = StObject.set(x, "task", value.asInstanceOf[js.Any])
    
    inline def setTaskUndefined: Self = StObject.set(x, "task", js.undefined)
    
    inline def setTasklist(value: String): Self = StObject.set(x, "tasklist", value.asInstanceOf[js.Any])
    
    inline def setTasklistUndefined: Self = StObject.set(x, "tasklist", js.undefined)
  }
}
