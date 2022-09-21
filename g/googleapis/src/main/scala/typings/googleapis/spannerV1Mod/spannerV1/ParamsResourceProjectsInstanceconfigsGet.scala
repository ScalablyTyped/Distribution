package typings.googleapis.spannerV1Mod.spannerV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstanceconfigsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the requested instance configuration. Values are of the form `projects//instanceConfigs/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstanceconfigsGet {
  
  inline def apply(): ParamsResourceProjectsInstanceconfigsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstanceconfigsGet]
  }
  
  extension [Self <: ParamsResourceProjectsInstanceconfigsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
