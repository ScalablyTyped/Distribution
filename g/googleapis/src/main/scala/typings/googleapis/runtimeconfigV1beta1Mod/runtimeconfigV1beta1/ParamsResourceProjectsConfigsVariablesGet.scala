package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConfigsVariablesGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the variable to return, in the format: `projects/[PROJECT_ID]/configs/[CONFIG_NAME]/variables/[VARIBLE_NAME]`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsConfigsVariablesGet {
  
  inline def apply(): ParamsResourceProjectsConfigsVariablesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConfigsVariablesGet]
  }
  
  extension [Self <: ParamsResourceProjectsConfigsVariablesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
