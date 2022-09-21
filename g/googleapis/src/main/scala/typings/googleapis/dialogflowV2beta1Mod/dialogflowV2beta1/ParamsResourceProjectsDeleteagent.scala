package typings.googleapis.dialogflowV2beta1Mod.dialogflowV2beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsDeleteagent
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The project that the agent to delete is associated with. Format: `projects/` or `projects//locations/`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsDeleteagent {
  
  inline def apply(): ParamsResourceProjectsDeleteagent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsDeleteagent]
  }
  
  extension [Self <: ParamsResourceProjectsDeleteagent](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
