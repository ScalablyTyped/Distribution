package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConfigsWaitersDelete
  extends StObject
     with StandardParameters {
  
  /**
    * The Waiter resource to delete, in the format: `projects/[PROJECT_ID]/configs/[CONFIG_NAME]/waiters/[WAITER_NAME]`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsConfigsWaitersDelete {
  
  inline def apply(): ParamsResourceProjectsConfigsWaitersDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConfigsWaitersDelete]
  }
  
  extension [Self <: ParamsResourceProjectsConfigsWaitersDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
