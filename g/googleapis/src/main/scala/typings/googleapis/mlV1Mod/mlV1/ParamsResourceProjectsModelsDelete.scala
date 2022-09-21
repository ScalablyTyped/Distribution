package typings.googleapis.mlV1Mod.mlV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsModelsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the model.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsModelsDelete {
  
  inline def apply(): ParamsResourceProjectsModelsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsModelsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsModelsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
