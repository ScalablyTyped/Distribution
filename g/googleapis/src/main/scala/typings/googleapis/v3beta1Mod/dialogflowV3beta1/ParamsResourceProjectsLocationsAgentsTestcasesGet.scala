package typings.googleapis.v3beta1Mod.dialogflowV3beta1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsTestcasesGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the testcase. Format: `projects//locations//agents//testCases/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsTestcasesGet {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsTestcasesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsTestcasesGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsTestcasesGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
