package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstructionsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Instruction resource name, format: projects/{project_id\}/instructions/{instruction_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstructionsGet {
  
  inline def apply(): ParamsResourceProjectsInstructionsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstructionsGet]
  }
  
  extension [Self <: ParamsResourceProjectsInstructionsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
