package typings.googleapis.runtimeconfigV1beta1Mod.runtimeconfigV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsConfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * The name of the RuntimeConfig resource to retrieve, in the format: `projects/[PROJECT_ID]/configs/[CONFIG_NAME]`
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsConfigsGet {
  
  inline def apply(): ParamsResourceProjectsConfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsConfigsGet]
  }
  
  extension [Self <: ParamsResourceProjectsConfigsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
