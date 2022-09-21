package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsModelsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the model.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsModelsGet {
  
  inline def apply(): ParamsResourceProjectsModelsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsModelsGet]
  }
  
  extension [Self <: ParamsResourceProjectsModelsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
