package typings.googleapis.tasksV1Mod.tasksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTasksClear
  extends StObject
     with StandardParameters {
  
  /**
    * Task list identifier.
    */
  var tasklist: js.UndefOr[String] = js.undefined
}
object ParamsResourceTasksClear {
  
  inline def apply(): ParamsResourceTasksClear = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTasksClear]
  }
  
  extension [Self <: ParamsResourceTasksClear](x: Self) {
    
    inline def setTasklist(value: String): Self = StObject.set(x, "tasklist", value.asInstanceOf[js.Any])
    
    inline def setTasklistUndefined: Self = StObject.set(x, "tasklist", js.undefined)
  }
}
