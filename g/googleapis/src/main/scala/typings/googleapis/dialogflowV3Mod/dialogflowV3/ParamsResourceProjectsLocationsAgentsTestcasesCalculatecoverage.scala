package typings.googleapis.dialogflowV3Mod.dialogflowV3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceProjectsLocationsAgentsTestcasesCalculatecoverage
  extends StObject
     with StandardParameters {
  
  /**
    * Required. The agent to calculate coverage for. Format: `projects//locations//agents/`.
    */
  var agent: js.UndefOr[String] = js.undefined
  
  /**
    * Required. The type of coverage requested.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object ParamsResourceProjectsLocationsAgentsTestcasesCalculatecoverage {
  
  inline def apply(): ParamsResourceProjectsLocationsAgentsTestcasesCalculatecoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceProjectsLocationsAgentsTestcasesCalculatecoverage]
  }
  
  extension [Self <: ParamsResourceProjectsLocationsAgentsTestcasesCalculatecoverage](x: Self) {
    
    inline def setAgent(value: String): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
    
    inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
