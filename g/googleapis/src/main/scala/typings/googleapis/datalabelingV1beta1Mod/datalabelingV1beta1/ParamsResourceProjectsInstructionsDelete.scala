package typings.googleapis.datalabelingV1beta1Mod.datalabelingV1beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsInstructionsDelete
  extends StObject
     with StandardParameters {
  
  /**
    * Required. Instruction resource name, format: projects/{project_id\}/instructions/{instruction_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsInstructionsDelete {
  
  inline def apply(): ParamsResourceProjectsInstructionsDelete = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsInstructionsDelete]
  }
  
  extension [Self <: ParamsResourceProjectsInstructionsDelete](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
