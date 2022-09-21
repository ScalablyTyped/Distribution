package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsTestcasesResultsGet
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The name of the testcase. Format: `projects//locations//agents//testCases//results/`.
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsTestcasesResultsGet {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsTestcasesResultsGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsTestcasesResultsGet]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsTestcasesResultsGet](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
