package typings.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsGetagent
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The project that the agent to fetch is associated with. Format: `projects/`.
    */
  var parent: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsGetagent {
  
  inline def apply(): ParamsResourceProjectsGetagent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsGetagent]
  }
  
  extension [Self <: ParamsResourceProjectsGetagent](x: Self) {
    
    inline def setParent(value: String): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
  }
}
