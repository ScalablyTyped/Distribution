package typings.googleapis.tasksV1Mod.tasksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTasklistsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Task list identifier.
    */
  var tasklist: js.UndefOr[String] = js.undefined
}
object ParamsResourceTasklistsGet {
  
  inline def apply(): ParamsResourceTasklistsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTasklistsGet]
  }
  
  extension [Self <: ParamsResourceTasklistsGet](x: Self) {
    
    inline def setTasklist(value: String): Self = StObject.set(x, "tasklist", value.asInstanceOf[js.Any])
    
    inline def setTasklistUndefined: Self = StObject.set(x, "tasklist", js.undefined)
  }
}
