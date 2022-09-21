package typings.googleapis.tasksV1Mod.tasksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceTasklistsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Task list identifier.
    */
  var tasklist: js.UndefOr[String] = js.undefined
}
object ParamsResourceTasklistsDelete {
  
  inline def apply(): ParamsResourceTasklistsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceTasklistsDelete]
  }
  
  extension [Self <: ParamsResourceTasklistsDelete](x: Self) {
    
    inline def setTasklist(value: String): Self = StObject.set(x, "tasklist", value.asInstanceOf[js.Any])
    
    inline def setTasklistUndefined: Self = StObject.set(x, "tasklist", js.undefined)
  }
}
